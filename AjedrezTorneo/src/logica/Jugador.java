package logica;

import java.util.*;

public class Jugador {
	private char sexo;
	private Date nacimiento;
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getEdad() {
		Date Hoy = new Date();
		int HoyAnio = Hoy.getYear();
		int HoyMes = Hoy.getMonth();
		int HoyDia = Hoy.getDate();
		
		int NacAnio = nacimiento.getYear();
		int NacMes = nacimiento.getMonth();
		int NacDia = nacimiento.getDate();
		
		int edad = HoyAnio - NacAnio;
		
		if (HoyMes < NacMes)||(HoyMes = NacMes) && (HoyDia < NacDia) {
			edad--;
		}
		return edad;
		
	}
	
}
