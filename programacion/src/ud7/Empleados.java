package ud7;

public class Empleados extends Persona{

	private int anioIncorporacion;
	private String numDespacho;
	
	public Empleados(String nombre, String apellidos, String dni, String estadoCivil,String numDespacho,int anioIncorporacion) {
		
		super(nombre,apellidos,dni,estadoCivil);
		this.anioIncorporacion=anioIncorporacion;
		this.numDespacho=numDespacho;
	}

	public int getAñoIncorporacion() {
		return anioIncorporacion;
	}

	public void setAñoIncorporacion(int añoIncorporacion) {
		this.anioIncorporacion = añoIncorporacion;
	}

	public String getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(String numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return super.toString()+" Empleados [añoIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + "]";
	}
	
}
