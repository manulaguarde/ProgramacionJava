package herencia;

public class Perro extends Animal {
	
	public Perro(String nombre) {
		super (nombre);
	}
	public void ladrar() {
		System.out.println("Guau");
	}
}
