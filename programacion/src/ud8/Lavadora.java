package ud8;

public class Lavadora extends Electrodomestico {

	private double carga;
	private final double CARGA_HABITUAL=5;
	
	public Lavadora() {
		super();
		this.carga=CARGA_HABITUAL;
	}
	
	public Lavadora(double precio, double peso) {
		super(precio,peso);
		this.carga=CARGA_HABITUAL;
	}
	
	public Lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio,color,consumo,peso);
		this.carga=carga;
	}

	public double getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double precioFinal=super.precioFinal();
		
		if(carga>30) precioFinal+=50;
		
		return precioFinal;
			
	}

	@Override
	public String toString() {
		return super.toString()+"Lavadora [carga=" + carga + "]";
	}
}
