package juegoCartas;

import java.util.ArrayList;

public class Baraja {

	private ArrayList<Carta> listaCartas;
	
	public Baraja() { //tiene que crear una baraja vacía
		listaCartas=new ArrayList<Carta>();
	}
	public Baraja(int tipoBaraja) {
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
}
