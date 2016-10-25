package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar.*;
import java.util.*;


public class Jugador {
	private char sexo;
	public String nombre;
	private Date nacimiento;
	public Double score;
	public Jugador(String nombre) {
		this.nombre = nombre;		
	}
	public Jugador(int NacDia, int NacMes, int NacAnio ){
		//nacimiento = new Date(NacDia, NacMes, NacAnio);
		Calendar.set(NacDia, NacMes, NacAnio);
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
		Calendar Hoy = Calendar.getInstance();
		int HoyAnio = Hoy.get(Calendar.YEAR);
		int HoyMes = Hoy.get(Calendar.MONTH);
		int HoyDia = Hoy.get(Calendar.DAY_OF_MONTH);
		
		Calendar Nac;
		Nac.setTime(nacimiento);
		int NacAnio = Nac.get(Calendar.YEAR);
		int NacMes = Nac.get(Calendar.MONTH);
		int NacDia = Nac.get(Calendar.DAY_OF_MONTH);
		
		int edad = HoyAnio - NacAnio;
		
		if ((HoyMes < NacMes) || ((HoyMes == NacMes) && (HoyDia < NacDia))) {
			edad--;
		}
		return edad;
		
	}
	
}
