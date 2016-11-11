package interfaz;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;

import logica.Partida;
import logica.Partida.Resultado;


public class InterfazPartida {
	private Partida Match;
	private JFrame frmInfoPartida;
	private JComboBox<String> Definicion;

	public InterfazPartida(Partida partida) {
		Match = partida;
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
		
		JLabel NumMesa = new JLabel("Informacion Mesa "+ Match.getMesa() + ":");
		PanelMesa2.add(NumMesa);

		JPanel panel_1 = new JPanel();
		PanelMesa.add(panel_1);
		
		JPanel PanelDefinicion = new JPanel();
		frmInfoPartida.getContentPane().add(PanelDefinicion);
		PanelDefinicion.setLayout(new GridLayout(1, 3, 0, 0));

		JLabel Jugador1 = new JLabel(Match.getJblancas().getNombre());
		PanelDefinicion.add(Jugador1); 		
		
		JPanel PanelDefin = new JPanel();
		PanelDefinicion.add(PanelDefin);
		PanelDefin.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel Relleno = new JPanel();
		PanelDefin.add(Relleno);
		
		Definicion = new JComboBox<String>();
		PanelDefin.add(Definicion);
		Definicion.setModel(new DefaultComboBoxModel<String>(new String[] {"1/2-1/2", "1-0", "0-1"}));
		Definicion.setToolTipText("1-0\r\n0-1\r\n0-0");
		
		
		JLabel Jugador2 = new JLabel(Match.getJnegras().getNombre());
		PanelDefinicion.add(Jugador2);
		
		JPanel PanelConfirm = new JPanel();
		frmInfoPartida.getContentPane().add(PanelConfirm);
		
		JButton Confirmar = new JButton("Confirmar");
		Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                setResultado();
			}
		});
		PanelConfirm.add(Confirmar);
	}
	
	public void setResultado() {
		if (Definicion.getSelectedIndex() == 1){
        	Match.setResultado(Resultado.BLANCAS);
			
		} else if(Definicion.getSelectedIndex() == 2){
			Match.setResultado(Resultado.NEGRAS);
		} else {
			Match.setResultado(Resultado.TABLAS);			
		}
		JOptionPane.showMessageDialog(null, "Registrado");
		System.exit(0);
		// Cerrar ventana --> hint: invisible & dispose
	}

}
