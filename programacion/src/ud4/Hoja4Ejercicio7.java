package ud4;

import java.util.Scanner;

//Que lea 10 números por teclado, los almacene en un array y los ordene de forma ascendente.

public class Hoja4Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		final int TAM=5;
		int[] nums=new int [TAM];
		
		boolean cambio=false;
		
		for(int i=0; i<TAM; i++) {
			System.out.println("Introduce un número");
			nums[i]=entrada.nextInt();
		}
		int i=0;
		int aux=0;
		do {
			cambio=false;
			for(i=0;i<TAM-1;i++) {
				if(nums[i]>nums[i+1]) {
					aux=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=aux;
					cambio=true;
				}
			}
			
		}while(cambio==true);
		
		
	}

}
