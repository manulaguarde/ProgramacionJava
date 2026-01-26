package Ud6;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	//Constructores
	public Cuenta(String nombre) {
		titular=nombre;
		cantidad=0;
	}
	
	public Cuenta(String nombre, double cant) {
		titular=nombre;
		if(cant<0) {
			cantidad=0;
		}
		else {
			cantidad=cant;
		}
	}
	
	//Getters
	public String getTitular() {
		return titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	
	//Setters
	public void setTitular(String nuevoTitular) {
		titular=nuevoTitular;
	}
	
	public void ingresar(double cant) {
		if(cant>0) {
			cantidad+=cant;
		}
	}
	
	public void retirar(double cant) {
		if(cantidad-cant<0) {
			cantidad=0;
		}
		else {
			cantidad-=cant;
		}
	}
	
	public String toString() {
		String datosCuenta="El titularde la cuenta es: "+titular+"  y su cuenta tiene: "+cantidad;
		return datosCuenta;
		//en el método toString también se puede llamar a los métodos que devuelven el nombre y la cantidad de la cuenta
	}
}
