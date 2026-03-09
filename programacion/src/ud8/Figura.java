package ud8;

public abstract class Figura {

	protected String nombre;
	
	public Figura(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract double obtenerArea();
	
	public abstract double obtenerVolumen();
	
	@Override
	public String toString() {
		return "Nombre de la figura= " + nombre+". Area= "+obtenerArea()+". Volumen= "+obtenerVolumen();
	}
	
	
}
