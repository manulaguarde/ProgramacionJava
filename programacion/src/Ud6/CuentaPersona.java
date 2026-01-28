package Ud6;

public class CuentaPersona {
	
	private String numCuenta;
	private double saldo;
	
	public CuentaPersona(String numCta) {
		numCuenta=numCta;
		saldo=0;
	}
	public double consultaSaldo() {
		return saldo;
	}
	public String toString() {
		return "Numero de cuenta: "+numCuenta+"\nSaldo: "+saldo;
	}
	public boolean recibeAbonos(double abono) {
		if(abono>=0) {
			saldo+=abono;
			return true;
		}
		return false;
		
	}
	public boolean pagaRecibos(double cantidad) {
		if(cantidad>=0) {
			saldo-=cantidad;
			return true;
		}
		return false;
	}
	public String dameCuenta() {
		return numCuenta;
	}
	

}
