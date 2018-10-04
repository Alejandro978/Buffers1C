package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.*;
import view.*;

public class GestionEventos {

	private GestionDatos model;
	private LaunchView view;
	private ActionListener actionListener_comparar, actionListener_buscar;

	public GestionEventos(GestionDatos model, LaunchView view) {
		this.model = model;
		this.view = view;
	}

	//Desde aqu� llamamos a 2 funciones 1�Comparar contenido 2� Buscar palabra:
	public void contol() {
		//1� La funci�n de comparar contenido:
		actionListener_comparar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// TODO: Llamar a la funci�n call_compararContenido
				//Este m�todo devuelve boolean por lo que si es verdadero son iguales y si es falso son distintos los ficheros
				if(call_compararContenido()) {
					view.getTextArea().setText("Los ficheros son iguales");
				}
				else {
					view.getTextArea().setText("Los archivos son diferentes");
				}
			}
		};
		view.getComparar().addActionListener(actionListener_comparar);
		//2� L fuinci�n de buscar Palabra
		actionListener_buscar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// TODO: Llamar a la funci�n call_buscarPalabra
				//La funci�n nos devuelve un int , que indicar� la parici�n de la palabra que estamos buscando:
				view.getTextArea().setText("L�nea de aparici�n "+ call_buscarPalabra());
			}
		};
		view.getBuscar().addActionListener(actionListener_buscar);
	}

	private boolean call_compararContenido() {

		// TODO: Llamar a la funci�n compararContenido de GestionDatos
		// TODO: Gestionar excepciones
		//Recordar que para poder hacer el get y set siempre hay que tener los getters y setters en el apartado de LaunchView para coger el text...
		try {
			return model.compararContenido(view.getFichero1().getText(),view.getFichero2().getText());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private int call_buscarPalabra() {

		// TODO: Llamar a la funci�n buscarPalabra de GestionDatos
		// TODO: Gestionar excepciones
		//Recordar que para poder hacer el get y set siempre hay que tener los getters y setters en el apartado de LaunchView para coger el text...
		try {
			return model.buscarPalabra(view.getFichero1().getText(),view.getPalabra().getText(),view.getPrimera().isSelected());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
	}

}
