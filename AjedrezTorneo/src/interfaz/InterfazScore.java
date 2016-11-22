package interfaz;

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
import java.awt.Color;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class InterfazScore extends JFrame {
	private JPanel contentPane;        // Panel Contenedor 
	private JTable table;              // Tabla Visual
    private JScrollPane scrollPane;	   // Scrollbar (Barras de desplazamiento)
    private JLabel lblPosiciones;      // Titulo
  
	public InterfazScore(Torneo torneo) {
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
		
		table = new JTable(torneo.getScore().tablaDatos);
		table.setBackground(new Color(250, 235, 215));
		scrollPane.setViewportView(table);
		setVisible(true);
	}
}
