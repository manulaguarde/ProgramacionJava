package juegoTresEnRaya;

import java.util.Scanner;

public class PruebaTableroVacio {

	static char[] tablero = new char[9];
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int j = 0;
		System.out.println("Introduzca movimiento (Jugador 1)");
		int movimiento1 = entrada.nextInt();
		mueveJugador1(movimiento1);

		System.out.println("Introduzca movimiento (Jugador 2)");
		int movimiento2 = entrada.nextInt();
		mueveJugador2(movimiento2);
		
		for (int i = 1; i <= 7; i++) {
			if (i % 2 != 0)
				System.out.print("-------------");
			if (i % 2 == 0) {
				for (int columnas = 1; columnas <= 13; columnas++) {
					if (columnas==1 || columnas==5 || columnas==9 || columnas==13) {
						System.out.print("|");
					}
					if (columnas%2==0) {
						System.out.print(" ");
					}
					if (columnas==3 || columnas==7 || columnas==11){
							tablero[j]=' ';
							System.out.print(tablero[j]);
							
					}
				}
			}
			System.out.println();

	}

}
	public static void mueveJugador1(int pos) {
		int j=0;
		for (int i = 1; i <= 7; i++) { //i son las filas del tablero
				if (i % 2 != 0)
					System.out.print("-------------"); //dibuja las rayas solo en las filas impares
			if (i % 2 == 0) { 		//En las filas pares es donde hace una barra verticales, espacios y rellena el valor
				for (int barra = 1; barra < 4; barra++) {
					System.out.print("|");
					for (int espacio = 1; espacio == 1; espacio++) {
						System.out.print(" ");
						for (int numero = 1; numero == 1; numero++) {
							if (j == pos - 1) {
								tablero[j] = 'X';
								System.out.print(tablero[j]);
							} else {
								System.out.print(tablero[j]);
							}
						}
						j++;
						System.out.print(" ");
					}
				}
			}
			if (i % 2 != 0) {
				System.out.println();
			} else {
				System.out.println("|");
			}
		}
		
	}
	public static void mueveJugador2(int pos) {
		int j=0;
		for (int i = 1; i <= 7; i++) {
				if (i % 2 != 0)
					System.out.print("-------------");
			if (i % 2 == 0) {
				for (int barra = 1; barra < 4; barra++) {
					System.out.print("|");
					for (int espacio = 1; espacio == 1; espacio++) {
						System.out.print(" ");
						for (int numero = 1; numero == 1; numero++) {
							if (j == pos - 1) {
								tablero[j] = 'O';
								System.out.print(tablero[j]);
							} else {
								System.out.print(tablero[j]);
							}
						}
						j++;
						System.out.print(" ");
					}
				}
			}
			if (i % 2 != 0) {
				System.out.println();
			} else {
				System.out.println("|");
			}
		}
	}
}
