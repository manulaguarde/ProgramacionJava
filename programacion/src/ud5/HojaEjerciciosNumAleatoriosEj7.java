package ud5;

import java.util.Random;

/*
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 * partidos y el pleno al quince (15 filas).
 */

public class HojaEjerciciosNumAleatoriosEj7 {

	public static void main(String[] args) {
		Random genAle= new Random();
		char [] apuesta= {'X','1','2'};
		char [] apuestaPleno= {'0','1','2','M'};
		
		//System.out.println("           Ap 1 Ap 2 Ap3");
		for (int i=0;i<14;i++) {
			System.out.print("Partido "+(i+1)+": ");
			for (int j=0;j<3;j++) {
				System.out.print("Apuesta "+(j+1)+": "+apuesta[genAle.nextInt(3)]+" |");
			}
			System.out.println();
		}
		System.out.print("Partido 15: ");
		for (int i=0;i<3;i++) {
			System.out.print("Apuesta "+(i+1)+": "+apuestaPleno[genAle.nextInt(4)]+"-"+apuestaPleno[genAle.nextInt(4)]+" |");
		
		}

	}

}
