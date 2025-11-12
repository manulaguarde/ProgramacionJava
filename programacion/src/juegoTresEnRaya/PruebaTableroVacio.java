package juegoTresEnRaya;

import java.util.Scanner;

public class PruebaTableroVacio {

	static char[] tablero = new char[9];
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int j = 0;

		System.out.println("Ingrese un movimiento");
		int movimiento = entrada.nextInt();
		for (int i = 1; i <= 7; i++) {
			for (int raya = 1; raya <= 13; raya++) {
				if (i % 2 != 0)
					System.out.print("-");
			}
			for (int barra = 1; barra < 4; barra++) {
				if (i % 2 == 0) {
					System.out.print("|");
					for (int espacio = 1; espacio == 1; espacio++) {
						System.out.print(" ");
						for (int numero = 1; numero == 1; numero++) {
							if (j == movimiento - 1) {
								tablero[j] = 'X';
								System.out.print(tablero[j]);
							/*} else if ((j == movimiento - 1) && ((j + 1) % 2 == 0)) {
								tablero[j] = 'O';
								System.out.print(tablero[j]);*/
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
