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
		Date fecha_hoy = new Date();
		int HoyAnio = fecha_hoy.getYear();
		int HoyMes = fecha_hoy.getMonth();
		int HoyDia = fecha_hoy.getDate();
		
		int NacAnio = nacimiento.getYear();
		int NacMes = nacimiento.getMonth();
		int NacDia = nacimiento.getDate();
		
		if (HoyMes > NacMes){
			return HoyAnio - NacAnio;
		}else if(HoyMes <= NacMes) && (HoyDia <=NacDia){
			return  ;
		}
		return edad;
	}
	
}
