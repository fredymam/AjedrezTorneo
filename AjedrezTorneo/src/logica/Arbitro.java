package logica;

public class Arbitro {
	public string nombre;
	private char categoria;
	public string getNombre() {
		return nombre;
	}
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}
	public char getCategoria() {
		return categoria;
	}
	private void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public void arbitro(){
		switch (categoria){
			case 0:
			    System.out.println("arbitro mundial"); break;
			case 1:
				System.out.println("arbitro continental"); break;
			case 2:
				System.out.println("arbitro regional"); break;
			case 3:
				System.out.println("arbitro inactivo"); break;
				
			
		}
	}
	
}
