package interfaz;

import logica.Partida;
import logica.Ronda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
public class InterfazRonda {
	private Ronda rondita;
	private JFrame frmInfoRonda;
	private JComboBox NumRonda;
	private int ronda;
	private JPanel panel;
	

	
	public InterfazRonda(Ronda ronda) {
		rondita = ronda;
		initialize();
		frmInfoRonda.setVisible(true);
		panel.setVisible(true);
	}

	private void initialize() {
		
		frmInfoRonda = new JFrame();
		frmInfoRonda.setTitle("Informacion Ronda");
		frmInfoRonda.setBounds(100, 100, 450, 300);
		frmInfoRonda.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmInfoRonda.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		frmInfoRonda.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRondaN = new JLabel("Ronda N\u00BA:");
		panel.add(lblRondaN);
		
		NumRonda = new JComboBox();
		NumRonda.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2"}));
		panel.add(NumRonda);
		
		setRonda();
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setRonda();
			}
		});
		panel.add(btnCargar);
		
		;
	}
	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}
	public void setRonda(){
	/*	if (NumRonda.getSelectedIndex()== 1){
			for(int estado=0; estado<rondita.Partidas.size();estado++){*/
				JPanel panelsito = new JPanel();
				
				panelsito.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				JLabel mesa = new JLabel("Mesa1 ");
				JLabel blancas = new JLabel(" Mana");//rondita.Partidas.get(ronda).getJblancas().getNombre());
				JComboBox result = new JComboBox();
				result.setModel(new DefaultComboBoxModel(new String[] {"","1-0","0-1","1/2-1/2" }));;
				JLabel negras = new JLabel("Jugador2"); 
				panelsito.add(mesa);
				panelsito.add(blancas);
				panelsito.add(result);
				panelsito.add(negras);
				frmInfoRonda.getContentPane().add(panelsito);
				
/*			}
		/*}
		else if(NumRonda.getSelectedIndex()== 2){
			JOptionPane.showMessageDialog( null, "aun no existe");
		}else {
			JOptionPane.showMessageDialog( null, "Seleccione una Ronda");
		}*/
	}

}
