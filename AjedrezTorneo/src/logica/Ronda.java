package logica;

public class Ronda {
	private int ronda;
	public enum Estado {PENDIENTE,ENCURSO,FINALIZADA};
	public Estado estado;
	public Torneo torneo;
	public Ronda(Torneo torneo, int ronda){
		this.ronda = ronda;
		this.torneo = torneo;
	}
	public double setResultado(Estado Resultado, int mesa) {
		 
		
	}
	
	public int getRonda() {
		return ronda;
	}
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
   
}