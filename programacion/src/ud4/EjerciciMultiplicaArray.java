package ud4;

import java.util.Scanner;

public class EjerciciMultiplicaArray {
	static final int TAM=3;
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int opcion=0;
		do {
			System.out.println("Ingresa una opcion\n"
							+ "1. Para rellenar el array\n"
							+ "2. Para multiplicar el array por 2\n"
							+ "3. Para salir");
			opcion=entrada.nextInt();
			
			switch (opcion) {
			case 1:
				int[]array= rellenaArray();
				break;
			case 2:
				int []arrayMultiplicado=multiplicaArray(array);
				
				for(int i=0;i<TAM;i++) {
					System.out.println();
				}
				break;
			case 3:
				System.out.println("has salido");
			default:
				System.out.println("Opcion incorrecta");
			}
		}while(opcion!=3);

	}
	public static int[] rellenaArray(){
		int[]numero=new int[TAM];
		for(int i=0;i<TAM;i++) {
			System.out.println("Introduce un número");
			numero[i]=entrada.nextInt();
		}
		return numero;
	}
	public static int[] multiplicaArray(int[] array) { //tiene que devolver obligatoriamente el array
		int[]arrayMultPor2=new int[10];
		for (int i =0; i<TAM; i++) {
			
			arrayMultPor2[i]= array[i]*2;
		}
		return array;
	}

}
