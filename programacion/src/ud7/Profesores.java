package ud7;

public class Profesores extends Empleados{
	
	private String depto;
	
	public Profesores (String nombre, String apellidos, String dni, String estadoCivil,String añoIncorporacion,int numDespacho,String depto) {
		
		super(nombre,apellidos,dni,estadoCivil,añoIncorporacion,numDespacho);
		this.depto=depto;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return super.toString()+ " Profesores [depto=" + depto + "]";
	}
	
	

}
