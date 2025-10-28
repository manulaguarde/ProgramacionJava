package ud3;

import java.util.Scanner;

public class Hoja2EjercicioFigurasB {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numFilas, numAsteriscos, numEspacios, filas=0, espacios=0, asteriscos=0;
		System.out.println("Ingresa el número de filas");
		numFilas=entrada.nextInt();
		
		numEspacios=numFilas-1;
		for(filas=0; filas<numFilas; filas++) {
			for(espacios=numEspacios;espacios>0;espacios--) {
				System.out.print(" ");
				}
			numEspacios--;
			for(numAsteriscos=0;numAsteriscos<=asteriscos;numAsteriscos++) {
				System.out.print("*");
			}
			asteriscos=asteriscos+2;
			System.out.println();
		}

	}

}
