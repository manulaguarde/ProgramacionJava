package ud3;
/*
 * 2. Número Perfecto. Escribe un método en Java que determine si un número es un "número
 *	perfecto". Un número es perfecto si la suma de sus divisores propios (excluyendo a sí mismo)
 *	es igual al número. Por ejemplo, 28 es un número perfecto porque sus divisores propios son 1,
 *	2, 4, 7, y la suma de ellos es 1 + 2 + 4 + 7 = 14, que es igual a 28.
 * 
 */

import java.util.Scanner;

public class Hoja3Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, divisor, suma=0, cont;
		
		System.out.println("Ingrese un número para conocer si es un número perfecto o no");
		num=entrada.nextInt();
		
		
		for (divisor=1;divisor<num;divisor++) {
			if(num%divisor==0) {
			suma=suma+divisor;
			}
			
		}
		if(num==suma) {
			System.out.println("El número es perfecto");
		}else {
			System.out.println("El número no es perfecto");
		}
		
	}

}
