package logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ronda {
	
 	public enum Estado {PENDIENTE,ENCURSO,FINALIZADA};
	private int ronda;
	private Estado estado;
	private Torneo torneo;
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
	
	public boolean Pareo() { 
	   Partidas.clear(); // Elimina todas las partidas previas
	   int mesas = (torneo.Participantes.size()/2); // Generar cruces (igual a la mitad de jugadores)
	   for (int mesa=0; mesa<mesas; mesa++) { 
		  Partida match = new Partida();
		  match.setMesa(mesa+1);  
		  if (torneo.getActualRonda()==0) { // Determinar los rivales primer ronda
			  match.setJblancas(torneo.Participantes.get(mesa));
			  match.setJnegras(torneo.Participantes.get(mesas + mesa));
			  Partidas.add(match);			  
		  } else hacerCruce(); // Determinar rivales segun puntos y tiebreak
	  }
	  return true;	
	}
	
	private void hacerCruce() {
		
	}

  
}