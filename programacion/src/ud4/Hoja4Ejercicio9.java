package ud4;

import java.util.Scanner;

//Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y muestre el segundo array

public class Hoja4Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int[]arrayUno= new int[5];
		int[]arrayDos=new int [5];
	
		int i=0, j=0;
		
		for (i=0; i<5; i++) {
			System.out.println("Introduce un número");
			arrayUno[i]=entrada.nextInt();
			arrayDos[j]=arrayUno[i]*2;
			j++;
		}
		
		for (j=0;j<5;j++) {
			System.out.print(arrayDos[j]+", ");
			
		}
	}

}
