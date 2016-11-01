package logica;

import java.util.*;

public class Torneo {
	private String Nombre;
	private Date Fecha;
	private String Lugar;
	private enum Modalidad {SWISS,ROUNDROBIN};
	private Modalidad modalidad;
	private int nroJugadores;
	private int nroRondas = 7;	
	public ArrayList<Jugador> Participantes;
	public ArrayList<Ronda> Rondas;
	
	public Torneo() {
		modalidad = Modalidad.SWISS;
		Participantes = new ArrayList<Jugador>();
		
				
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


	public void setFecha(Date fecha) {
		Fecha = fecha;
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
