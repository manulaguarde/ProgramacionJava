package ud8;

public class Television extends Electrodomestico {

	private int pulgadas;
	private boolean sint_tdt;
	private final int PULGADAS_HABITUALES=20;
	private final boolean TDT_HABITUAL=false;
	
	public Television() {
		super();
		this.pulgadas=PULGADAS_HABITUALES;
		this.sint_tdt=TDT_HABITUAL;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		this.pulgadas=PULGADAS_HABITUALES;
		this.sint_tdt=TDT_HABITUAL;
	}
	
	public Television(double precio, String color, char consumo, double peso,int pulgadas, boolean tdt) {
		super(precio,color,consumo,peso);
		this.pulgadas=pulgadas;
		this.sint_tdt=tdt;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public boolean isSint_tdt() {
		return sint_tdt;
	}
	
	public double precioFinal() {
		double precioFinal=super.precioFinal();
		
		if (pulgadas>40) precioFinal+=precioFinal*0.30;
		
		if(sint_tdt==true) precioFinal+=50;
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return super.toString()+"Television [pulgadas=" + pulgadas + ", sint_tdt=" + sint_tdt + "]";
	}
	
	
}
