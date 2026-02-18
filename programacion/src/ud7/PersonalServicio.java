package ud7;

public class PersonalServicio extends Empleados {
	
	private String seccion;
	
	public PersonalServicio (String nombre, String apellidos, String dni, String estadoCivil,String numDespacho,int anioIncorporacion,String seccion) {
		
		super(nombre,apellidos,dni,estadoCivil,numDespacho,anioIncorporacion);
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
