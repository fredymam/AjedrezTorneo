package logica;

import java.sql.Date;

public class Torneo {
	private String Nombre;
	private Date Fecha;
	private String Lugar;
	private enum Modalidad {SWISS,ROUNDROBIN};
	private Modalidad modalidad;
	private int nroJugadores;
	private int nroRondas = 7;

	
	public Torneo() {
		modalidad = Modalidad.SWISS;
		
				
	}
	
}
