package ud4;

import java.util.Scanner;

/*
 * Que lea 10 números por teclado, 5 para un array y 5 para otro array distinto.
 * Mostrar los 10 números en pantalla mediante un solo array.
 */

public class Hoja4Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int[] arrayUno=new int [5];
		int[] arrayDos=new int [5];
		int[] sumaArrays=new int [10];
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Introduce un número");
			arrayUno[i]=entrada.nextInt();
		}
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un número");
			arrayDos[i]=entrada.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(i<5) {
				sumaArrays[i]=arrayUno[i];
				System.out.println(sumaArrays[i]);
			}else {
				sumaArrays[i]=arrayDos[i-5];
				System.out.println(sumaArrays[i]);
			}
			
		}
		
	}

}
