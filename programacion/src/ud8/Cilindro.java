package ud8;

public class Cilindro extends Circulo {
	
	private double altura;
	
	public Cilindro (String nombre, double radio, double altura) {
		super(nombre,radio);
		this.altura=altura;
	}

	public double obtenerArea() {
		return Math.round(super.obtenerArea()*2+2*Math.PI*this.radio*this.altura);
	}
	
	public double obtenerVolumen() {
		return super.obtenerArea()*this.altura;
	}
	
	
}
