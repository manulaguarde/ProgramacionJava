package ejerciciosParaExamen;

public abstract class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected double velocidad;
	
	public Vehiculo(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
		this.velocidad=0;
	}
	
	public abstract void acelerar(double velocidad);
	
	public void frenar() {
		this.velocidad=0;
	}
	
	public String toString() {
		return "Vehiculo: ";
	}

}
