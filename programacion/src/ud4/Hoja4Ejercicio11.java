package ud4;

//Que rellene un array con los 100 primeros números pares y muestre su suma.

public class Hoja4Ejercicio11 {

	public static void main(String[] args) {
		
		final int TAM=100;
		int [] numPares =new int[TAM];
		int cont=0, suma=0;

		for(int i=0;i<TAM;i++) {
			numPares[i]=cont;
			cont+=2; //la manera mas facil de sacar números pares
		}
		
		for(int i=0;i<TAM;i++) {
			System.out.print(numPares[i]+" ");
			suma=suma+numPares[i];
		}
		
		System.out.println("\n"+suma);

	}

}
