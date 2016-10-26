package interfaz;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

public class TorneoIG extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JTextField textField;
	private JLabel lblFecha;
	private JTextField textField_1;
	private JPanel botoncrear;
	private JButton btnCrear;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JTextField textField_2;
	private JLabel lblModalidad;
	private JComboBox comboBox;
	private JLabel lblAjedrezTorneo;


	/**
	 * Create the frame.
	 */
	public TorneoIG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_titulo = new JPanel();
		contentPane.add(panel_titulo);
		
		lblAjedrezTorneo = new JLabel("Ajedrez Torneo");
		panel_titulo.add(lblAjedrezTorneo);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 6, 0, 0));
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNombre);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFecha);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("Lugar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		panel_1.add(lblNewLabel);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblModalidad = new JLabel("Modalidad");
		lblModalidad.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblModalidad);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Suizo", "Round Robin"}));
		panel_2.add(comboBox);
		
		botoncrear = new JPanel();
		FlowLayout flowLayout = (FlowLayout) botoncrear.getLayout();
		contentPane.add(botoncrear);
		
		btnCrear = new JButton("Crear");
		botoncrear.add(btnCrear);
	}

}
