package app;
import interfaz.InterfazTorneo;
import logica.Torneo;

public class TestTorneo {

	public static void main(String[] args) {
	Torneo tornao = new Torneo();
	InterfazTorneo ventanal = new InterfazTorneo(tornao);
	ventanal.setVisible(true);

	}

}
