package Ud6;

public class PersonaCuentas {
	
	private int cont=0;
	private String dni;
	private CuentaPersona[] cuenta;
	
	public PersonaCuentas (String dni) {
		this.dni=dni;
	}

	public boolean añadirCuenta(CuentaPersona[] cuenta) {
		if(cont<3){
			this.cuenta[cont]=cuenta[cont];
			cont++;
			return true;
		}
		return false;
		
	}
	
	public boolean esMoroso() {
		for(int i=0;i<cuenta.length;i++) {
			if(cuenta[i].consultaSaldo()<0) {
				return true;
			}
		}
		return false;
	}
	
	/*public double mostrarSaldo(String numCuenta) {
		
		for(int j=0;j<cuenta.length;j++) {
			return cuenta[j].consultaSaldo();
		}
		
	}*/
	
	public CuentaPersona[] dameCuenta(String numCuenta) {
		
			return cuenta;
		
	}
	
	/*public String toString() {
		for(int i=0;i<3;i++) {
			return "DNI: "+this.dni+" número de cuenta: "+cuenta[i].toString();
		}
	}*/
}
