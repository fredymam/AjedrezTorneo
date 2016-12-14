package interfaz;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

import logica.Jugador;
import logica.Torneo;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class InterfazJugador {
	private Torneo tournament;
	private JTextField jtexfield_nombre;
	private JTextField jtexfield_elo;
	private JComboBox<String> comboBox_sexo;
	private JTextField jtexfield_apellido;
	private JComboBox<String> comboBox_titulo;
	private Container panel_5; 
	private JTextField textField_1;
	private JComboBox<String> combodia; 
	private JComboBox<String> combomes;
	private JComboBox<String> comboanio;
	private JLabel lblNewLabel_5 ;
	private JComboBox combotitulo;
	private JLabel lblNewLabel_correo; 
	
	
	
	
	public InterfazJugador(Torneo torneo) {
		tournament = torneo;
		initialize();
	}

	private void initialize() {
		JFrame frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 348, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(9, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("JUGADOR");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		panel.add(lblNewLabel_1);
		
		jtexfield_nombre = new JTextField();
		panel.add(jtexfield_nombre);
		jtexfield_nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		panel.add(lblApellido);
		
		jtexfield_apellido = new JTextField();
		panel.add(jtexfield_apellido);
		jtexfield_apellido.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("F.Nac");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		panel_1.add(lblNewLabel_2);
		
		combodia = new JComboBox<String>();
		combodia.setModel(new DefaultComboBoxModel(new String[] {"DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_1.add(combodia);
		
		combomes = new JComboBox<String>();
		combomes.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		panel_1.add(combomes);
		
		comboanio = new JComboBox<String>();
		Calendar Hoy = Calendar.getInstance();
		for(int f= Hoy.get(Calendar.YEAR);f>=1900;f--) {	
            comboanio.addItem(String.valueOf(f));
        }
        add(comboanio);
		panel_1.add(comboanio); 
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		panel_2.add(lblNewLabel_3);
		
		comboBox_sexo = new JComboBox();
		comboBox_sexo.setModel(new DefaultComboBoxModel(new String[] {"M", "F", "Otro"}));
		comboBox_sexo.setSelectedIndex(2);
		panel_2.add(comboBox_sexo);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ELO:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		panel_3.add(lblNewLabel_4);
		
		jtexfield_elo = new JTextField();
		panel_3.add(jtexfield_elo);
		jtexfield_elo.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarJugador();			
			}
		});
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblTitulo);
		
		combotitulo = new JComboBox();
		combotitulo.setAlignmentX(Component.RIGHT_ALIGNMENT);
		combotitulo.setModel(new DefaultComboBoxModel(new String[] {"", "GMI ", "GM", "MI", "MF ", "F"}));
		panel_4.add(combotitulo);
		
		JPanel panel_6 = new JPanel();
		frame.getContentPane().add(panel_6);
		
		lblNewLabel_5 = new JLabel("Pais:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		panel_6.add(lblNewLabel_5);
		
		JComboBox combopais = new JComboBox(); //http://laendercode.net/es/3-letter-list.html
		panel_6.add(combopais);
		
		JPanel panel_7 = new JPanel();
		frame.getContentPane().add(panel_7);
		
		lblNewLabel_correo = new JLabel("Correo:");
		lblNewLabel_correo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_correo.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		panel_7.add(lblNewLabel_correo);
		
		textField_1 = new JTextField();
		panel_7.add(textField_1);
		textField_1.setColumns(10);
		frame.getContentPane().add(btnNewButton);
		//frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, panel, lblNewLabel_1, jtexfield_nombre, lblApellido, jtexfield_apellido, panel_1, lblNewLabel_2, comboBox_1, comboBox_2, comboanio, panel_2, lblNewLabel_3, comboBox_sexo, panel_3, lblNewLabel_4, jtexfield_elo, btnNewButton}));
	}

	private void add(JComboBox comboanio) {
		
		
	}
	
	private void RegistrarJugador(){
		Jugador jugador = new Jugador(jtexfield_nombre.getText());
		jugador.setApellido(jtexfield_apellido.getText());
		
		
		if (comboBox_sexo.getSelectedIndex()==0){
			jugador.setSexo('M');
		} else jugador.setSexo('F');
		tournament.Participantes.add(jugador);
		JOptionPane.showMessageDialog(null, "Jugador Registrado");
		
		jugador.setNacimiento(combodia.getSelectedItem().toString()+"/"+combomes.getSelectedItem().toString()+"/"+comboanio.getSelectedItem().toString());
		jugador.setElo(Integer.parseInt(jtexfield_elo.getText()));
		jugador.setTitulo((String) comboBox_titulo.getSelectedItem());
		jugador.setCorreo(lblNewLabel_correo.getText());
		jugador.setPais(lblNewLabel_5 .getText());
		
		
		JOptionPane.showMessageDialog(null, "Jugador Registrado");
	}
	

}
