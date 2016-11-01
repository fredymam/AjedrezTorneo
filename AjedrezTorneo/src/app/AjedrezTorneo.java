package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaz.InterfazPartida;
import interfaz.InterfazTorneo;
import logica.Partida;
import logica.Torneo;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AjedrezTorneo extends JFrame {

	private JPanel contentPane;
    private Torneo tournament;
    private Partida partidita;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjedrezTorneo frame = new AjedrezTorneo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjedrezTorneo() {
		setTitle("Ajedrez Torneo by EPET3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Torneo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nuevo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tournament==null) {
					tournament = new Torneo();
					InterfazTorneo NuevoTorneo = new InterfazTorneo(tournament); 
					NuevoTorneo.setVisible(true);					
				} else JOptionPane.showMessageDialog(null,"Torneo Creado"); // Falta implementar Abrir 
				
				//else JOptionPane.showMessageDialog(null, tournament.getNombre()); 
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mntmNewMenuItem_1.setEnabled(false);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Guardar");
		mntmNewMenuItem_2.setEnabled(false);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnJugadores = new JMenu("Jugadores");
		menuBar.add(mnJugadores);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Jugador");
		mnJugadores.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Posiciones");
		mnJugadores.add(mntmNewMenuItem_4);
		
		JMenuItem mntmResultados = new JMenuItem("Resultados");
		mntmResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partidita = new Partida();
				InterfazPartida InfoMesa = new InterfazPartida(partidita); 
				InfoMesa.setVisible(true);
			}
		});
		mnJugadores.add(mntmResultados);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
