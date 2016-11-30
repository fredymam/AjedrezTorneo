package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaz.InterfazListadoJugadores;
import interfaz.InterfazPartida;
import interfaz.InterfazScore;
import interfaz.InterfazTorneo;
import interfaz.InterfazRonda;
import logica.Jugador;
import logica.Partida;
import logica.Torneo;
import logica.Ronda;

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
    private Partida match;

    
	public void nuevoTorneo() {
		if (tournament==null) {
			tournament = new Torneo();
			InterfazTorneo NuevoTorneo = new InterfazTorneo(tournament); 
			NuevoTorneo.setVisible(true);	
		} else JOptionPane.showMessageDialog(null,"Torneo en curso"); // hint: ¿Desea eliminar el torneo en curso? 
	}
	
	public void abrirTorneo() { // Simulación carga de Torneo
		tournament = new Torneo();
		tournament.setNombre("Torneo Zonal 2016");
		tournament.setLugar("Colegio Secundario E.P.E.T. Nro. 3");
		tournament.setFecha("15/11/2016");
		tournament.Participantes.add(new Jugador("Alexander Alekhine"));
		Jugador jugador1 = new Jugador("Anatoly Karpov");
		jugador1.score = 15;
		jugador1.Desempate1 = 5;
		jugador1.Desempate2 = 10;
		jugador1.Desempate3 = 9;
		tournament.Participantes.add(jugador1);
		tournament.Participantes.add(new Jugador("Garry Kasparov"));
		tournament.Participantes.add(new Jugador("Emanuel Lasker"));
		tournament.Participantes.add(new Jugador("José Raúl Capablanca"));
		tournament.Participantes.add(new Jugador("Paul Morphy"));	
		Jugador jugador2 = new Jugador("Bobby Fisher");
		jugador2.score = 15;		
		jugador2.Desempate1 = 5;
		jugador2.Desempate2 = 6;
		jugador2.Desempate3 = 11;
		tournament.Participantes.add(jugador2);
		tournament.Participantes.add(new Jugador("Magnus Carlsen"));
		tournament.Participantes.add(new Jugador("Viswanathan Anand"));	
		tournament.Participantes.add(new Jugador("Hikaru Nakamura"));
	}
	public void listarJugadores() {
		// Mostrar lista de jugadores en una tabla y botones para agregar/modificar y eliminar
		if (tournament!=null) {
			InterfazListadoJugadores posiciones = new InterfazListadoJugadores(tournament);
		} else { JOptionPane.showMessageDialog(null, "No existe un torneo registrado.");
		}
	}
	
	public void Apareamiento() {
		// crear una ronda o mostrarla, para modificar resultados (via interfazpartida)
		/**
		 * RONDA #  1
		 * MESA BLANCAS   RESULTADO   NEGRAS 
		 * 1    KASPAROV     1-0      KARPOV
		 * 2    CARLSEN      0-1      NAKAMURA
		 */
		if (tournament!=null) {
			InterfazRonda apareamiento = new InterfazRonda(tournament);
		} else { JOptionPane.showMessageDialog(null, "No existe un torneo registrado.");
		}
	}
	
	public void mostrarResultados(){
		// Mostrar lista de jugadores en una tabla, con los resultados de todas las partidas
		/** Por ej.
		 *  Mesa  Jugador  Pais ELO  1  2  3  4  5   6   7
		 *  1     NAKAMURA USA  2500 1  0 0.5 1  0   0   1
		 *  2     KARPROV  RUS  2550 1  1  1  1 0.5 0.5  1
		 */

	}
	
	public void mostrarPosiciones() {
		if (tournament!=null) {
			InterfazScore posiciones = new InterfazScore(tournament);
		} else { JOptionPane.showMessageDialog(null, "No existe un torneo registrado.");
		}
		
	}
	
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
				nuevoTorneo();						
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirTorneo();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Guardar");
		mntmNewMenuItem_2.setEnabled(false);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnJugadores = new JMenu("Jugadores");
		menuBar.add(mnJugadores);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Lista");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarJugadores();
			}
		});
		mnJugadores.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Posiciones");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarPosiciones();
			}
		});
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Apareamiento");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	           Apareamiento();
			}
		});
		mnJugadores.add(mntmNewMenuItem_5);
		mnJugadores.add(mntmNewMenuItem_4);
		
		JMenuItem mntmResultados = new JMenuItem("Resultados");
		mntmResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarResultados();
			}
		});
		mnJugadores.add(mntmResultados);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
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

}
