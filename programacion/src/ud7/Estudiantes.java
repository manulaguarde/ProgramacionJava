package ud7;

public class Estudiantes extends Persona{
	
	private String curso;
	
	public Estudiantes(String nombre, String apellidos, String dni, String estadoCivil,String curso) {
		
		super(nombre,apellidos,dni,estadoCivil,0); //super es el constructor de la clase padre
		this.curso=curso;
	}
	
	public double calculaSalario() {
		return this.salario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void estoyAtendiendo() {
		System.out.println("Estoy atendiendo");
	}
	public void estoyHablando() {
		System.out.println("Estoy hablando");
	}

	
	//Se sobreescribe el metodo toString
	public String toString() {
		//primero recupero el toString de la clase padre y luego se sobreescribe
		return super.toString()+" Estudiantes [curso=" + curso + "]";
	}

	
}
