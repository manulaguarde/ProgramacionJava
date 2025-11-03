package ud3;

import java.util.Scanner;

/*
 * Que pida un número y diga si es primo o no.
 */

public class Hoja2Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, cont, suma=0;
		
		System.out.println("Ingrese un número para saber si es primo o no");
		
		num=entrada.nextInt();
		
		if (num>0) {
			for(cont=1;cont<=num/2;cont++) {
				
				if(num%cont==0) {
					suma++;
				}
			}
			if (suma==1) {
				System.out.println("El número es primo");
			}else {
				System.out.println("El número no es primo");
			}
				
		}else {
			System.out.println("el número no puede ser menor o igual a 0. No se considera un número primo");
		}
			


	}

}
