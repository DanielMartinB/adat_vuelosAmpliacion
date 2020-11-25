package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mongo;
import modelo.Vuelos;
import vista.Cancelar;
import vista.Comprar;
import vista.Vista;

public class Controlador implements ActionListener {
	
	private Cancelar vistaCancelar;
	private Comprar vistaComprar;
	private Vuelos vuelo;
	private Mongo mongo;
	private Vista vista;
	
	public Controlador(Vuelos vuelo, Mongo mongo, Vista vista, Comprar vistaComprar, Cancelar vistaCancelar) {
		this.vuelo = vuelo;
		this.mongo = mongo;
		this.vista = vista;
		this.vistaComprar = vistaComprar;
		this.vistaCancelar = vistaCancelar;
		this.vista.btnMostrar.addActionListener(this);
		this.vista.btnComprar.addActionListener(this);
		this.vista.btnCancelar.addActionListener(this);
		this.vistaComprar.btnComprar.addActionListener(this);
		this.vistaCancelar.btnBorrar.addActionListener(this);
	}
	
	public void iniciar() {
		vista.setTitle("");
		vista.setLocation(0,0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vista.btnMostrar) {
			mongo.mostrar();
		}
		
		if(e.getSource() == vista.btnComprar) {
			vistaComprar.setVisible(true);
			vistaComprar.setLocation(0, 0);
		}
		
		if(e.getSource() == vista.btnCancelar) {
			vistaCancelar.setVisible(true);
			vistaCancelar.setLocation(0, 0);
		}
		
		if(e.getSource() == vistaComprar.btnComprar) {
			vuelo.setCodigo_vuelo(vistaComprar.txtCodigo.getText());
			vuelo.setDni(vistaComprar.txtDni.getText());
			vuelo.setApellido(vistaComprar.txtApellido.getText());
			vuelo.setNombre(vistaComprar.txtNombre.getText());
			vuelo.setDni_pagador(vistaComprar.txtDni_Pagador.getText());
			vuelo.setTarjeta(vistaComprar.txtTarjeta.getText());
			
			if(mongo.comprarVuelo(vuelo)) {
				JOptionPane.showMessageDialog(null, "Modificado correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al modificar");
				limpiar();
			}
			
		}
		
		if(e.getSource() == vistaCancelar.btnBorrar) {
			vuelo.setCodigo_vuelo(vistaCancelar.txtCodigoVuelo.getText());
			vuelo.setCodigo_venta(vistaCancelar.txtCodigoVenta.getText());
			
			if(mongo.cancelarVuelo(vuelo)) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
				limpiar();
			}
		}
	}
	
	public void limpiar() {
		vistaComprar.txtApellido.setText(null);
		vistaComprar.txtCodigo.setText(null);
		vistaComprar.txtDni.setText(null);
		vistaComprar.txtDni_Pagador.setText(null);
		vistaComprar.txtNombre.setText(null);
		vistaComprar.txtTarjeta.setText(null);
		vistaCancelar.txtCodigoVenta.setText(null);
		vistaCancelar.txtCodigoVuelo.setText(null);
		vistaCancelar.txtDni.setText(null);
	}

}
