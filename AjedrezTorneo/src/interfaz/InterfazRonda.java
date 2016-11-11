package interfaz;

import logica.Ronda;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class InterfazRonda {
    private Ronda round;
	private JFrame frmInfoRonda;
	private JComboBox<String> NumRonda;

	
	public InterfazRonda(Ronda ronda) {
		round = ronda;
		initialize();
		frmInfoRonda.setVisible(true);
	}

	private void initialize() {
		frmInfoRonda = new JFrame();
		frmInfoRonda.setTitle("Informacion Ronda");
		frmInfoRonda.setBounds(100, 100, 450, 300);
		frmInfoRonda.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmInfoRonda.getContentPane().setLayout(null);
		
		JLabel lblRondaN = new JLabel("Ronda N\u00BA:");
		lblRondaN.setBounds(83, 46, 71, 14);
		frmInfoRonda.getContentPane().add(lblRondaN);
		
		NumRonda = new JComboBox<String>();
		NumRonda.setModel(new DefaultComboBoxModel(new String[] {"", "1"}));
		NumRonda.setBounds(178, 43, 50, 20);
		frmInfoRonda.getContentPane().add(NumRonda);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(258, 42, 89, 23);
		frmInfoRonda.getContentPane().add(btnCargar);
	}

	public JComboBox<String> getNumRonda() {
		return NumRonda;
	}

	public void setNumRonda(JComboBox<String> numRonda) {
		NumRonda = numRonda;
	}
}
