package juegoCartas;

public class Carta {

	private int numero;
	private int palo;
	private int id;
	
	public Carta(int num, int palo) {
		this.numero=num;
		this.palo=palo;
	}
	public Carta(int id) {
		this.id=id;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public int getPalo() {
		return this.palo;
	}
	
	public String getNombreNumero() {
		if(this.numero==1) return "as";
		if(this.numero==2) return "dos";
		if(this.numero==3) return "tres";
		if(this.numero==4) return "cuatro";
		if(this.numero==5) return "cinco";
		if(this.numero==6) return "seis";
		if(this.numero==7) return "siete";
		if(this.numero==8) return "ocho";
		if(this.numero==9) return "nueve";
		if(this.numero==10) return "sota";
		if(this.numero==11) return "caballo";
		return "rey";
	}
	
}
