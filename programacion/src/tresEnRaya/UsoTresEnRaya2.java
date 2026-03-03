package tresEnRaya;

import java.util.Random;
import java.util.Scanner;

public class UsoTresEnRaya2 {

	static Scanner scanner = new Scanner(System.in);
	static int opcion, movimiento;
	static boolean gana;
	static TresEnRaya2 juego = new TresEnRaya2();

	public static void main(String[] args) {
		do {
			System.out.println("Ingrese la modalidad de juego:\n1.Jugador vs. Jugador\n2.Jugador vs. Ordenador"
					+ "\n3.Ordenador vs. ordenador\n4.Salir");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				juego.Iniciar();
				juego.dibujaTablero();
				gana = false;
				juego.setFicha(elijeFicha());
				do {
					juegaJugador1();
					juegaJugador2();
				} while (!gana);
				break;
			case 2:
				Random opcionAle = new Random();
				int elijeQuienComienza = opcionAle.nextInt(2);
				if (elijeQuienComienza == 1) {
					System.out.println("Comienza el Jugador!");
					juego.Iniciar();
					juego.dibujaTablero();
					gana = false;
					do {
						juegaJugador1();
						juegaOrdenador2();
					} while (!gana);
				} else {
					System.out.println("Comienza el Ordenador");
					juego.Iniciar();
					juego.dibujaTablero();
					gana = false;
					do {
						juegaOrdenador1();
						juegaJugador2();
					} while (!gana);
				}
				break;
			case 3:
				juego.Iniciar();
				juego.dibujaTablero();
				gana = false;
				do {
					juegaOrdenador1();
					juegaOrdenador2();
				} while (!gana);

				break;
			case 4:
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("Opcion incorrecta vuelve a ingresar");
			}
		} while (opcion != 4);
	}

	public static void juegaJugador1() {
		System.out.println("Mueve Jugador 1");
		movimiento = scanner.nextInt();
		while (!juego.movimientoValido(movimiento)) {
			System.out.println("Movimiento no válido");
			System.out.println("Mueve jugador 1");
			movimiento = scanner.nextInt();
		}
		juego.mueveJugador1(movimiento);
		juego.dibujaTablero();
		if (juego.ganaJugador1()) {
			System.out.println("Ha ganado el Jugador 1!");
			gana = true;
		} else if (!juego.quedanCasillas()) {
			System.out.println("Es empate");
			gana = true;
		}
	}

	public static void juegaJugador2() {
		if (gana == false) {
			System.out.println("Mueve Jugador 2");
			movimiento = scanner.nextInt();
			while (!juego.movimientoValido(movimiento)) {
				System.out.println("Movimiento no válido");
				System.out.println("Mueve jugador 2");
				movimiento = scanner.nextInt();
			}
			juego.mueveJugador2(movimiento);
			juego.dibujaTablero();
			if (juego.ganaJugador2()) {
				System.out.println("Ha ganado el Jugador 2!");
				gana = true;
			} else if (!juego.quedanCasillas()) {
				System.out.println("Es empate");
				gana = true;
			} else {
				gana = false;
			}
		}
	}

	public static void juegaOrdenador1() {
		System.out.println("Mueve Ordenador 1");
		juego.mueveOrdenador1();
		;
		juego.dibujaTablero();
		if (juego.ganaJugador1()) {
			System.out.println("Ha ganado el Ordenador 1!");
			gana = true;
		} else if (!juego.quedanCasillas()) {
			System.out.println("Es empate");
			gana = true;
		}
	}

	public static void juegaOrdenador2() {
		if (gana == false) {
			System.out.println("Mueve Ordenador 2");
			juego.mueveOrdenador2();
			juego.dibujaTablero();
			if (juego.ganaJugador2()) {
				System.out.println("Ha ganado el Ordenador 2!");
				gana = true;
			} else if (!juego.quedanCasillas()) {
				System.out.println("Es empate");
				gana = true;
			} else {
				gana = false;
			}
		}
	}
	public static char elijeFicha() {
		System.out.println("Elije la ficha");
		char ficha=scanner.nextLine().charAt(0);
		
		return ficha;
	}
}
