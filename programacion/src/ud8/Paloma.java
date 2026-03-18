package ud8;

public class Paloma extends Ave {


	protected String color;
	protected String sexo;
	
	public Paloma(boolean vuela,String color, String sexo) {
		super(vuela,"Paloma");
		this.color = color;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Paloma [color=" + color + ", sexo=" + sexo + ", vuela=" + vuela + ", especie=" + especie + "]";
	}
	
	
}
