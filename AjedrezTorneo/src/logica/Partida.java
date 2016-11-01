package logica;

public class Partida{
	private int Mesa;
	public enum Resultado {BLANCAS, NEGRAS, TABLAS, UNDEFINE};
	public Resultado resultado;
	private Jugador jblancas;
	private Jugador jnegras;
		
	public void Partida(int Mesa, Jugador jblancas, Jugador jnegras){
		this.Mesa = Mesa;
		this.jblancas= jblancas;
		this.jnegras= jnegras;
	    resultado=Resultado.UNDEFINE;
	}
	public void setResultado (Resultado resultado){
		if (resultado == Resultado.BLANCAS){
			jblancas.score++;
		}
		else if (resultado == Resultado.NEGRAS){
			jnegras.score++;
		}
		else{
			jnegras.score = jnegras.score + 0.5;
			jblancas.score = jblancas.score + 0.5;
		}
	}
	
  
    
}