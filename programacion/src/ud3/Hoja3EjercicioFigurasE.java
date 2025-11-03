package ud3;

import java.util.Scanner;

public class Hoja3EjercicioFigurasE {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numFilas, fila, espacio, asterisco, numAsteriscos;
		
		System.out.println("Ingrese el número de filas");
		numFilas=entrada.nextInt();
		numAsteriscos=numFilas/2;
		for (fila=0;fila<=numFilas/2;fila++) {
			for (espacio=fila;espacio<=numFilas/2-1;espacio++) {
				System.out.print(" ");
			}
			for (asterisco=numFilas/2;asterisco<=numAsteriscos;asterisco++) {
				System.out.print("*");
			}
			numAsteriscos+=2;
			System.out.println();
		}
		numAsteriscos=numAsteriscos-4;
		for (fila=numFilas/2;fila<=numFilas;fila++) {
			for (espacio=numFilas/2;espacio<=fila;espacio++) {
				System.out.print(" ");
			}
			for (asterisco=numFilas/2;asterisco<=numAsteriscos;asterisco++) {
				System.out.print("*");
			}
			numAsteriscos-=2;
			System.out.println();
		}

	}

}
