package ud8Interfaces;

public abstract class Animal implements Hablador{
	
	public Animal() {
		
	}
	
	public abstract void saluda();

	@Override
	public String toString() {
		return "Animal: ";
	}
	
	

}
