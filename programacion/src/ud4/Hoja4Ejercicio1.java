package ud4;

// Que rellene un array con los 100 primeros números enteros y los muestre por pantalla en orden ascendente.

public class Hoja4Ejercicio1 {

	public static void main(String[] args) {
		
		//constantes
		final int TAM=5;
		//array
		int[] numeros;
		numeros =new int[TAM];
		int i=1,num=1;
		
		
		for (i=1;i<=TAM;i++) {
			numeros[i]=num;
			num++;
			
		}
		
		for (i=0;i<TAM;i++) {
			System.out.println(numeros[i]);
		}
	
	}

}
