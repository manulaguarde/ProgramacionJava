package ud3;

import java.util.Scanner;

public class Hoja3EjercicioFigurasC {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numFilas, fila,numEspacios, espaciosExt, espaciosInt, ultFila, numEspaciosInt, asterisco, numAsteriscos=0;
		
		System.out.println("Ingresa el número de filas");
		numFilas= entrada.nextInt();
		
		numEspacios=numFilas-1;
		numEspaciosInt=0;
		for(fila=1;fila<numFilas;fila++) {
			
			for(espaciosExt=numEspacios;espaciosExt>0;espaciosExt--) {
				
				System.out.print(" ");	
			}
			numEspacios--;
			System.out.print("*");
			for(espaciosInt=1;espaciosInt<numEspaciosInt;espaciosInt++) {
				System.out.print(" ");
				
			}
			numEspaciosInt+=2;
			for(asterisco=1;asterisco==numAsteriscos;asterisco--) {
					System.out.print("*");
				}
			numAsteriscos=1*1;
			System.out.println();
		}
		for(ultFila=1;ultFila<=(numFilas*2)-1;ultFila++) {
			System.out.print("*");
		}
		
	}

}
