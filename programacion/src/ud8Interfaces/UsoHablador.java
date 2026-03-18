package ud8Interfaces;

public class UsoHablador {

	public static void main(String[] args) {
		
		
		
		Perro perro=new Perro();
		Gato gato= new Gato();
		Espaniol español= new Espaniol("Manuel","Rey");
		
		perro.saluda();
		gato.saluda();
		español.saluda();
		
		System.out.println(perro);
		System.out.println(español);

	}

}
