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

public class InterfazJugador {
	private Torneo tournament;
	private JTextField jtexfield_nombre;
	private JTextField jtexfield_elo;
	private JComboBox<String> comboBox_sexo;
	
	public InterfazJugador(Torneo torneo) {
		tournament = torneo;
		initialize();
	}

	private void initialize() {
		JFrame frame = new JFrame();
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
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_1.add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		panel_1.add(comboBox_2);
		
		JComboBox<String> comboanio = new JComboBox<String>();
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
		
		comboBox_sexo = new JComboBox();
		comboBox_sexo.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		comboBox_sexo.setSelectedIndex(2);
		panel_2.add(comboBox_sexo);
		
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
				RegistrarJugador();			
			}
		});
		frame.getContentPane().add(btnNewButton);
	}

	private void add(JComboBox comboanio) {
		// TODO Auto-generated method stub
		
	}
	private void RegistrarJugador(){
		Jugador jugador = new Jugador(jtexfield_nombre.getText());
		if (comboBox_sexo.getSelectedIndex()==0){
			jugador.setSexo('M');
		} else {
			jugador.setSexo('F');
		}
	//	jugador.setNacimiento( ?? );
	//	jugador.setElo( ?? );
		tournament.Participantes.add(jugador);
		JOptionPane.showMessageDialog(null, "Jugador Registrado");
	}

}
