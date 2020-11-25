package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnComprar;
	public JButton btnMostrar;
	public JButton btnCancelar;
	public JButton btnModificar;

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnMostrar = new JButton("MOSTRAR VUELOS");
		btnMostrar.setBounds(52, 49, 185, 60);
		contentPane.add(btnMostrar);
		
		btnComprar = new JButton("COMPRAR VUELOS");
		btnComprar.setBounds(369, 49, 185, 60);
		contentPane.add(btnComprar);
		
		btnCancelar = new JButton("CANCELAR VUELO");
		btnCancelar.setBounds(52, 215, 185, 60);
		contentPane.add(btnCancelar);
		
		btnModificar = new JButton("MODIFICAR VUELO");
		btnModificar.setBounds(369, 215, 185, 60);
		contentPane.add(btnModificar);
	}
}
