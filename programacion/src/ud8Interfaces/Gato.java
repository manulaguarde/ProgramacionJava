package ud8Interfaces;

public class Gato extends Animal {
	
	public Gato() {
		super();
	}
	
	public void saluda() {
		System.out.println("Miau");
	}

	public String toString() {
		return super.toString()+"Gato";
	}
	
}
