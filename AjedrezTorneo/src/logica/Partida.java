package logica;

public class Partida{
	private int Mesa;
	private enum Resultado {BLANCAS, NEGRAS, TABLA, UNDEFINE};
	private Resultado resultado;
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
		if (resultado == Resultado.NEGRAS){
			jnegras.score++;
		}
		if(resultado == Resultado.NULL){
			jnegras.score = jnegras.score + 0.5;
			jblancas.score = jblancas.score + 0.5;
		}
	}
	
  
    
}