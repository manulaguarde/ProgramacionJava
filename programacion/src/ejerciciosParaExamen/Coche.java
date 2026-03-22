package ejerciciosParaExamen;

public class Coche extends Vehiculo {
	
	public Coche(String marca, String modelo) {
		super(marca, modelo);
	}
	
	public void acelerar(double velocidad) {
		this.velocidad+=velocidad;
	}
	
	public String toString() {
		return super.toString()+ "Coche. Marca: "+this.marca+", Modelo: "+this.modelo+", Velocidad actual:"+this.velocidad;
	}

}
