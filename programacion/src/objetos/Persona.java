package objetos;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	
	public Persona() {
		
	}
	public Persona(String nombre, int edad, String dni) {
		
		this.nombre= nombre;
		this.edad= edad;
		this.dni= dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre= nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad= edad;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setDni(String dni) {
		this.dni= dni;
	}
	public String getDni() {
		return dni;
	}
}
