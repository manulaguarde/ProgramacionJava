package juegoTresEnRaya;

import java.util.Scanner;

public class PruebaMenu {
	static Scanner entrada=new Scanner(System.in);
	static char[] tablero=new char[9];
	public static void main(String[] args) {

		int j=1;
		int opcion;
		
		do {
			System.out.println("1. Jugar una partida\n"
					+ "2. Mostrar estadísticas\n"
					+ "3. Salir\n"
					+ "Seleccione una opción:");
			opcion=entrada.nextInt();
			
			switch (opcion){
				case 1:
					dibujaTablero();
					mueveJugador1();
					mueveJugador2();
					mueveJugador1();
					mueveJugador2();

					break;
				case 2:
					break;
				case 3: 
					System.out.println("Has salido");
					break;
				default: 
					System.out.println("Opcion incorrecta");
			}
			
			
		}while(opcion!=3);

	}
	public static void dibujaTablero(){
		int j=1;
		for(int i=1;i<=7;i++) {
			for(int raya=1;raya<=13;raya++) {
				if(i%2!=0)
				System.out.print("-");
			}
			for(int barra=1; barra<4; barra++) {
				if(i%2==0) {
					System.out.print("|");
					for(int espacio=1;espacio==1;espacio++) {
						System.out.print(" ");
						for(int numero=1;numero==1;numero++){
							System.out.print(j);
						}
						j++;
						System.out.print(" ");
					}
				}
			}
			if(i%2!=0) {
				System.out.println();
			}else {
				System.out.println("|");
			}
		}
	}
	
	public static void mueveJugador1() {
		System.out.println("Ingrese un movimiento");
		int movimiento = entrada.nextInt();
		int j=0;
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
	public static void mueveJugador2() {
		int j=0;
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
							/*if (j == movimiento - 1) {
								tablero[j] = 'X';
								System.out.print(tablero[j]);
							}*/if (j == movimiento - 1) {
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
