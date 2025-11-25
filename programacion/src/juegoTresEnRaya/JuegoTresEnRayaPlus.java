package juegoTresEnRaya;

import java.util.Scanner;

public class JuegoTresEnRayaPlus {

	// Declaración variables globales
	static Scanner entrada = new Scanner(System.in);
	static char[] tablero = new char[9];
	// Contadores para estadísticas y última partida
	static int victoriasJugador1 = 0, victoriasJugador2 = 0, empates = 0, k = 0, a=0;
	static char[][] ultimaPartida = new char[9][9];

	public static void main(String[] args) {

		int opcion;

		do {
			System.out.println("1. Jugar una partida\n" + "2. Mostrar estadísticas\n" + "3. Última Partida\n"
					+ "4. Salir\n" + "Seleccione una opción:");
			opcion = entrada.nextInt();
			entrada.nextLine();

			int i = 0;
			switch (opcion) {
			case 1:
				// Tablero orientativo para conocer las posiciones
				dibujaTablero();

				do {
					// Movimiento Jugador 1
					System.out.println("Introduzca movimiento (Jugador 1)");
					int movimiento1 = entrada.nextInt();
					// Comprobación movimiento válido
					while (movimientoValido(movimiento1) == false) {
						System.out.println("Movimiento no válido. Jugador 1: vuelve a ingresar otro movimiento");
						movimiento1 = entrada.nextInt();
					}
					// Movimiento Jugador 1 en el tablero
					mueveJugador1(movimiento1);
					rellenarUltimaPartida(tablero);
					// Victoria Jugador 1
					if (ganaJugador1()) {
						System.out.println("Ha ganado el jugador 1!");
						victoriasJugador1 += 1;
						break;
					}
					i++;
					// Si no hay ganador y no quedan movimientos
					if (i >= 9) {
						System.out.println("Empate");
						empates += 1;
					} else {
						// Movimiento Jugador 2
						System.out.println("Introduzca movimiento (Jugador 2)");
						int movimiento2 = entrada.nextInt();
						// Comprobacion del movimiento
						while (movimientoValido(movimiento2) == false) {
							System.out.println("Movimiento no válido. Jugador 2: vuelve a ingresar otro movimiento");
							movimiento2 = entrada.nextInt();
						}
						// Movimiento valido Jugador 2 en el tablero
						mueveJugador2(movimiento2);
						rellenarUltimaPartida(tablero);
					}
					if (ganaJugador2()) {
						System.out.println("Ha ganado el jugador 2!");
						victoriasJugador2 += 1;
						break;
					}
					i++;
				} while (i < 9); // Cantidad de movimientos posibles
				// Reinicio de tablero vacío
				if (i<9) {
					a=i+1;
				}else {
					a=i-1;
				}
				iniciar();
				k=0;

				break;
			case 2:
				// Estadísticas
				System.out.println("Estadísticas:\n" + "El Jugador 1 ha ganado " + victoriasJugador1 + " veces\n"
						+ "El jugador 2 ha ganado " + victoriasJugador2 + " veces\n" + "Hubieron " + empates
						+ " partidas que acabaron en empate");
				break;
			case 3:
				System.out.println("Así fueron las jugadas de la última partida");
				mostrarUltimaPartida(a);
				break;

			case 4:
				System.out.println("Has salido");
				break;

			default:
				System.out.println("Opcion incorrecta");
			}
		} while (opcion != 4);

	}

