package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestionDatos {

	public GestionDatos() {

	}

	//TODO: Implementa una función para abrir ficheros
	public FileReader crearFichero (String fichero1) {
		FileReader f1 = null;
		try {
			f1 = new FileReader(fichero1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f1;
	}	
	//TODO: Implementa una función para cerrar ficheros
	public void cerrarFichero(FileReader f1) {
		try {
			f1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la función
		
		
		FileReader f1 = crearFichero(fichero1);
		FileReader f2 = crearFichero(fichero2);
		int a, b;

		while (((a = f1.read()) != -1) && ((b = f2.read()) != -1)) {
			if (a != b) {
				cerrarFichero(f1);
				cerrarFichero(f2);
				return false;
			}
		}

		if (((a = f1.read()) == -1) && ((b = f2.read()) == -1)) {
			cerrarFichero(f1);
			cerrarFichero(f2);
			return true;
		} else {
			
			return false;
		}

	}
	
	public int buscarPalabra (String fichero1, String palabra, boolean primera_aparicion) throws IOException{
		//TODO: Implementa la función
		//Lo primero será crear una cadena vacia que más adelante la igualaremos a la cadena de texto que introduzcamos por telcado	
		String cadena1;
		//Necesitaremos un contador para cada pasada contar en número de aparición está
		int cont = 1;
	//El ejercicio pide que si se marca el checkbox primera_aparición diga la primera aparición de la palabra , ya que si no tuvieramos un IF que más adelante explicaremos
		//Nos devolvería siempre la última vez que aparece en el fichero.
		boolean primera_Apa=false;
		//Esta sería la variable que nos diría en que línea aparece por 1a vez
		int prim=0;
		//Esta seria la variable que nos diría en que líne aparece por última vez
		int ultim=0;
		
		//Abrimos el fileReader que nos lee letra por letra el fichero
		FileReader f1 = new FileReader(fichero1);
		//Envolvemos el fileReader con un BufferedReader que nos lee línea a línea el fichero
		BufferedReader bf1 = new BufferedReader(f1);
		
		//Igualamos la cadena1 a la palabra que esté en la línea y si es distintia de null entramos
		while((cadena1 = bf1.readLine()) != null) {
			//Si la cadena1 es igual que la palabra entra
			if(cadena1.equals(palabra)) {
				//Si primera_apa es false entra ya que vamos a darle valor a prim que es la 1a aprición de la palabra en el fichero
				if(primera_Apa == false) {
					prim =cont;
					ultim=cont;
					primera_Apa=true;
				}
				//Si ya la ha encontrado una vez , pasará de hacer le if de arriba por que primera_Apa ya estará en true
				//Por lo que si lo que queremos es saber la ultima aparición de la palabra por que el checkbox no está marcado le seguimos igualando
				//La ultima aparición de la palabra a ultim.
				else {
					ultim=cont;
				}
			}
			//Cada pasada del while suma 1 al contador con lo que sabemos en todo momento en que línea estamos del fichero.
			cont ++;
		}
		//Una vez acaba de leer las líneas de texto del fichero
		//Si el checbox está marcado , devuelve la primera línea de aparición
		if(primera_aparicion == true) {
			return prim;
		}
		//De lo contrarío devuelve la última línea de aparición
		else {
			return ultim;
		}
		
	}	

}
