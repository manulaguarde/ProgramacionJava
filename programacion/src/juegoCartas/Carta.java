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
	public String getNombrePalo() {
		if(this.palo==0) return "Oros";
		if(this.palo==1) return "Copas";
		if(this.palo==2) return "Espadas";
		return "Bastos";
	}
	
	public int valorTute() {
		if(this.numero==1) return 11;
		if(this.numero==3) return 10;
		if(this.numero==8) return 2;
		if(this.numero==9) return 3;
		if(this.numero==10) return 4;
		return 0;
		
	}
	
	public int valorMus() {
		if(this.numero==1 || this.numero==2) return 1;
		if(this.numero==8 || this.numero==9 || this.numero==10) return 10;
		return this.numero;
	}
	public double valor7YMedia() {
		if(this.numero==8 || this.numero==9 || this.numero==10) return 0.5;
		
		return this.numero;
	}
}
