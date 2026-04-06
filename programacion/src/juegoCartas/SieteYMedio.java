package juegoCartas;

import java.util.Scanner;

public class SieteYMedio {
	
	static Scanner scanner=new Scanner(System.in);
	static double puntos;

	public static void main(String[] args) {
		
		Baraja b=new Baraja(1,true);
		boolean juegoActivo=true;
		Carta carta;
		
		do {
			if(juegoActivo) {
				System.out.println("¿Quieres carta? dame/basta");
			}
			String respuesta=scanner.nextLine();
			if(!respuesta.equalsIgnoreCase("dame")) {
				juegoActivo=false;
			}else {
				carta=b.Robar();
				//System.out.println("Carta: "+carta);
				System.out.println(carta.getNombreNumero());
				sumaPuntos(carta);
				System.out.println("Puntuación: "+puntos);
			}
			if(puntos>7.5) {
				juegoActivo=false;
			}

		}while(juegoActivo);
		
		if(puntos>7.5) System.out.println("Te has pasado");
		
		

	}
	
	public static void sumaPuntos(Carta c) {
		puntos+=c.valor7YMedia();
	}

}
