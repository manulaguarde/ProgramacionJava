package Ud6;

public class Rectangulo {
	//Atributos encapsulados
	private double base;
	private double altura;
	
	//Método constructor, que recibe los dos valores por parámetro
	public Rectangulo(double b, double a) {
		base=b;
		altura=a;
	}
	//getters
	public double calculaArea() { //getter
		double area=base*altura;
		return area;
	}
	 //Puede crearse una variable y guardar en ella el valor y devolverla o no hacer una variable y devolver directamente el dato
	public double calculaPerimetro() { //getter
		return 2*(base+altura);
	}
	
	//setters
	public void cambiaBase(double nuevaBase) {
		base=nuevaBase;
	}
}
