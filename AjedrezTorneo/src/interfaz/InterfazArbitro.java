package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import logica.Arbitro;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class InterfazArbitro extends JFrame {

	private JPanel contentPane;
	private JTextField JTextField_nombre;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public InterfazArbitro() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 256, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Acreditaci\u00F3n Arbitro");
		panel_1.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		panel.add(lblNewLabel);
		
		JTextField_nombre = new JTextField();
		panel.add(JTextField_nombre);
		JTextField_nombre.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		panel_3.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel lblCategorias = new JLabel("Categorias:");
		panel_2.add(lblCategorias);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A- (Mundial)", "B- (Continental)", "C- (Regional)", "D- (Inactivo)"}));
		comboBox.setToolTipText("");
		comboBox.setBackground(new Color(255, 255, 255));
		panel_2.add(comboBox);
		panel_2.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblCategorias, comboBox}));

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Arbitro Referee = new Arbitro();
					Referee.nombre = JTextField_nombre.getText();
							
				}
			
		});
		contentPane.add(btnNewButton);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel_1, lblNewLabel_1, panel, lblNewLabel, editnombre, panel_2, lblCategorias, comboBox, btnNewButton}));
	}

}
