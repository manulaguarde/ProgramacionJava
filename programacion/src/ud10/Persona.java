package ud10;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	
	public String toString() {
		return "Nombre: "+this.nombre+"\nEdad: "+this.edad;
	}



	public String getNombre() {
		return nombre;
	}



	public int getEdad() {
		return edad;
	}
}
