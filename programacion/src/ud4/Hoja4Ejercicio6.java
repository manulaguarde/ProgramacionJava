package ud4;

import java.util.Scanner;

//Que lea 10 números por teclado, los almacene en un array y muestre la suma,
//resta, multiplicación y división de todos.

public class Hoja4Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		final int TAM=10;
		int[] array=new int[TAM];
		int suma=0, resta=0, multiplicacion=1;
		double division=1;
		
		for(int i=0;i<TAM;i++) {
			do {
				System.out.println("Introduzca un número");
				array[i]=entrada.nextInt();
			}while(array[i]==0);
		}
		//inicializamos las variables al valor de la primera posicion del array
		division=array[0];
		suma=array[0];
		resta=array[0];
		multiplicacion=array[0];
		
		for (int i=1;i<TAM;i++) {
			suma=suma+array[i];
			resta=resta-array[i];
			multiplicacion=multiplicacion*array[i];
			division=division/array[i];
		}
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
	}

}
