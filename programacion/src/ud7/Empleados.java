package ud7;

public class Empleados extends Persona{

	private String añoIncorporacion;
	private int numDespacho;
	
	public Empleados(String nombre, String apellidos, String dni, String estadoCivil,String añoIncorporacion,int numDespacho) {
		
		super(nombre,apellidos,dni,estadoCivil);
		this.añoIncorporacion=añoIncorporacion;
		this.numDespacho=numDespacho;
	}

	public String getAñoIncorporacion() {
		return añoIncorporacion;
	}

	public void setAñoIncorporacion(String añoIncorporacion) {
		this.añoIncorporacion = añoIncorporacion;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return super.toString()+" Empleados [añoIncorporacion=" + añoIncorporacion + ", numDespacho=" + numDespacho + "]";
	}
	
}
