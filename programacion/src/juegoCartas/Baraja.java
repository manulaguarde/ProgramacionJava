package juegoCartas;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {

	private ArrayList<Carta> listaCartas;
	
	public Baraja() { //tiene que crear una baraja vacía
		listaCartas=new ArrayList<Carta>();
	}
	
	public Baraja(int tipoBaraja) {
		listaCartas=new ArrayList<Carta>();
		if(tipoBaraja==1) {
			for(int i=0;i<40;i++) {
				listaCartas.add(new Carta(i));
			}
		}else {
			for(int i=0;i<40;i++) {
				listaCartas.add(new Carta(i));
				listaCartas.add(new Carta(i));
			}
		}
	}
	
	public Baraja(int tipoBaraja, boolean barajar) {
		listaCartas=new ArrayList<Carta>();
		if(tipoBaraja==1) {
			for(int i=0;i<40;i++) {
				listaCartas.add(new Carta(i));
			}
		}else {
			for(int i=0;i<40;i++) {
				listaCartas.add(new Carta(i));
				listaCartas.add(new Carta(i));
			}
		}
		if (barajar) this.Barajar();

	}
	
	public void Barajar() {
		ArrayList<Carta> cartasMezcladas=new ArrayList<Carta>();
		Random genAle=new Random();
		int numCartas=listaCartas.size();
		
		for(int i=0;i<numCartas;i++) {
			cartasMezcladas.add(listaCartas.remove(genAle.nextInt(listaCartas.size())));
		}
		for(Carta carta:cartasMezcladas) {
			listaCartas.add(carta);
		}
	}
	
	public void Cortar(int posicion) {
		for(int i=0;i<posicion;i++) {
			Carta carta=listaCartas.remove(i);
			listaCartas.add(carta);
		}
	}
	
	public Carta Robar() {
		return listaCartas.remove(0);
	}
	
	public void insertaCartaFinal(int idCarta) {
		listaCartas.addLast(new Carta(idCarta));
	}
	
	public void insertaCartaPrincipio(int idCarta) {
		listaCartas.addFirst(new Carta(idCarta));
	}
	
	public void insertaCartaFinal(Carta c) {
		listaCartas.addLast(c);
	}
	
	public void insertaCartaPrincipio(Carta c) {
		listaCartas.addFirst(c);
	}
	
	public int numeroCartas() {
		return listaCartas.size();
	}
	
	public boolean Vacia() {
		if (this.numeroCartas()==0) return true;
		
		return false;
	}
	
	public String toString() {
		String cad="";
		for(Carta carta:listaCartas) {
			cad+=carta.toString()+"\n";
		}
		return cad;
	}

}
