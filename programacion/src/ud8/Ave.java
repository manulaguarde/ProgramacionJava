package ud8;

public class Ave {


	protected boolean vuela;
	protected String especie;
	
	public Ave(boolean vuela, String especie) {
		this.vuela = vuela;
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Ave [vuela=" + vuela + ", especie=" + especie + "]";
	}
	
	
	
}
