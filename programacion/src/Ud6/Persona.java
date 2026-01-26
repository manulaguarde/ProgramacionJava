package Ud6;

public class Persona {
	private String nombre, dni;
	private int edad;
	private char sexo;
	private double peso, altura;
	
	public Persona() {
		nombre="";
		edad=0;
		dni="";
		sexo='H';
		peso=0;
		altura=0;
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}
		return false;
	}
	
	//private char comprobarSexo(char s) {
		
	//}
}
