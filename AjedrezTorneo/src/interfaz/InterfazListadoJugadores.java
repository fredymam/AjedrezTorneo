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
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import logica.ListadoJugadores;

@SuppressWarnings("serial")
public class InterfazListadoJugadores extends JFrame {
	private JPanel contentPane;        // Panel Contenedor 
	private JTable table;              // Tabla Visual
    private JScrollPane scrollPane;	   // Scrollbar (Barras de desplazamiento)
    private JLabel lblPosiciones;      // Titulo
    private JButton Agregar;
    private JButton Eliminar;
  
	public InterfazListadoJugadores(Torneo torneo) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 427, 373); // Tamaño Ventana
		
		contentPane = new JPanel();    // Panel Principal -> body
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblPosiciones = new JLabel("Posiciones");
		contentPane.add(lblPosiciones);
		lblPosiciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPosiciones.setHorizontalAlignment(SwingConstants.CENTER);
		
		Eliminar = new JButton("Eliminar");
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPane = new JScrollPane();  // Barra de desplazamiento
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setToolTipText("");
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
		
		table = new JTable(new DefaultTableModel(
			new Object[][] {
				{null, null, "", "", ""},
			},
			new String[] {
				"Nombre", "Categoria", "Sexo", "Elo", "Fecha de nacimiento"
			}
		));   // Tabla visual del listado de jugadores y posiciones
		table.setToolTipText("");
		scrollPane.setViewportView(table);
		contentPane.add(Eliminar);
		
		Agregar = new JButton("Agregar");
		Agregar.addActionListener(new ActionListener()) {
		contentPane.add(Agregar);
		

		setVisible(true);
	}
}
