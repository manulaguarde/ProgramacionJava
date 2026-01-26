package Ud6;

public class Cuenta_Uso {

	public static void main(String[] args) {
		Cuenta c1=new Cuenta("Leandro");
		
		c1.ingresar(50);
		System.out.println(c1.toString());
		
		c1.ingresar(100);
		System.out.println(c1.toString());
		
		c1.retirar(900);
		System.out.println("Cantidad en la cuenta de "+c1.getTitular()+": "+c1.getCantidad());

		Cuenta c2=new Cuenta("Mariana", 150);
		System.out.println(c2.toString());
	}

}
