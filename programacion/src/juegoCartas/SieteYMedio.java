package juegoCartas;

import java.util.Scanner;

public class SieteYMedio {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Baraja b = new Baraja(1, true);
		boolean juegoActivo = true;
		double puntosJugador = 0;
		double puntosBanca = 0;

		do {
			System.out.println("Tus puntos actuales: " + puntosJugador);
			System.out.print("¿Quieres carta? (dame/basta): ");
			String respuesta = scanner.nextLine();

			if (respuesta.equalsIgnoreCase("dame")) {
				Carta c = b.Robar();
				System.out.println("Has sacado: " + c);
				puntosJugador += c.valor7YMedia();

				if (puntosJugador > 7.5) {
					System.out.println("Puntuación: " + puntosJugador + " ¡Te has pasado!");
					juegoActivo = false;
				}
			} else {
				juegoActivo = false;
			}
		} while (juegoActivo && puntosJugador <= 7.5);

		if (puntosJugador <= 7.5) {
			System.out.println("Turno de la Banca");
			while (puntosBanca < puntosJugador && puntosBanca <= 7.5) {
				Carta c = b.Robar();
				puntosBanca += c.valor7YMedia();
				System.out.println("La banca saca " + c + ". Puntos banca: " + puntosBanca);
			}

			System.out.println("RESULTADO FINAL:");
			System.out.println("Jugador: " + puntosJugador + " vs Banca: " + puntosBanca);

			if (puntosBanca > 7.5 || puntosJugador > puntosBanca) {
				System.out.println("¡Has ganado!");
			} else if (puntosBanca > puntosJugador) {
				System.out.println("Gana la banca.");
			} else {
				System.out.println("Empate (Gana la banca por reglas habituales).");
			}
		} else {
			System.out.println("Gana la banca porque te has pasado.");
		}
	}

}
