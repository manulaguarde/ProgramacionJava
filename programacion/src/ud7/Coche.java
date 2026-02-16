package ud7;

public class Coche extends Vehiculo{
	
	private int caballos;
	
	//Constructor
	public Coche(String color, String matricula, int caballos) {
		//construimos un vehiculo
		super(true, 4, color,matricula); //con super llamamos al constructor de la clase padre
		this.caballos=caballos;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	
	public String toString() {
		return super.toString()+"Coche [caballos=" + caballos + "]";//llamo al toString de la clase padre con super
	}
	
	

}
