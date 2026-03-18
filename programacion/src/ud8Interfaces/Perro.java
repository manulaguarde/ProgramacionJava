package ud8Interfaces;

public class Perro extends Animal{
	
	public Perro() {
		super();
	}
	
	public void saluda() {
		System.out.println("Guau");
	}

	@Override
	public String toString() {
		return super.toString()+"Perro";
	}
	
	

}
