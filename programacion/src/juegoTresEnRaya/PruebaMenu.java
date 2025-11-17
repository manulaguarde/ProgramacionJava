package juegoTresEnRaya;

import java.util.Scanner;

public class PruebaMenu {
	static Scanner entrada=new Scanner(System.in);
	static char[] tablero=new char[9];
	static int victoriasJugador1=0;
	static int victoriasJugador2=0;
	static int empates=0;
	public static void main(String[] args) {

		int opcion;

		
		do {
			System.out.println("1. Jugar una partida\n"
					+ "2. Mostrar estadísticas\n"
					+ "3. Salir\n"
					+ "Seleccione una opción:");
			opcion=entrada.nextInt();
			
			int i=0;
			switch (opcion){
				case 1:
					dibujaTablero();
					
					do{
						System.out.println("Introduzca movimiento (Jugador 1)");
						int movimiento1 = entrada.nextInt();

						while(movimientoValido(movimiento1)==false) {
							System.out.println("Movimiento no válido. Jugador 1: vuelve a ingresar otro movimiento");
							movimiento1=entrada.nextInt();
						}
						mueveJugador1(movimiento1);
						if(ganaJugador1()) {
							System.out.println("Ha ganado el jugador 1!");
							victoriasJugador1+=1;
							break;
						}
						i++;
						if(i>=9) {
							System.out.println("Empate");
							empates+=1;
						}else {
							System.out.println("Introduzca movimiento (Jugador 2)");
							int movimiento2 = entrada.nextInt();
							while(movimientoValido(movimiento2)==false) {
								System.out.println("Movimiento no válido. Jugador 2: vuelve a ingresar otro movimiento");
								movimiento2=entrada.nextInt();
							}
							mueveJugador2(movimiento2);
						}
						if(ganaJugador2()) {
							System.out.println("Ha ganado el jugador 2!");
							victoriasJugador2+=1;
							break;
						}
						i++;
					}while(i<9);
					
					iniciar();
					
					break;
				case 2:
					System.out.println("Estadísticas:\n"
									+ "El Jugador 1 ha ganado "+victoriasJugador1+" veces\n"
									+ "El jugador 2 ha ganado "+victoriasJugador2+" veces\n"
									+ "Hubieron "+empates+" partidas que acabaron en empate");
					break;
				case 3: 
					System.out.println("Has salido");
					break;
				default: 
					System.out.println("Opcion incorrecta");
			}
			
			
		}while(opcion!=3);

	}
	// Tablero de 3x3, 9 casilleros 
	// (7 filas x13 columas en espacio de código)
	public static void dibujaTablero(){
		// Iniciación variable del contenido
		int i=1;
		// Bucle que controla las filas del tablero
		for(int filas=1;filas<=7;filas++) {
			 // Filas impares
			if(filas%2!=0)
				System.out.print("-------------");
			// Filas pares
			if(filas%2==0) {
				// Bucle que controla las columnas (13 espacios por fila)
				for(int columna=1; columna<=13; columna++) {
					// 4 barras verticales (laterales de los casilleros)
					if(columna==1||columna==5||columna==9||columna==13)
						System.out.print("|");
					// Espacios sin contenido (que simepre son pares)
					if(columna%2==0)
						System.out.print(" ");
					// Contenido del casillero (del 1 al 9)
					if(columna==3||columna==7||columna==11) {
						System.out.print(i);
						// Se incrementa el contenido para la siguiente casilla 
						i++;
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void mueveJugador1(int pos) {
		int i=0;
		for (int filas = 1; filas <= 7; filas++) {
				if (filas % 2 != 0)
					System.out.print("-------------");
			if (filas % 2 == 0) { 		
				for (int columna = 1; columna <= 13; columna++) {
					if(columna==1||columna==5||columna==9||columna==13) 
						System.out.print("|");
					if(columna%2==0) 
						System.out.print(" ");
					if(columna==3||columna==7||columna==11) { 
						if (i == pos - 1) { 
							tablero[i] = 'X'; 
							System.out.print(tablero[i]);
						}else { //
								System.out.print(tablero[i]); 
						}
						i++;
					}
				}
			}
			System.out.println();
		}
		
	}
	public static void mueveJugador2(int pos) {
		int i=0;
		for (int filas = 1; filas <= 7; filas++) {
				if (filas % 2 != 0)
					System.out.print("-------------"); 
			if (filas % 2 == 0) { 	
				for (int columna = 1; columna <= 13; columna++) {
					if(columna==1||columna==5||columna==9||columna==13) 
						System.out.print("|");
					if(columna%2==0) 
						System.out.print(" ");
					if(columna==3||columna==7||columna==11) {  
						if (i == pos - 1) { 
							tablero[i] = 'O'; 
							System.out.print(tablero[i]);
						}else { //
								System.out.print(tablero[i]);
						}
						i++;
					}
				}
			}
			System.out.println();
		}
	}
	
	public static boolean ganaJugador1() {
		// Victorias horizontales
		if (tablero[0]=='X' && tablero[1]=='X' && tablero[2]=='X') {
			return true;
		}
		if (tablero[3]=='X' && tablero[4]=='X' && tablero[5]=='X') {
			return true;
		}
		if (tablero[6]=='X' && tablero[7]=='X' && tablero[8]=='X') {
			return true;
		}
		// Victorias verticales
		if (tablero[0]=='X' && tablero[3]=='X' && tablero[6]=='X') {
			return true;
		}
		if (tablero[1]=='X' && tablero[4]=='X' && tablero[7]=='X') {
			return true;
		}
		if (tablero[2]=='X' && tablero[5]=='X' && tablero[8]=='X') {
			return true;
		}
		// Victorias en diagonal
		if (tablero[0]=='X' && tablero[4]=='X' && tablero[8]=='X') {
			return true;
		}
		if (tablero[2]=='X' && tablero[4]=='X' && tablero[6]=='X') {
			return true;
		}
		
		return false;
		
	}
	public static boolean ganaJugador2() {
		// Victorias horizontales
		if (tablero[0]=='O' && tablero[1]=='O' && tablero[2]=='O') {
			return true;
		}
		if (tablero[3]=='O' && tablero[4]=='O' && tablero[5]=='O') {
			return true;
		}
		if (tablero[6]=='O' && tablero[7]=='O' && tablero[8]=='O') {
			return true;
		}
		// Victorias verticales
		if (tablero[0]=='O' && tablero[3]=='O' && tablero[6]=='O') {
			return true;
		}
		if (tablero[1]=='O' && tablero[4]=='O' && tablero[7]=='O') {
			return true;
		}
		if (tablero[2]=='O' && tablero[5]=='O' && tablero[8]=='O') {
			return true;
		}
		// Victorias en diagonal
		if (tablero[0]=='O' && tablero[4]=='O' && tablero[8]=='O') {
			return true;
		}
		if (tablero[2]=='O' && tablero[4]=='O' && tablero[6]=='O') {
			return true ;
		}
		
		return false;
	}
	public static void iniciar() {
		// Se vuelven a poner todos los valores del tablero vacíos
		for(int i=0;i<9;i++) tablero[i]=' ';
	}
	public static boolean movimientoValido(int pos) {
		
		if ((pos>=1 || pos<=9) && (tablero[pos-1]!='X' && tablero[pos-1]!='O')){
			
			return true;
		}else {
			return false;
		}
	}
}
