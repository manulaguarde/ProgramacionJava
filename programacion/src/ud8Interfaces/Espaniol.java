package ud8Interfaces;

public class Espaniol extends Persona implements Hablador {
	
	public Espaniol(String nombre,String apellidos) {
		super(nombre,apellidos);
	}
	
	public void saluda() {
		System.out.println("Hola");
	}

	@Override
	public String toString() {
		return super.toString()+"Español";
	}
	
	

}
