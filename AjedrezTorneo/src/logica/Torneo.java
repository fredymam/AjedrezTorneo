package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

import logica.Ronda.Estado;

public class Torneo {
	public enum Modalidad {SWISS,ROUNDROBIN};
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
	
	public int getActualRonda() {
		return Rondas.size();
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
		
	public Ronda NuevaRonda() {
		int NextRonda = getActualRonda()+1;	
		/**
		 * (NextRonda=1) --> No existen rondas previas
		 * (NextRonda<=NroRondas) --> Evita crear una ronda extra al total definido
		 * (Rondas.get(NextRonda-1).getEstado()==Estado.FINALIZADA) --> Se genera una nueva ronda, cuando la previa esta finalizada;
		 * 	excepto cuando se trata de la primer ronda!.
		 */
		if ((NextRonda==1) || (NextRonda<=NroRondas && Rondas.get(NextRonda-1).getEstado()==Estado.FINALIZADA)) {
			Ronda rueda = new Ronda(this,NextRonda);
			rueda.Pareo();
			Rondas.add(rueda);
			return rueda;			
		} else return null; 
	}
	
	public Ronda getRonda(int ronda) {
		if (ronda<=getActualRonda()) {
		  return Rondas.get(ronda);
		} else return null; 		
	}
}
