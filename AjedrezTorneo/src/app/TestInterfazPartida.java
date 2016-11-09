package app;
import interfaz.InterfazPartida;
import logica.Partida;
import logica.Jugador;
public class TestInterfazPartida {

	public static void main(String[] args) {
		Partida match = new Partida();
		match.setJblancas(new Jugador("Maria"));
		match.setJnegras(new Jugador("pedra"));
		match.setMesa(1);
		InterfazPartida ventanita = new InterfazPartida(match);
	}

}