	// Tablero de 3x3, 9 casilleros, con las posiciones
	public static void dibujaTablero() {
		int i = 1;
		System.out.println("-------------");
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 3; columnas++) {
				System.out.print("| " + i + " ");
				i++;
			}
			System.out.println("|\n-------------");

		}
	}

	// Movimiento jugador 1
	public static void mueveJugador1(int pos) {
		int i = 0;
		System.out.println("-------------");
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 3; columnas++) {
				if (i == pos - 1) {
					tablero[i] = 'X';
					System.out.print("| " + tablero[i] + " ");
				} else {
					System.out.print("| " + tablero[i] + " ");
				}
			i++;
			}
			System.out.println("|\n-------------");

		}

	}

	// Movimiento jugador 2
	public static void mueveJugador2(int pos) {
		int i = 0;
		System.out.println("-------------");
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 3; columnas++) {
				if (i == pos - 1) {
					tablero[i] = 'O';
					System.out.print("| " + tablero[i] + " ");
				} else {
					System.out.print("| " + tablero[i] + " ");
				}
			i++;
			}
			System.out.println("|\n-------------");
		}
	}

	// Comprueba si gana el jugador 1
	public static boolean ganaJugador1() {
		// Victorias horizontales
		if (tablero[0] == 'X' && tablero[1] == 'X' && tablero[2] == 'X') {
			return true;
		}
		if (tablero[3] == 'X' && tablero[4] == 'X' && tablero[5] == 'X') {
			return true;
		}
		if (tablero[6] == 'X' && tablero[7] == 'X' && tablero[8] == 'X') {
			return true;
		}
		// Victorias verticales
		if (tablero[0] == 'X' && tablero[3] == 'X' && tablero[6] == 'X') {
			return true;
		}
		if (tablero[1] == 'X' && tablero[4] == 'X' && tablero[7] == 'X') {
			return true;
		}
		if (tablero[2] == 'X' && tablero[5] == 'X' && tablero[8] == 'X') {
			return true;
		}
		// Victorias en diagonal
		if (tablero[0] == 'X' && tablero[4] == 'X' && tablero[8] == 'X') {
			return true;
		}
		if (tablero[2] == 'X' && tablero[4] == 'X' && tablero[6] == 'X') {
			return true;
		}

		return false;

	}

	// Comprueba si gana el jugador 2
	public static boolean ganaJugador2() {
		// Victorias horizontales
		if (tablero[0] == 'O' && tablero[1] == 'O' && tablero[2] == 'O') {
			return true;
		}
		if (tablero[3] == 'O' && tablero[4] == 'O' && tablero[5] == 'O') {
			return true;
		}
		if (tablero[6] == 'O' && tablero[7] == 'O' && tablero[8] == 'O') {
			return true;
		}
		// Victorias verticales
		if (tablero[0] == 'O' && tablero[3] == 'O' && tablero[6] == 'O') {
			return true;
		}
		if (tablero[1] == 'O' && tablero[4] == 'O' && tablero[7] == 'O') {
			return true;
		}
		if (tablero[2] == 'O' && tablero[5] == 'O' && tablero[8] == 'O') {
			return true;
		}
		// Victorias en diagonal
		if (tablero[0] == 'O' && tablero[4] == 'O' && tablero[8] == 'O') {
			return true;
		}
		if (tablero[2] == 'O' && tablero[4] == 'O' && tablero[6] == 'O') {
			return true;
		}

		return false;
	}

	public static void iniciar() {
		// Se vuelven a poner todos los valores del tablero vacíos
		for (int i = 0; i < 9; i++) {
			tablero[i] = ' ';
		}
		/*for(int i=0;i<9;i++) {
			for (int j=0;j<9;j++) {
				ultimaPartida[i][j]=' ';
			}
		}*/
	}

	public static boolean movimientoValido(int pos) {
		// Se comprueba que el movimiento (pasado por parámetro) sea entre 1 y 9
		// (casilleros válidos) y que se encuentre vacío
		if ((pos >= 1 && pos <= 9) && (tablero[pos - 1] != 'X' && tablero[pos - 1] != 'O')) {

			return true;
		} else {
			return false;
		}
	}

	public static boolean quedanCasillas() {
		// Función para corroborar si no quedan casilleros en caso de empate
		char revisaTablero;
		for (int i = 0; i < 9; i++) {
			revisaTablero = tablero[i];
			if (revisaTablero == ' ') {
				return true;
			}
		}
		return false;
	}

	// Rellena el array bidimensional de carácteres con todas las posiciones del
	// tablero, por turno
	public static void rellenarUltimaPartida(char[] tablero) {
		for (int j = 0; j < 9; j++) {
			ultimaPartida[k][j] = tablero[j];

		}
		k++;
	}

	// Muestra el estado del tablero y el movimiento hecho por el jugador turno por
	// turno
	public static void mostrarUltimaPartida(int a) {
		
		for (int i = 0; i < a; i++) {
			System.out.println("Jugada "+(i+1));
			
			int j = 0;
			System.out.println("-------------");
			for (int filas = 0; filas < 3; filas++) {
				for (int columnas = 0; columnas < 3; columnas++) {
					System.out.print("| " + ultimaPartida[i][j] + " ");
					j++;
				}
				System.out.println("|\n-------------");

			}
		}
	}
}