package ud7;

public class Empleado {

	private String nombre, apellido, num_SS;
	private double salarioBase;
	
	public Empleado(String nombre, String apellido,String num_SS,double salarioBase) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.num_SS=num_SS;
		this.salarioBase=salarioBase;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNum_SS() {
		return num_SS;
	}


	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", num_SS=" + num_SS + ", salarioBase="
				+ salarioBase + "]";
	}
	
}
