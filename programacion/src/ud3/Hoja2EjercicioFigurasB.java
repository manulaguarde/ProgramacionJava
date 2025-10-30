package ud3;

import java.util.Scanner;

public class Hoja2EjercicioFigurasB {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numFilas, numAsteriscos, numEspacios, fila=0, espacio=0, asterisco=0;
		System.out.println("Ingresa el número de filas");
		numFilas=entrada.nextInt();
		
		numEspacios=numFilas-1;
		for(fila=0; fila<numFilas; fila++) {
			for(espacio=numEspacios;espacio>0;espacio--) {
				System.out.print(" ");
			}
			numEspacios--;
			for(numAsteriscos=0;numAsteriscos<=asterisco;numAsteriscos++) {
				System.out.print("*");
			}
			asterisco=asterisco+2;
			System.out.println();
		}

	}

}
