package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class InterfazRonda {

	private JFrame frame;

	
	public InterfazRonda() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
