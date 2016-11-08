package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import logica.Partida;
import logica.Partida.Resultado;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;

public class InterfazPartida {
	private Partida partidita;

	private JFrame frmInfoPartida;

	public InterfazPartida(Partida partida) {
		partidita = partida;
		initialize();
		
		frmInfoPartida.setVisible(true);
	}
	

	private void initialize() {
		frmInfoPartida = new JFrame();
		frmInfoPartida.setType(Type.UTILITY);
		frmInfoPartida.setTitle("Info Partida");
		frmInfoPartida.setBounds(100, 100, 450, 300);
		frmInfoPartida.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmInfoPartida.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		
		JPanel PanelMesa = new JPanel();
		frmInfoPartida.getContentPane().add(PanelMesa);
		PanelMesa.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel = new JPanel();
		PanelMesa.add(panel);
		
		JPanel PanelMesa2 = new JPanel();
		PanelMesa.add(PanelMesa2);
		PanelMesa2.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		PanelMesa2.add(panel_2);
		
		JLabel NumMesa = new JLabel("Informacion Mesa "+ partidita.getMesa() + ":");
		PanelMesa2.add(NumMesa);
		
		JPanel panel_1 = new JPanel();
		PanelMesa.add(panel_1);
		
		JPanel PanelDefinicion = new JPanel();
		frmInfoPartida.getContentPane().add(PanelDefinicion);
		PanelDefinicion.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel Jugador1 = new JLabel(partidita.getJblancas().nombre);
		PanelDefinicion.add(Jugador1);
		
		JPanel PanelDefin = new JPanel();
		PanelDefinicion.add(PanelDefin);
		PanelDefin.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel Relleno = new JPanel();
		PanelDefin.add(Relleno);
		
		final JComboBox Definicion = new JComboBox();
		PanelDefin.add(Definicion);
		Definicion.setModel(new DefaultComboBoxModel(new String[] {"1/2-1/2", "1-0", "0-1"}));
		Definicion.setToolTipText("1-0\r\n0-1\r\n0-0");
		
		
		JLabel Jugador2 = new JLabel(partidita.getJnegras().nombre);
		PanelDefinicion.add(Jugador2);
		
		JPanel PanelConfirm = new JPanel();
		frmInfoPartida.getContentPane().add(PanelConfirm);
		
		JButton Confirmar = new JButton("Confirmar");
		Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if (Definicion.getSelectedIndex() == 1){
                	partidita.setResultado(Resultado.BLANCAS);
					
				} else if(Definicion.getSelectedIndex() == 2){
					partidita.setResultado(Resultado.NEGRAS);
				} else{
					partidita.setResultado(Resultado.TABLAS);
					
				}
			}
		});
		PanelConfirm.add(Confirmar);
	}


	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
