package logica;

import java.util.ArrayList;

public class Ronda {
	
 	public enum Estado {PENDIENTE,ENCURSO,FINALIZADA};
	private int ronda =0;
	private Estado estado;
	private Torneo torneo;
	private int rondita;
	public  ArrayList<Partida> Partidas;
	
	
	public Ronda(Torneo torneo, int ronda){
		estado = Estado.PENDIENTE;
		this.ronda = ronda;
		this.torneo = torneo;
		Partidas = new ArrayList<Partida>();
		
	}
	public void setResultado(int mesa, Partida.Resultado result) {
		Partidas.get(mesa-1).setResultado(result);	  
	}
	
	public int getRonda() {
		return ronda;
	}
	
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public ArrayList<Partida> Pareo() { // Generar cruces (igual a la mitad de jugadores)
	   int particip = (torneo.Participantes.size()/2);
	   for (int mesa=0;mesa<particip ;mesa++) {
		  Partida match = new Partida();
		  match.setMesa(mesa+1);  // Determinar los rivales
		  match.setJblancas(torneo.Participantes.get(mesa));
		  match.setJnegras(torneo.Participantes.get(particip + mesa));
		  Partidas.add(match);
	  }
	  return Partidas;	
	}

	private Jugador particip(int i) {
		// TODO Auto-generated method stub
		return null;
	}
   
}