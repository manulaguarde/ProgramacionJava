package Ud6;

public class PersonaCuentas {
	
	private int numCuentasAsociadas=0;
	private String dni;
	private CuentaPersona[] cuentas;
	
	public PersonaCuentas (String dni) {
		this.dni=dni;
		cuentas=new CuentaPersona[3]; //en este momento son null las 3 posiciones
	}

	public boolean añadirCuenta(CuentaPersona cuenta) {
		if(numCuentasAsociadas<3){
			this.cuentas[numCuentasAsociadas]=cuenta;
			numCuentasAsociadas++;
			return true;
		}
		return false;
		
	}
	
	public boolean recibeAbonoEnCuenta(String numCuenta, double abono){
		for(int i=0;i<numCuentasAsociadas;i++) {
			if(this.cuentas[i].dameCuenta().equals(numCuenta)) {
				if(this.cuentas[i].recibeAbonos(abono)) {
					return true;
				}
			}
		}
		return false;
		
	}
	public boolean efectuaPagoEnCuenta(String numCuenta, double pago){
		for(int i=0;i<numCuentasAsociadas;i++) {
			if(this.cuentas[i].dameCuenta().equals(numCuenta)) {
				if(this.cuentas[i].pagaRecibos(pago)) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean esMoroso() {
		for(int i=0;i<numCuentasAsociadas;i++) {
			if(cuentas[i].consultaSaldo()<0) {
				return true;
			}
		}
		return false;
	}
	
	public double mostrarSaldo(CuentaPersona cuenta) {
		
		return cuenta.consultaSaldo();
		
	}
	
	public String toString() {
		String cad="dni: "+dni+"\nCuentas: ";
		for(int i=0;i<numCuentasAsociadas;i++) {
			cad+=cuentas[i].toString();
		}
		return cad;
	}
	
	public String dameDni() {
		
		return dni;
		
	}
	public CuentaPersona dameCuenta(String numC) {
		for(int i=0;i<numCuentasAsociadas;i++) {
			if (numC.equals(cuentas[i].dameCuenta())) {
				return cuentas[i];
			}
		}
		return null;
	}
	
}
