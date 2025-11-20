package ud4;

import java.util.Scanner;

public class EjerciciMultiplicaArray {
	static final int TAM=3;
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int opcion=0;
		int[] array=new int[TAM];
		do {
			System.out.println("Ingresa una opcion\n"
							+ "1. Para rellenar el array\n"
							+ "2. Para multiplicar el array por 2\n"
							+ "3. Para salir");
			opcion=entrada.nextInt();
			
			switch (opcion) {
			case 1:
				
				rellenaArray(array);
				break;
			case 2:
				int[] arrayMultiplicado=multiplicaArray(array);
				
				for(int i=0;i<TAM;i++) {
					System.out.println(arrayMultiplicado[i]);
				}
				break;
			case 3:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}while(opcion!=3);

	}
	public static void rellenaArray(int []nums){
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Introduce un número");
			nums[i]=entrada.nextInt();
		}
		
	}
	public static int[] multiplicaArray(int[] nums) { //tiene que devolver obligatoriamente el array
		int[]arrayMultPor2=new int[10];
		for (int i =0; i<TAM; i++) {
			
			arrayMultPor2[i]= nums[i]*2;
		}
		return arrayMultPor2;
	}

}
