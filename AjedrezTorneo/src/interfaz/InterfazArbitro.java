package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

import logica.Arbitro;
import logica.Torneo;

@SuppressWarnings("serial")
public class InterfazArbitro extends JFrame {
	private Torneo tournament;
	private JPanel contentPane;
	private JTextField JTextField_nombre;
	private JTextField JTextField_apellido;
	private JComboBox<String> JComboBox_categoria;

	public InterfazArbitro(Torneo torneo) {
		tournament = torneo;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 256, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
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
		
		JTextField_apellido = new JTextField();
		panel_3.add(JTextField_apellido);
		JTextField_apellido.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel lblCategorias = new JLabel("Categorias:");
		panel_2.add(lblCategorias);
		
		JComboBox_categoria = new JComboBox<String>();
		JComboBox_categoria.setModel(new DefaultComboBoxModel<String>(new String[] {"A- (Mundial)", "B- (Continental)", "C- (Regional)", "D- (Inactivo)"}));
		JComboBox_categoria.setToolTipText("");
		JComboBox_categoria.setBackground(new Color(255, 255, 255));
		panel_2.add(JComboBox_categoria);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarArbitro();	
			}			
		});
		contentPane.add(btnNewButton);		
	}
	
	public void RegistrarArbitro() {
		Arbitro Referee = new Arbitro(JTextField_nombre.getText(),JTextField_apellido.getText());		
		switch (JComboBox_categoria.getSelectedIndex()) {
			case 0 : Referee.setCategoria('A');
					 break;
			case 1 : Referee.setCategoria('B');
					 break;
			case 2 : Referee.setCategoria('C');
					 break;
			case 3 : Referee.setCategoria('D');
					break;
		}
		tournament.Arbitros.add(Referee);
		JOptionPane.showMessageDialog(null, "Arbitro Registrado!");		
	}
}

