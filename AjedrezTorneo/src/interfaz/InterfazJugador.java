package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import logica.Jugador;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class InterfazJugador {

	private JFrame frame;
	private JTextField jtexfield_nombre;
	private JTextField jtexfield_elo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJugador window = new InterfazJugador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazJugador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 228);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(6, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Jugador");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		panel.add(lblNewLabel_1);
		
		jtexfield_nombre = new JTextField();
		panel.add(jtexfield_nombre);
		jtexfield_nombre.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("F.Nac");
		panel_1.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		panel_1.add(comboBox_2);
		
		JComboBox comboanio = new JComboBox();
		Calendar Hoy = Calendar.getInstance();
		for(int f= Hoy.get(Calendar.YEAR);f>=1900;f--) {	
            comboanio.addItem(String.valueOf(f));
        }
        add(comboanio);
		panel_1.add(comboanio);
		
	 
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		panel_2.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ELO:");
		panel_3.add(lblNewLabel_4);
		
		jtexfield_elo = new JTextField();
		panel_3.add(jtexfield_elo);
		jtexfield_elo.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jugador jugador = new Jugador(jtexfield_nombre.getText());
				//jugador = new Jugador(jtexfield_elo.getText());
				
				
			}
		});
		frame.getContentPane().add(btnNewButton);
	}

	private void add(JComboBox comboanio) {
		// TODO Auto-generated method stub
		
	}

}
