package app;
import interfaz.InterfazPartida;
import logica.Partida;
import logica.Jugador;
public class TestInterfazPartida {

	public static void main(String[] args) {
		InterfazPartida ventanita;
		Partida partida1 = new Partida();
		partida1.setJblancas(new Jugador("Maria"));
		partida1.setJnegras(new Jugador("pedra"));
		partida1.setMesa(1);
		ventanita = new InterfazPartida(partida1);

	}

}
