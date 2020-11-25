package main;

import java.io.IOException;

import controlador.Controlador;
import modelo.Mongo;
import modelo.Vuelos;
import vista.Cancelar;
import vista.Comprar;
import vista.Vista;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Vista vista = new Vista();
		Cancelar vistaCancelar = new Cancelar();
		Comprar vistaComprar = new Comprar();
		Mongo mongo = new Mongo();
		Vuelos vuelo = new Vuelos();
		Controlador control = new Controlador(vuelo, mongo, vista, vistaComprar, vistaCancelar);
		control.iniciar();
		vista.setVisible(true);
	}

}
