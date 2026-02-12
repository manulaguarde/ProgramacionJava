package practica;

public class Persona {

	private String dni;
	private String nombre;
	
	public Persona(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	public String getNombrePersona() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setNombrePersona(String nombre) {
		this.nombre=nombre;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public String toString() {
		return "Nombre: "+nombre+" - DNI: "+dni+"\n\n";
	}
}
