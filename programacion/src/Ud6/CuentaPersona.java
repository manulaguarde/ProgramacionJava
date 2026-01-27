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
	public void recibeAbonos(double abono) {
		saldo+=abono;
	}
	public void pagaRecibos(double cantidad) {
		saldo-=cantidad;
	}

}
