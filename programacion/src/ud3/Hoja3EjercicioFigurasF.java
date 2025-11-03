package ud3;

import java.util.Scanner;

public class Hoja3EjercicioFigurasF {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numFilas, fila, espacio, espacioInter, numEspacios=0;
		System.out.println("Introduce el número de filas");
		numFilas=entrada.nextInt();
		
		for(fila=0;fila<=numFilas/2;fila++) {
			for(espacio=fila+1;espacio<=numFilas/2;espacio++) {
				System.out.print(" ");
			}
			if (fila>0) {
				System.out.print("*");
			}
			for(espacioInter=1;espacioInter<numEspacios;espacioInter++) {
				System.out.print(" ");
			}
			numEspacios+=2;
			System.out.println("*");
		}
		numEspacios=numEspacios-4;
		for(fila=numFilas/2;fila<numFilas;fila++) {
			for(espacio=numFilas/2;espacio<=fila;espacio++) {
				System.out.print(" ");
			}
			if(fila<numFilas-1) {
				System.out.print("*");
			}
			for(espacioInter=1;espacioInter<numEspacios;espacioInter++) {
				System.out.print(" ");
			}
			numEspacios-=2;
			if (numFilas%2!=0 && (fila==numFilas-2||fila==numFilas-1)) {
				System.out.println(" ");
			}else {
				System.out.println("*");
			}
		}

	}

}
