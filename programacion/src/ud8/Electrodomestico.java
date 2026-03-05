package ud8;

public class Electrodomestico {
	
	private double precio_base;
	private String color;
	private char consumo_energ;
	private double peso;
	private final String COLOR_HABITUAL="Blanco";
	private final double PRECIO_BASE_HABITUAL=100.00;
	private final double PESO_HABITUAL=5;
	private final char CONSUMO_HABITUAL='F';
	
	public Electrodomestico() {
		this.precio_base=PRECIO_BASE_HABITUAL;
		this.color=COLOR_HABITUAL;
		this.consumo_energ=CONSUMO_HABITUAL;
		this.peso=PESO_HABITUAL;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precio_base=precio;
		this.peso=peso;
		this.consumo_energ=CONSUMO_HABITUAL;
		this.color=COLOR_HABITUAL;
	}
	
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precio_base=precio;
		this.color=color;
		if(comprobarConsumoEnergetico(consumo))
			this.consumo_energ=consumo;
		else
			consumo_energ=CONSUMO_HABITUAL;
		this.peso=peso;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo_energ() {
		return consumo_energ;
	}

	public double getPeso() {
		return peso;
	}
	
	private boolean comprobarConsumoEnergetico(char letra) {
		String letras="ABCDEF";
		for(int i=0;i<letras.length();i++) {
			if(letras.charAt(i)==letra) {
				return true;
			}
		}
		return false;
	}
	
	/*private boolean comprobarColor(String color) {
	
	}*/
	
	public double precioFinal() {
		double precioFinal=precio_base;
		
		if(consumo_energ=='A') precioFinal+=100;
		if(consumo_energ=='B') precioFinal+=80;
		if(consumo_energ=='C') precioFinal+=60;
		if(consumo_energ=='D') precioFinal+=50;
		if(consumo_energ=='E') precioFinal+=30;
		if(consumo_energ=='F') precioFinal+=10;
		
		if(peso>=0 && peso<=19) precioFinal+=10;
		if(peso>=20 && peso<=49) precioFinal+=50;
		if(peso>=50 && peso<=79) precioFinal+=80;
		if(peso>=80) precioFinal+=100;
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energ=" + consumo_energ
				+ ", peso=" + peso + "]";
	}
	
}
