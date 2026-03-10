package ud8;

public final class Punto extends Figura { //final class corta la cadena de herencia, no pude tener clases hijas, es una decisión de diseño
	private int x,y;
	
	public Punto(String nombre, int x, int y) {
		super(nombre);
		this.x=x;
		this.y=y;
	}
	
	public double obtenerArea() {
		return 0;
	}
	public double obtenerVolumen() {
		return 0;
	}

	
}
