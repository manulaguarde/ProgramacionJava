package ud4;

import java.util.Scanner;

//Que rellene un array con 20 números y luego busque un número concreto

public class Hoja4Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		final int TAM=3;
		int []num;
		num=new int [TAM];
		int i=0;
		int numBuscado;
		
		System.out.println("Ingrese "+TAM+" números");
		for(i=0;i<TAM;i++) {
			System.out.println("Introduce un numero: ");
			num[i]=entrada.nextInt();
		}
		
		System.out.println("Ingrese un número para saber donde se encuentra");
		numBuscado=entrada.nextInt();
		i=0;
		boolean numEncontrado=false;
		

		do {
			if(num[i]==numBuscado) {
				numEncontrado=true;
			}else {
				i++;
			}
			
		}while((numEncontrado==false)&&(i<TAM));
		
		if(numEncontrado==true) {
			System.out.println("Valor encontrado en la posicion: "+i);
		}else
			System.out.println("Valor no encontrado");
			
		
	

	}

}
