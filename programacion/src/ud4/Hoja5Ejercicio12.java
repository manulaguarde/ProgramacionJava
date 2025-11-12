package ud4;

import java.util.Scanner;

//Que rellene un array de 20 enteros, utilizar una función.

public class Hoja5Ejercicio12 {
	
	//constantes globales
	static final int TAM=5; //variables/constantes globales (tengo que agregar static que quiere decir que es global)
	static Scanner entrada= new Scanner(System.in); //defino el scanner global (a partir de ahora sera siempre global)
	
	public static void main(String[] args) {
		
		int [] numeros=new int[TAM];
		numeros=rellenaArray();

		for (int i=0;i<TAM;i++) {
			System.out.print(numeros[i]+" ");
		}
	}
	
	public static int[] rellenaArray() { //int[] coincide con el array, es correcto
		int [] nums=new int[TAM];
		for(int i=0;i<TAM;i++) {
			System.out.println("Introduce número");
			nums[i]=entrada.nextInt();
		}
		return nums;
	}
	
	
}
