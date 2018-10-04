package model;

import java.io.Serializable;

public class Libro implements Serializable {
	
	int identificador;
	int añoPublicacion;
	int numeroPaginas;
	String titulo;
	String autor;
	String editor;

	//Constructor vacio:
	public Libro(){
		}
//Constructor entero:
	public Libro (int identificador, int añoPublicacion, int numeroPaginas, String titulo, String autor, String editor) {
		this.identificador=identificador;
		this.añoPublicacion=añoPublicacion;
		this.numeroPaginas=numeroPaginas;
		this.titulo=titulo;
		this.autor=autor;
		this.editor=editor;
		
	}
	//Setters:
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
}
