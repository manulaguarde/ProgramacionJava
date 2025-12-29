package objetos;

public class CuentaBancaria {

	private String numCuenta;
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String numCuenta, String titular) {
		this.numCuenta=numCuenta;
		this.titular=titular;
		this.saldo=0;
	}
	
	public void mostrarEstado(){
		System.out.println("Número de cuenta: "+numCuenta);
		System.out.println("Nombre del titular: "+titular);
		System.out.println("Saldo: "+saldo);
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double cantidad) {
		if (cantidad > 0) {
			this.saldo+=cantidad;
			System.out.println("Deposito realizado correctamente");
		}else
			System.out.println("Cantidad a depositar no válida");
	}
	public void retirar(double cantidad) {
		if (cantidad >0 && cantidad<=saldo) {
			this.saldo-=cantidad;
			System.out.println("Retiro efectuado exitosamente");
		}else
			System.out.println("Cantidad a retirar no válida");
	}
}
