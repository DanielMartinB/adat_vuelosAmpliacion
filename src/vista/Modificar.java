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

public class Modificar extends JFrame {

	private JPanel contentPane;
	public JTextField txtCodigoVuelo;
	private JTextField txtDni;
	private JTextField txtNuevoNombre;
	private JTextField txtNuevoApellido;
	private JTextField txtNuevoDni;

	public Modificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblqueBilleteQuiere = new JLabel("\u00BFQue billete quiere modificar?");
		lblqueBilleteQuiere.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblqueBilleteQuiere.setBounds(12, 13, 397, 70);
		contentPane.add(lblqueBilleteQuiere);
		
		JLabel lblCodigo = new JLabel("Codigo vuelo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(12, 84, 119, 27);
		contentPane.add(lblCodigo);
		
		txtCodigoVuelo = new JTextField();
		txtCodigoVuelo.setColumns(10);
		txtCodigoVuelo.setBounds(130, 86, 142, 27);
		contentPane.add(txtCodigoVuelo);
		
		JLabel lblDni = new JLabel("D.N.I:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDni.setBounds(314, 84, 72, 27);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(368, 86, 142, 27);
		contentPane.add(txtDni);
		
		JLabel lblCamposAModificar = new JLabel("Campos a modificar");
		lblCamposAModificar.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCamposAModificar.setBounds(12, 133, 397, 70);
		contentPane.add(lblCamposAModificar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(12, 203, 72, 27);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellido.setBounds(12, 243, 72, 27);
		contentPane.add(lblApellido);
		
		JLabel lblDni_3 = new JLabel("D.N.I:");
		lblDni_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDni_3.setBounds(12, 286, 72, 27);
		contentPane.add(lblDni_3);
		
		txtNuevoNombre = new JTextField();
		txtNuevoNombre.setColumns(10);
		txtNuevoNombre.setBounds(96, 203, 142, 27);
		contentPane.add(txtNuevoNombre);
		
		txtNuevoApellido = new JTextField();
		txtNuevoApellido.setColumns(10);
		txtNuevoApellido.setBounds(96, 243, 142, 27);
		contentPane.add(txtNuevoApellido);
		
		txtNuevoDni = new JTextField();
		txtNuevoDni.setColumns(10);
		txtNuevoDni.setBounds(96, 286, 142, 27);
		contentPane.add(txtNuevoDni);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(278, 354, 171, 70);
		contentPane.add(btnModificar);
	}

}
