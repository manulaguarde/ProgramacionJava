package ud4;

import java.util.Scanner;

//Que lea 10 números por teclado, los almacene en un array y los ordene de forma ascendente.

public class Hoja4Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		int[] nums=new int [10];
		final int TAM=5;
		
		for(int i=0; i<TAM; i++) {
			System.out.println("Introduce un número");
			nums[i]=entrada.nextInt();
		}
		
		
	}

}
