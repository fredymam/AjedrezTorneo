package logica;

import javax.swing.table.DefaultTableModel;

public class Score implements Comparable<Jugador> {
	public final int colCount = 9;    // Cantidad de Columnas
	public final int colPosicion = 0; // Constantes para utilizar el indice de cada columna
	public final int colApellido = 1;
	public final int colNombre = 2; 
	public final int colSexo = 3; 
	public final int colCategoria = 4; 
	public final int colPuntos = 5; 
	public final int colDesempate1 = 6; 
	public final int colDesempate2 = 7;
	public final int colDesempate3 = 8;
	
	private Torneo torneo;            // Referencia al Torneo 
	private String[] colJugador;      // Arreglo de una dimensión para los títulos de las columnas 
    private String[][] rowJugador;    // Arreglo de dos dimensiones para los datos de las filas.
    public DefaultTableModel tablaDatos; // Modelo de Datos -> Representación abstracta
    
    public void Ordenar(){           
    	// 1. Ordenar por puntos
    	// 2. Ordenar por Desempate
    	// hint: Ver Interface Comparable y Clase Collections
    }

	public Score(Torneo torneo) { // Constructor
		this.torneo = torneo;
		colJugador = new String[colCount];
		rowJugador = new String[torneo.Participantes.size()][colCount];
		tablaDatos = new DefaultTableModel(getRowJugador(),getColJugador());
	}
	
	public String[] getColJugador() {
		colJugador[colPosicion]   = "Posición";
		colJugador[colApellido]   = "Apellido";
		colJugador[colNombre]     = "Nombre";
		colJugador[colSexo]       = "Sexo";
		colJugador[colCategoria]  = "Categoría";
		colJugador[colPuntos] 	  = "Puntos";
 		colJugador[colDesempate1] = "Desempate1";
 		colJugador[colDesempate2] = "Desempate2";
 		colJugador[colDesempate3] = "Desempate3";
 		return colJugador;
	}

	public String[][] getRowJugador() {
	   Ordenar();
	   for (int fila=0;fila<torneo.Participantes.size();fila++) { 
		   rowJugador[fila][colPosicion] = String.valueOf(fila + 1);
		   rowJugador[fila][colNombre] = torneo.Participantes.get(fila).getNombre();
		   rowJugador[fila][colPuntos] = String.valueOf(torneo.Participantes.get(fila).getScore());
		   
		   // completar columnas
	   }
	   return rowJugador;
	}

	
	

	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
