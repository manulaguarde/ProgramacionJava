package ud8Interfaces;

public abstract class Persona {

	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellidos=apellido;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Apellidos=" + apellidos + " Idioma: ";
	}
	
	
}
