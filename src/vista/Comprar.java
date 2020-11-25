package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Comprar extends JFrame {

	private JPanel contentPane;
	public JTextField txtCodigo;
	public JTextField txtDni;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtDni_Pagador;
	public JTextField txtTarjeta;
	public JButton btnComprar;

	public Comprar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(226, 397, 171, 51);
		contentPane.add(btnComprar);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(175, 69, 222, 27);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(35, 67, 87, 27);
		contentPane.add(lblCodigo);
		
		JLabel lblqueVueloQuiere = new JLabel("\u00BFQue vuelo quiere comprar?");
		lblqueVueloQuiere.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblqueVueloQuiere.setBounds(35, 13, 372, 43);
		contentPane.add(lblqueVueloQuiere);
		
		JLabel lblInserteSusDatos = new JLabel("Inserte sus datos");
		lblInserteSusDatos.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblInserteSusDatos.setBounds(35, 120, 372, 43);
		contentPane.add(lblInserteSusDatos);
		
		JLabel lblDni = new JLabel("D.N.I");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDni.setBounds(35, 176, 87, 27);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(35, 214, 87, 27);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellido.setBounds(35, 254, 87, 27);
		contentPane.add(lblApellido);
		
		JLabel lblDniPagador = new JLabel("D.N.I Pagador");
		lblDniPagador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDniPagador.setBounds(35, 294, 120, 27);
		contentPane.add(lblDniPagador);
		
		JLabel lblTarjeta = new JLabel("Tarjeta");
		lblTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTarjeta.setBounds(35, 333, 87, 27);
		contentPane.add(lblTarjeta);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(175, 176, 222, 27);
		contentPane.add(txtDni);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(175, 214, 222, 27);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(175, 254, 222, 27);
		contentPane.add(txtApellido);
		
		txtDni_Pagador = new JTextField();
		txtDni_Pagador.setColumns(10);
		txtDni_Pagador.setBounds(175, 294, 222, 27);
		contentPane.add(txtDni_Pagador);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setColumns(10);
		txtTarjeta.setBounds(175, 333, 222, 27);
		contentPane.add(txtTarjeta);
	}
}
