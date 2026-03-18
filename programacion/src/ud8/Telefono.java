package ud8;

public class Telefono {
	
	protected String numero;
	protected String marca;
	
	public Telefono(String numero, String marca) {
		this.numero=numero;
		this.marca=marca;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", marca=" + marca + "]";
	}
	
	

}
