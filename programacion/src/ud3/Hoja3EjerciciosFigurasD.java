package ud3;

import java.util.Scanner;

public class Hoja3EjerciciosFigurasD {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numFilas, fila, asterisco, espacio;
		
		System.out.println("Ingrese número de filas");
		numFilas=entrada.nextInt();
		
		for(fila=1;fila<=numFilas;fila++) {
			
			if (fila==1 || fila==numFilas) {
				for(asterisco=0;asterisco<numFilas;asterisco++) {
					System.out.print("*");
				}	
			}else {
				System.out.print("*");
				for(espacio=0;espacio<numFilas-2;espacio++) {
				System.out.print(" ");
				}
				System.out.print("*");
				
			}
		System.out.println();
			
		}
	
	}

}
