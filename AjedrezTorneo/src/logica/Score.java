package logica;

import javax.swing.table.DefaultTableModel;

import java.util.Collections;
import java.util.Comparator;

public class Score implements Comparator<Jugador> {
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
    	Collections.sort(torneo.Participantes, this);
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
		   rowJugador[fila][colApellido] = torneo.Participantes.get(fila).getApellido();
		   rowJugador[fila][colNombre] = torneo.Participantes.get(fila).getNombre();
		   rowJugador[fila][colSexo] = String.valueOf(torneo.Participantes.get(fila).getSexo());
		   rowJugador[fila][colCategoria] = String.valueOf(torneo.Participantes.get(fila).getCategoria());
		   rowJugador[fila][colPuntos] = String.valueOf(torneo.Participantes.get(fila).getScore());
		   rowJugador[fila][colDesempate1] = String.valueOf(torneo.Participantes.get(fila).getDesempate1());
		   rowJugador[fila][colDesempate2] = String.valueOf(torneo.Participantes.get(fila).getDesempate2());
		   rowJugador[fila][colDesempate3] = String.valueOf(torneo.Participantes.get(fila).getDesempate3());
	   }
	   return rowJugador;
	}
	
	private int ResolverProblema (int Desempate1, int Desempate2) {
	      return Desempate1-Desempate2;
}


	@Override
	public int compare(Jugador jugador1, Jugador jugador2) {
		if (jugador1.getScore()>jugador2.getScore()) {
			return -1;
		} else if (jugador1.getScore()<jugador2.getScore()) {
			      return 1;		
		       } else { int x;
		                x = ResolverProblema(jugador1.Desempate1,jugador2.Desempate1);
		       		    if (x==0) {     	
					       x = ResolverProblema(jugador1.Desempate2,jugador2.Desempate2);
		       		       if (x==0) x = ResolverProblema(jugador1.Desempate3,jugador2.Desempate3);  		        
		       		          return x;	   
		       }
		       		    }		       		    
		       		   
		    	   
		       	 }
		
		
		
	}

		
		
		
		
		
		
		/*else { // DESEMPATE1
		    	        if (jugador1.getDesempate1()>jugador2.getDesempate1()){
		    		      return -1;
		    	        } else {
		    		             if (jugador1.getDesempate1()<jugador2.getDesempate1()){
		    			   return 1;
		    		  }
		    		   else{
		    			   if (jugador1.getDesempate2()>jugador2.getDesempate2()){
		    				   return -1;
		    			   }
			    		     else{
				    			   if (jugador1.getDesempate2()<jugador2.getDesempate2()){
				    				   return 1;
				    			   }
			    			   else{
			    				   if (jugador1.getDesempate3()>jugador2.getDesempate3()){
			    					   return -1;
			    				   }
			    				   else{
			    					   if (jugador1.getDesempate3()<jugador2.getDesempate3()){
			    						   return 1;
			    					   }
			    				   }
			    			   }
		    		   }
		    		     
		    	   }
		       } 
		    	   return 0;
		    	      
		       }
	}

}*/
