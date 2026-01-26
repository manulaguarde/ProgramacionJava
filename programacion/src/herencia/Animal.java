package herencia;

public class Animal {
	
	private String nombre;
	
	public Animal(String nombre) {
		this.nombre=nombre;
	}
	
	public void comer() {
		System.out.println("comiendo");
	}
	public void dormir() {
		System.out.println("durmiendo");
	}
	public String getNombre() {
		return nombre;
	}
	
}
