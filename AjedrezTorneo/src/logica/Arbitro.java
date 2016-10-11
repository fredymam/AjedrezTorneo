package logica;

public class Arbitro {
	public string nombre;
	public string apellido;
	private char categoria;
	public string getNombre() {
		return nombre;
	}
	public string getApellido(){
		return apellido;
	}
	
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(string apellido){
		this.apellido = apellido;
	}
	
	public char getCategoria() {
		return categoria;
	}
	private void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public void arbitro(){
		switch (categoria){
			case 'A':
			    System.out.println("arbitro mundial"); break;
			case 'B':
				System.out.println("arbitro continental"); break;
			case 'C':
				System.out.println("arbitro regional"); break;
			case 'D':
				System.out.println("arbitro inactivo"); break;
				
			
		}
	}
	
}
