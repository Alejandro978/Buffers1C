package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestionDatos {

	public GestionDatos() {

	}

	//TODO: Implementa una funci�n para abrir ficheros
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
	//TODO: Implementa una funci�n para cerrar ficheros
	public void cerrarFichero(FileReader f1) {
		try {
			f1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la funci�n
		
		
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
		//TODO: Implementa la funci�n
		//Lo primero ser� crear una cadena vacia que m�s adelante la igualaremos a la cadena de texto que introduzcamos por telcado	
		String cadena1;
		//Necesitaremos un contador para cada pasada contar en n�mero de aparici�n est�
		int cont = 1;
	//El ejercicio pide que si se marca el checkbox primera_aparici�n diga la primera aparici�n de la palabra , ya que si no tuvieramos un IF que m�s adelante explicaremos
		//Nos devolver�a siempre la �ltima vez que aparece en el fichero.
		boolean primera_Apa=false;
		//Esta ser�a la variable que nos dir�a en que l�nea aparece por 1a vez
		int prim=0;
		//Esta seria la variable que nos dir�a en que l�ne aparece por �ltima vez
		int ultim=0;
		
		//Abrimos el fileReader que nos lee letra por letra el fichero
		FileReader f1 = new FileReader(fichero1);
		//Envolvemos el fileReader con un BufferedReader que nos lee l�nea a l�nea el fichero
		BufferedReader bf1 = new BufferedReader(f1);
		
		//Igualamos la cadena1 a la palabra que est� en la l�nea y si es distintia de null entramos
		while((cadena1 = bf1.readLine()) != null) {
			//Si la cadena1 es igual que la palabra entra
			if(cadena1.equals(palabra)) {
				//Si primera_apa es false entra ya que vamos a darle valor a prim que es la 1a aprici�n de la palabra en el fichero
				if(primera_Apa == false) {
					prim =cont;
					ultim=cont;
					primera_Apa=true;
				}
				//Si ya la ha encontrado una vez , pasar� de hacer le if de arriba por que primera_Apa ya estar� en true
				//Por lo que si lo que queremos es saber la ultima aparici�n de la palabra por que el checkbox no est� marcado le seguimos igualando
				//La ultima aparici�n de la palabra a ultim.
				else {
					ultim=cont;
				}
			}
			//Cada pasada del while suma 1 al contador con lo que sabemos en todo momento en que l�nea estamos del fichero.
			cont ++;
		}
		//Una vez acaba de leer las l�neas de texto del fichero
		//Si el checbox est� marcado , devuelve la primera l�nea de aparici�n
		if(primera_aparicion == true) {
			return prim;
		}
		//De lo contrar�o devuelve la �ltima l�nea de aparici�n
		else {
			return ultim;
		}
		
	}	

}
