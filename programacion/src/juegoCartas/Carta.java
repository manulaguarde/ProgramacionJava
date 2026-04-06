package juegoCartas;

public class Carta {

	private int numero;
	private int palo;
	
	public Carta(int num, int palo) {
		this.numero=num;
		this.palo=palo;
	}
	public Carta(int id) {
		
		if(id<10) {
			palo=0;
			numero=id+1;
		}else if(id>=10 && id<20) {
			palo=1;
			numero=id-9;
		}else if(id>=20 && id<30) {
			palo=2;
			numero=id-19;
		}else {
			palo=3;
			numero=id-29;
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	public int getPalo() {
		return this.palo;
	}
	
	public String getNombreNumero() {
		if(this.numero==1) return "As";
		if(this.numero==2) return "Dos";
		if(this.numero==3) return "Tres";
		if(this.numero==4) return "Cuatro";
		if(this.numero==5) return "Cinco";
		if(this.numero==6) return "Seis";
		if(this.numero==7) return "Siete";
		if(this.numero==8) return "Sota";
		if(this.numero==9) return "Caballo";
		return "Rey";
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
	public String toString() {
		return this.getNombreNumero()+" de "+this.getNombrePalo();
	}
}
