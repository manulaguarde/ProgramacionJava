package ud7;

public class Estudiantes extends Persona{
	
	private String curso;
	
	public Estudiantes(String nombre, String apellidos, String dni, String estadoCivil,String curso) {
		
		super(nombre,apellidos,dni,estadoCivil); //super es el constructor de la clase padre
		this.curso=curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	//Se sobreescribe el metodo toString
	public String toString() {
		//primero recupero el toString de la clase padre y luego se sobreescribe
		return super.toString()+" Estudiantes [curso=" + curso + "]";
	}

	
}
