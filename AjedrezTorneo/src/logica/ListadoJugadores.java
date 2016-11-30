package logica;

import javax.swing.table.DefaultTableModel;

public class ListadoJugadores {
	public final int colCount = 5;    // Cantidad de Columnas
	public final int colNombre = 0;   // Constantes para utilizar el indice de cada columna
	public final int colCategoria = 1; 
	public final int colSexo = 2; 
	public final int colElo = 3; 
	public final int colFechaNacimiento = 4; 
	
	
	private Torneo torneo;            // Referencia al Torneo 
	private String[] colJugador;      // Arreglo de una dimensión para los títulos de las columnas 
    private String[][] rowJugador;    // Arreglo de dos dimensiones para los datos de las filas.
    public DefaultTableModel tablaDatos; // Modelo de Datos -> Representación abstracta
    
    public void Ordenar(){
    	

    }

	public ListadoJugadores(Torneo torneo) { // Constructor
		this.torneo = torneo;
		colJugador = new String[colCount];
		rowJugador = new String[torneo.Participantes.size()][colCount];
		tablaDatos = new DefaultTableModel(getRowJugador(),getColJugador());
	}
	
	public String[] getColJugador() {
		colJugador[colNombre]     = "Nombre";
		colJugador[colCategoria]  = "Categoría";
		colJugador[colSexo]       = "Sexo";
		colJugador[colElo] 	  = "Elo";
 		colJugador[colFechaNacimiento] = "Fecha de Nacimiento";
 		return colJugador;
	}

	public String[][] getRowJugador() {
	   Ordenar();
	   for (int fila=0;fila<torneo.Participantes.size();fila++) { 
		   rowJugador[fila][colNombre] = torneo.Participantes.get(fila).getNombre();
		   rowJugador[fila][colCategoria] = torneo.Participantes.get(fila).getCategoria();
		   rowJugador[fila][colSexo] = String.valueOf(torneo.Participantes.get(fila).getSexo());
		   rowJugador[fila][colElo] = String.valueOf(torneo.Participantes.get(fila).getElo());
		   rowJugador[fila][colFechaNacimiento] = String.valueOf(torneo.Participantes.get(fila).getNacimiento()); 
		   
	   }
	   return rowJugador;
	}
}
