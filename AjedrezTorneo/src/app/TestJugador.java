package app;
import logica.Jugador;

public class TestJugador {

	public static void main(String[] args) {
		Jugador Blanca = new Jugador("Pedro");
		Blanca.setNacimiento("24/02/1998");
		System.out.println(Blanca.getEdad());
		

	}

}
