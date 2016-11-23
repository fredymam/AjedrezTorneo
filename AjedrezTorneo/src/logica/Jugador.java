package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Jugador implements Comparable<Jugador>{
	private char sexo;
	private String nombre;
	private String apellido;
	private Date nacimiento;
	private int elo;
	public double score = 0.0;
	public double Desempate1;
	public double Desempate2;
	public double Desempate3;
	public ArrayList<Partida> juegos;
	
	public Jugador(String nombre) {
		this.nombre = nombre;		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	
	public int getElo() {
		return elo;
	}
	
	public void setElo(int elo) {
		this.elo = elo;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(Double score) {
		this.score = score;
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
	
	public double getDesempate1(){
		return Desempate1;
	}
	
	public double setDesempate1(double Desempate1){
		return Desempate1;
	}
	
	public double getDesempate2(){
		return Desempate2;
	}
	
	public double setDesempate2(double Desempate2){
		return Desempate2;
	}
	
	public double getDesempate3(){
		return Desempate3;
	}
	
	public double setDesempate3(double Desempate3){
		return Desempate3;
	}
	
	
	
	public void setNacimiento(String fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		try {
			nacimiento = sdf.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void setNacimiento(Date fecha) {
		nacimiento = fecha;
	}
	
	public int getEdad() {
		Calendar Dia = Calendar.getInstance();
		int HoyAnio = Dia.get(Calendar.YEAR);
		int HoyMes = Dia.get(Calendar.MONTH);
		int HoyDia = Dia.get(Calendar.DAY_OF_MONTH);
		
		Dia.setTime(nacimiento);
		int NacAnio = Dia.get(Calendar.YEAR);
		int NacMes = Dia.get(Calendar.MONTH);
		int NacDia = Dia.get(Calendar.DAY_OF_MONTH);
		
		int edad = HoyAnio - NacAnio;
		
		if ((HoyMes < NacMes) || ((HoyMes == NacMes) && (HoyDia < NacDia))) {
			edad--;
		}
		return edad;		
	}
	
	public String getCategoria() {
	   /**
		 Según la edad, devolver "Sub-8", "Sub-10", "Sub-12", "Sub-14", "Sub-18", "Mayor", "Senior"  
	     Ej: return "Sub-8";		   
	   **/
		return "Mayor";
	}
	
	
	@Override
	public int compareTo(Jugador rival) {
		return nombre.compareTo(rival.getNombre());
	}
	
}
