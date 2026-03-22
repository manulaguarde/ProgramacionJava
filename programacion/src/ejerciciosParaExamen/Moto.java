package ejerciciosParaExamen;

public class Moto extends Vehiculo {
	
	public Moto(String marca, String modelo) {
		super(marca, modelo);
	}
	
	public void acelerar(double velocidad) {
		this.velocidad+=velocidad;
	}
	
	public String toString() {
		return super.toString()+ "Moto. Marca: "+this.marca+", Modelo: "+this.modelo+", Velocidad actual:"+this.velocidad;
	
	}
}
