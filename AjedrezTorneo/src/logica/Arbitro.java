package logica;

public class Arbitro {
	private String nombre;
	private String apellido;
	private char categoria;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public char getCategoria() {
		return categoria;
	}
	
	public void setCategoria(char Cat) {
		categoria = Cat;
	}
	
	public Arbitro(String Nombre, String Apellido) {
		this.nombre = Nombre;
		this.apellido  = Apellido;
	}
			
}
