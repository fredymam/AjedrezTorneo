package logica;
import java.util.ArrayList;

public class Ronda {
	private int ronda;
	private enum Estado {PENDIENTE,ENCURSO,FINALIZADA};
	private Estado estado;
	private Torneo torneo;
	public Ronda(Torneo torneo, int ronda){
		this.ronda = ronda;
		this.torneo = torneo;
	}
	public double setResultado(Resultado result, int mesa) {
		 
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
   
}