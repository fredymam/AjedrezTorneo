package interfaz;
//implements Comparator {


// public int compareto (jugador rival) {
//	 return nombre.compareto(rivalnombre);
//} 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class InterfazListadoJugadores extends JFrame {
	private JPanel contentPane;        // Panel Contenedor 
	private JTable table;              // Tabla Visual
    private JScrollPane scrollPane;	   // Scrollbar (Barras de desplazamiento)
    private JLabel lblPosiciones;      // Titulo
    private JPanel panel;
    private JButton btnAgregar;
    private JButton btnEliminar;
  
	public InterfazListadoJugadores(Torneo torneo) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 427, 373); // Tamaño Ventana
		
		contentPane = new JPanel();    // Panel Principal -> body
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblPosiciones = new JLabel("Posiciones");
		contentPane.add(lblPosiciones);
		lblPosiciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPosiciones.setHorizontalAlignment(SwingConstants.CENTER);
		
		scrollPane = new JScrollPane();  // Barra de desplazamiento
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setToolTipText("");
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(torneo.getScore().tablaDatos);
		table.setBackground(new Color(250, 235, 215));
		scrollPane.setViewportView(table);
		setVisible(true);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		}
		);
		//panel.setLayout(new GridLayout(4, 1, 0, 0));
		//panel.add(btnAgregar);
		
		btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		

		setVisible(true);
	}

	protected void InterfazJugador() {
		// TODO Auto-generated method stub
		
	}
}
