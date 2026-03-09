package ud8;

public class Circulo extends Figura {
	
	protected double radio;

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio=radio;
	}
	
	public double obtenerArea() {
		
		return Math.round(Math.PI * Math.pow(this.radio, 2));
	}
	public double obtenerVolumen() {
		return 0;
	}

}
