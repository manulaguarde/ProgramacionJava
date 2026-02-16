package ud7;

public class PersonalServicio extends Empleados {
	
	private String seccion;
	
	public PersonalServicio (String nombre, String apellidos, String dni, String estadoCivil,String añoIncorporacion,int numDespacho,String seccion) {
		
		super(nombre,apellidos,dni,estadoCivil,añoIncorporacion,numDespacho);
		this.seccion=seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return super.toString()+" PersonalServicio [seccion=" + seccion + "]";
	}

	
}
