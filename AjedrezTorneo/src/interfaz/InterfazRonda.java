package interfaz;

import logica.Ronda;
import logica.Torneo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;

public class InterfazRonda {
	private JFrame frmInfoRonda;
	private JPanel panelRondas;	
	private JComboBox<String> comboNumRonda;
	private JButton btnCargar;
	private JButton btnSalir;
	
	private Torneo torneo;
	
	public InterfazRonda(Torneo torneo) {
		this.torneo = torneo;
		initialize();
		frmInfoRonda.setVisible(true);
	}
	
	private void initialize() {		
		frmInfoRonda = new JFrame();
		frmInfoRonda.setTitle("Informacion Ronda");
		frmInfoRonda.setBounds(100, 100, 450, 300);
		frmInfoRonda.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmInfoRonda.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panelRondas = new JPanel();  // PANEL de Pareo
		panelRondas.setBackground(new Color(0, 191, 255));
		frmInfoRonda.getContentPane().add(panelRondas);
		panelRondas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRondaN = new JLabel("Ronda N\u00BA:"); // Etiqueta
		panelRondas.add(lblRondaN);
		
		comboNumRonda = new JComboBox<String>();
		comboNumRonda.setForeground(new Color(0, 255, 255));
		for(int i=1;i<=torneo.getNroRondas();i++) {	
            comboNumRonda.addItem(String.valueOf(i));
        }		
		comboNumRonda.setSelectedIndex(0);
		panelRondas.add(comboNumRonda);
		
	
		btnCargar = new JButton("Cargar");  // Boton Cargar
		btnCargar.setBackground(new Color(0, 139, 139));
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pareoRonda();				
			}
		});
		panelRondas.add(btnCargar);
		
		btnSalir = new JButton("Cerrar");  // Boton Exit
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panelRondas.add(btnSalir);
	}
   
	public void pareoRonda(){ 
		Ronda ronda;
	    int numRonda = comboNumRonda.getSelectedIndex();
		if (torneo.getActualRonda()==numRonda) {
			ronda = torneo.NuevaRonda();
		} else ronda = torneo.getRonda(numRonda);			
		
		for(int i=0; i<ronda.Partidas.size(); i++) {
			JPanel panelsito = new JPanel();
			panelsito.setBackground(new Color(0, 191, 255));
			panelsito.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			JLabel lblmesa = new JLabel("Mesa: "+ronda.Partidas.get(i).getMesa());
			JLabel lblblancas = new JLabel(ronda.Partidas.get(i).getJblancas().getNombre());
			JComboBox<String> comboresult = new JComboBox<String>();
			comboresult.setModel(new DefaultComboBoxModel(new String[] {"","1-0","0-1","1/2-1/2" }));
			comboresult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// Guardar Resultado o crear ventana Interfaz Ronda
				}
			});			
			JLabel lblnegras = new JLabel(ronda.Partidas.get(i).getJnegras().getNombre());
			panelsito.add(lblmesa);
			panelsito.add(lblblancas);
		    panelsito.add(comboresult);
			panelsito.add(lblnegras);
			frmInfoRonda.getContentPane().add(panelsito); 
			frmInfoRonda.validate();			
		}
	}
	

}
