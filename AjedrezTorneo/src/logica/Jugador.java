package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Jugador {
	private char sexo;
	public String nombre;
	private Date nacimiento;
	public Double score;
	public Jugador(String nombre) {
		this.nombre = nombre;
		nacimiento = new Date();
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
	public void setNacimiento(String fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			nacimiento = sdf.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		
		if ((HoyMes < NacMes) || ((HoyMes == NacMes) && (HoyDia < NacDia))) {
			edad--;
		}
		return edad;
		
	}
	
}
