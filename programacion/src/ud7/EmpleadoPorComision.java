package ud7;

public class EmpleadoPorComision extends Empleado{
	
	private int numVentas;
	private double comision;
	
	public EmpleadoPorComision(String nombre, String apellido,int num_SS,double salario,int numVentas,double comision) {
		super(nombre,apellido,num_SS,numVentas*comision);
		this.numVentas=numVentas;
		this.comision=comision;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "EmpleadoPorComision [numVentas=" + numVentas + ", comision=" + comision + "]";
	}
	

}
