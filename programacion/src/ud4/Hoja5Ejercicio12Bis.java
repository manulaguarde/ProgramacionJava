package ud4;

/*
 * Que rellene un array de 20 enteros, utilizar una función.
 */

import java.util.Scanner;

public class Hoja5Ejercicio12Bis {

	static final int TAM=5;
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] numeros=new int[TAM]; //numeros apunta a una direccion de memoria (reserva 5 lugares)
		
		rellena(numeros);
		for(int i=0;i<TAM;i++) {
			System.out.print(numeros[i]+" ");
		}
		
	}
	// Los arrays se pasan por parámetros (y tambien los objetos)
	public static void rellena(int[]nums) { //nums apunta al mismo lugar que números
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduce número");
			nums[i]=entrada.nextInt();
		}
		
	}
}
