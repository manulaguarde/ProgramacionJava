package ud8;

public class Cilindro extends Figura {
	
	private double altura;
	private Circulo circulo;
	
	public Cilindro (String nombre, Circulo c, double altura) {
		super(nombre);
		this.altura=altura;
		this.circulo=c;
	}

	public double obtenerArea() {
		return Math.round(circulo.obtenerArea()*2+circulo.damePerimetro()*this.altura);
	}
	
	public double obtenerVolumen() {
		return circulo.obtenerArea()*this.altura;
	}
	
	
}
