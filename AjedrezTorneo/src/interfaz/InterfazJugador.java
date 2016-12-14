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
	private Container panel_5; 
	private JTextField textField_1;
	private JComboBox<String> combodia; 
	private JComboBox<String> combomes;
	private JComboBox<String> comboanio;
	private JLabel lblNewLabel_5 ;
	private JComboBox<?> combotitulo;
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
		frame.getContentPane().setLayout(new GridLayout(10, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		
		jtexfield_nombre = new JTextField();
		frame.getContentPane().add(jtexfield_nombre);
		jtexfield_nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		frame.getContentPane().add(lblApellido);
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		
		jtexfield_apellido = new JTextField();
		frame.getContentPane().add(jtexfield_apellido);
		jtexfield_apellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("F.Nac");
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
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
		
		lblNewLabel_correo = new JLabel("Correo:");
		frame.getContentPane().add(lblNewLabel_correo);
		lblNewLabel_correo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_correo.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		
		comboBox_sexo = new JComboBox();
		frame.getContentPane().add(comboBox_sexo);
		comboBox_sexo.setModel(new DefaultComboBoxModel(new String[] {"M", "F", "Otro"}));
		comboBox_sexo.setSelectedIndex(2);
		
		JLabel lblTitulo = new JLabel("Titulo");
		frame.getContentPane().add(lblTitulo);
		lblTitulo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		combotitulo = new JComboBox();
		frame.getContentPane().add(combotitulo);
		combotitulo.setAlignmentX(Component.RIGHT_ALIGNMENT);
		combotitulo.setModel(new DefaultComboBoxModel(new String[] {"", "GMI ", "GM", "MI", "MF ", "F"}));
		
		lblNewLabel_5 = new JLabel("Pais:");
		frame.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		
		JComboBox combopais = new JComboBox(); //http://laendercode.net/es/3-letter-list.html
		frame.getContentPane().add(combopais);
		combopais.setModel(new DefaultComboBoxModel(new String[] {"", "AFG", "", "ALA", "", "ALB", "", "DZA", "", "ASM", "", "AND", "", "AGO", "", "AIA", "", "ATA", "", "ATG", "", "ARG", "", "ARM", "", "ABW", "", "AUS", "", "AUT", "", "AZE", "", "BHS", "", "BHR", "", "BGD", "", "BRB", "", "BLR", "", "BEL", "", "BLZ", "", "BEN", "", "BMU", "", "BTN", "", "BOL", "", "BES", "", "BIH", "", "BWA", "", "BVT", "", "BRA", "", "IOT", "", "VGB", "", "BRN", "", "BGR", "", "BFA", "", "BDI", "", "KHM", "", "CMR", "", "CAN", "", "CPV", "", "CYM", "", "CAF", "", "TCD", "", "CHL", "", "CHN", "", "CXR", "", "CCK", "", "COL", "", "COM", "", "COK", "", "CRI", "", "HRV", "", "CUB", "", "CUW", "", "CYP", "", "CZE", "", "COD", "", "DNK", "", "DJI", "", "DMA", "", "DOM", "", "TLS", "", "ECU", "", "EGY", "", "SLV", "", "GNQ", "", "ERI", "", "EST", "", "ETH", "", "FLK", "", "FRO", "", "FJI", "", "FIN", "", "FRA", "", "GUF", "", "PYF", "", "ATF", "", "GAB", "", "GMB", "", "GEO", "", "DEU", "", "GHA", "", "GIB", "", "GRC", "", "GRL", "", "GRD", "", "GLP", "", "GUM", "", "GTM", "", "GGY", "", "GIN", "", "GNB", "", "GUY", "", "HTI", "", "HMD", "", "HND", "", "HKG", "", "HUN", "", "ISL", "", "IND", "", "IDN", "", "IRN", "", "IRQ", "", "IRL", "", "IMN", "", "ISR", "", "ITA", "", "CIV", "", "JAM", "", "JPN", "", "JEY", "", "JOR", "", "KAZ", "", "KEN", "", "KIR", "", "XKX", "", "KWT", "", "KGZ", "", "LAO", "", "LVA", "", "LBN", "", "LSO", "", "LBR", "", "LBY", "", "LIE", "", "LTU", "", "LUX", "", "MAC", "", "MKD", "", "MDG", "", "MWI", "", "MYS", "", "MDV", "", "MLI", "", "MLT", "", "MHL", "", "MTQ", "", "MRT", "", "MUS", "", "MYT", "", "MEX", "", "FSM", "", "MDA", "", "MCO", "", "MNG", "", "MNE", "", "MSR", "", "MAR", "", "MOZ", "", "MMR", "", "NAM", "", "NRU", "", "NPL", "", "NLD", "", "ANT", "", "NCL", "", "NZL", "", "NIC", "", "NER", "", "NGA", "", "NIU", "", "NFK", "", "PRK", "", "MNP", "", "NOR", "", "OMN", "", "PAK", "", "PLW", "", "PSE", "", "PAN", "", "PNG", "", "PRY", "", "PER", "", "PHL", "", "PCN", "", "POL", "", "PRT", "", "PRI", "", "QAT", "", "COG", "", "REU", "", "ROU", "", "RUS", "", "RWA", "", "BLM", "", "SHN", "", "KNA", "", "LCA", "", "MAF", "", "SPM", "", "VCT", "", "WSM", "", "SMR", "", "STP", "", "SAU", "", "SEN", "", "SRB", "", "SCG", "", "SYC", "", "SLE", "", "SGP", "", "SXM", "", "SVK", "", "SVN", "", "SLB", "", "SOM", "", "ZAF", "", "SGS", "", "KOR", "", "SSD", "", "ESP", "", "LKA", "", "SDN", "n", "SUR", "", "SJM", "", "SWZ", "", "SWE", "", "CHE", "", "SYR", "", "TWN", "", "TJK", "", "TZA", "", "THA", "", "TGO", "", "TKL", "", "TON", "", "TTO", "", "TUN", "", "TUR", "", "TKM", "", "TCA", "", "TUV", "", "VIR", "", "UGA", "", "UKR", "", "ARE", "", "GBR", "", "USA", "", "UMI", "", "URY", "", "UZB", "", "VUT", "", "VAT", "", "VEN", "", "VNM", "", "WLF", "", "ESH", "", "YEM", "", "ZMB", "", "ZWE"}));
		
		JLabel lblNewLabel_4 = new JLabel("ELO:");
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		
		jtexfield_elo = new JTextField();
		frame.getContentPane().add(jtexfield_elo);
		jtexfield_elo.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarJugador();			
			}
		});
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
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
		jugador.setTitulo((String) combotitulo.getSelectedItem());
		jugador.setCorreo(lblNewLabel_correo.getText());
		jugador.setPais(lblNewLabel_5 .getText());
		
		
	}
	

}
