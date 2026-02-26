package ud7;

public class EmpleadoBaseMasComision extends Empleado {
	
	private double  comision;
	private int numVentas;
	
	public EmpleadoBaseMasComision(String nombre, String apellido,String num_SS,double salarioBase,int numVentas,double comision) {
		super(nombre,apellido,num_SS,salarioBase);
		this.comision=comision;
		this.numVentas=numVentas;		
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public double calcularSalario() {
		return this.getSalarioBase()+numVentas*comision;
	}

	

}
