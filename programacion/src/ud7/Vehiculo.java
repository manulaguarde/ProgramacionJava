package ud7;

public class Vehiculo {
	
	private boolean tieneMotor;
	private int numRuedas;
	private String color,matricula;

	public Vehiculo(boolean tieneMotor, int numRuedas, String color, String matricula) {
		super();
		this.tieneMotor = tieneMotor;
		this.numRuedas = numRuedas;
		this.color = color;
		this.matricula = matricula;
	}
	
	
	
	
	
	public boolean isTieneMotor() {
		return tieneMotor;
	}
	public void setTieneMotor(boolean tieneMotor) {
		this.tieneMotor = tieneMotor;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





	@Override
	public String toString() {
		return "Vehiculo [tieneMotor=" + tieneMotor + ", numRuedas=" + numRuedas + ", color=" + color + ", matricula="
				+ matricula + "]";
	}
	
	
}
