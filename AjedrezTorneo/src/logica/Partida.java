package logica;

public class Partida{
	public enum Resultado {BLANCAS, NEGRAS, TABLAS, UNDEFINE};
	private int Mesa;
	private Resultado resultado;
	private Jugador jblancas;
	private Jugador jnegras;
	
	public int getMesa() {
		return Mesa;
	}
	public void setMesa(int mesa) {
		Mesa = mesa;
	}
	public Jugador getJblancas() {
		return jblancas;
	}
	public void setJblancas(Jugador jblancas) {
		this.jblancas = jblancas;
	}
	public Jugador getJnegras() {
		return jnegras;
	}
	public void setJnegras(Jugador jnegras) {
		this.jnegras = jnegras;
	}
	
		
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