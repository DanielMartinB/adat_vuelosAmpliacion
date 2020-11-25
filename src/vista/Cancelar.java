package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Cancelar extends JFrame {

	private JPanel contentPane;
	public JTextField txtDni;
	public JTextField txtCodigoVuelo;
	public JTextField txtCodigoVenta;
	public JButton btnBorrar;

	public Cancelar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInserteSusDatos = new JLabel("INSERTE SUS DATOS");
		lblInserteSusDatos.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblInserteSusDatos.setBounds(162, 25, 277, 45);
		contentPane.add(lblInserteSusDatos);
		
		JLabel lblCodigo = new JLabel("Codigo vuelo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(35, 100, 119, 27);
		contentPane.add(lblCodigo);
		
		JLabel lblDni = new JLabel("D.N.I");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDni.setBounds(35, 176, 87, 27);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(175, 176, 222, 27);
		contentPane.add(txtDni);
		
		txtCodigoVuelo = new JTextField();
		txtCodigoVuelo.setColumns(10);
		txtCodigoVuelo.setBounds(175, 104, 222, 27);
		contentPane.add(txtCodigoVuelo);
		
		JLabel lblCodigoVenta = new JLabel("Codigo venta:");
		lblCodigoVenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigoVenta.setBounds(35, 252, 119, 27);
		contentPane.add(lblCodigoVenta);
		
		txtCodigoVenta = new JTextField();
		txtCodigoVenta.setColumns(10);
		txtCodigoVenta.setBounds(175, 254, 222, 27);
		contentPane.add(txtCodigoVenta);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(225, 347, 172, 66);
		contentPane.add(btnBorrar);
	}
}
