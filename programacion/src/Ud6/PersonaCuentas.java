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
	
	public boolean esMoroso() {
		for(int i=0;i<cuentas.length;i++) {
			if(cuentas[i].consultaSaldo()<0) {
				return true;
			}
		}
		return false;
	}
	
	public double mostrarSaldo(CuentaPersona cuenta) {
		
		return cuenta.consultaSaldo();
		
	}
	
	/*public String dameCuentas() {
		for(int i=0;i<numCuentasAsociadas;i++) {
			return cuentas[i].dameCuenta();
		}
		
		
	}*/
	
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
	
}
