package interfaz;
//implements Comparator {


// public int compareto (jugador rival) {
//	 return nombre.compareto(rivalnombre);
//} 

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Torneo;
import javax.swing.JComboBox;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InterfazListadoJugadores extends JFrame {
	private JPanel contentPane;        // Panel Contenedor 
	private JTable table;              // Tabla Visual
    private JScrollPane scrollPane;	   // Scrollbar (Barras de desplazamiento)
    private JLabel lblPosiciones;      // Titulo
    private JPanel panel;
    private JComboBox comboBox;
  
	public InterfazListadoJugadores(Torneo torneo) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 427, 373); // Tamaño Ventana
		
		contentPane = new JPanel();    // Panel Principal -> body
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblPosiciones = new JLabel("Posiciones"); // Etiqueta de Titulo
		lblPosiciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPosiciones.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPosiciones, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();  // Barra de desplazamiento
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(torneo.getScore().tablaDatos);   // Tabla visual del listado de jugadores y posiciones
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
		comboBox = new JComboBox();
		scrollPane.setColumnHeaderView(comboBox);
		setVisible(true);
	}
}
