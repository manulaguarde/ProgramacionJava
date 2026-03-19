package practicaVeterinaria;

public abstract class Animal {

	private String nombre;
	private String fechaNacimiento;
	private double peso;
	private String comentarios;
	
	public Animal(String nombre,String fechaNac, double peso, String comentario) {
		
		this.nombre=nombre;
		this.fechaNacimiento=fechaNac;
		this.peso=peso;
		this.comentarios=comentario;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public abstract String dameDatosAnimal();

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", comentarios="
				+ comentarios + "]";
	}
	
	
}
