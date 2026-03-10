package ud8;

public class Circulo extends Figura {
	
	private double radio;
	private Punto centro;

	public Circulo(String nombre, double radio, Punto p) {
		super(nombre);
		this.radio=radio;
		this.centro=p;
	}
	
	public double obtenerArea() {
		
		return Math.round(Math.PI * Math.pow(this.radio, 2));
	}
	public double obtenerVolumen() {
		return 0;
	}
	
	public double damePerimetro() {
		return 2*Math.PI*this.radio;
	}

}
