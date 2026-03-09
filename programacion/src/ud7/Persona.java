package ud7;

//declaramos la clase como abstracta
public abstract class Persona {

	

	private String nombre,apellidos,dni,estadoCivil;
	protected double salario;
	
	public Persona(String nombre, String apellidos, String dni, String estadoCivil, double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
		this.salario=salario;
	}
	
	//definimos un método abstracto - No tiene cuerpo
	public abstract double calculaSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", estadoCivil="
				+ estadoCivil + "]";
	}
	
}
