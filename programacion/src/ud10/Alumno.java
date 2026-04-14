package ud10;

public class Alumno {
	
	private String nombre;
	private int edad;
	private double calificacion;
	
	public Alumno(String nombre, int edad, double calif) {
		this.nombre=nombre;
		this.edad=edad;
		this.calificacion=calif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	public String imprime() {
		return "Alumno: "+this.getNombre()+
				"\nEdad: "+this.getEdad()+
				"\nCalificación: "+this.getCalificacion();
	}
	
	public String toString() {
		return "Alumno: "+this.getNombre()+
				"\nEdad: "+this.getEdad()+
				"\nCalificación: "+this.getCalificacion();
	}

}
