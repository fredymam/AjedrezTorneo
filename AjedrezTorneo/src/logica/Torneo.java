package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Torneo {
	public enum Modalidad {SWISS,ROUNDROBIN}
	public static final String Arbitro = null;;
	private String Nombre;
	private Date Fecha;
	private String Lugar;
	private Modalidad modalidad;
	private int NroRondas = 7;
    public ArrayList<Jugador> Participantes;
	public ArrayList<Ronda> Rondas;
	public ArrayList<Arbitro> Arbitros;
	
	public int getNroJugadores() {
		return Participantes.size();
	}

	public int getNroRondas() {
		return NroRondas;
	}
	
	public void setNroRondas(int rondas) {
		NroRondas = rondas;
	}
	
	public Score getScore() {
		return new Score(this);
	}
	
	public Torneo() {
		modalidad = Modalidad.SWISS;
		Participantes = new ArrayList<Jugador>();
		Arbitros = new ArrayList<Arbitro>();
		Rondas = new ArrayList<Ronda>();
	}

	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		try {
			this.Fecha = sdf.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void setFecha(Date fecha) {
		this.Fecha = fecha;
	}


	public String getLugar() {
		return Lugar;
	}


	public void setLugar(String lugar) {
		Lugar = lugar;
	}


	public Modalidad getModalidad() {
		return modalidad;
	}


	public void setModalidad(Modalidad modalidad) {
	    this.modalidad = modalidad;
	}
}