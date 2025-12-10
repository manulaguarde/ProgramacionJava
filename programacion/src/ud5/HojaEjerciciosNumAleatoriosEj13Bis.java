package ud5;

import java.util.Random;
import java.util.Scanner;

/*
 * El programa intentará adivinar el número que estás pensando – un número entre 0 y 100 –
 * teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el
 * número que estás pensando es mayor o menor que el que te acaba de decir.
 */

public class HojaEjerciciosNumAleatoriosEj13Bis {

	public static void main(String[] args) {
		Random genAle= new Random();
		Scanner entrada= new Scanner(System.in);
		int i=0, num=101, numMayor=100, numMenor=1,aux;
		
		boolean numAdivinado=false;
		
		System.out.println("Piensa un número del 1 al 100");
		numMayor=genAle.nextInt(101);
		System.out.println("Tu número es "+numMayor+"? s/n");
		char opcion =entrada.nextLine().charAt(0);
		
		do {
			if (opcion=='n') {
				System.out.println("Tu número es mayor o menor que ese número?");
				String mayorMenor=entrada.nextLine();
				
					if(mayorMenor=="menor") {
						//numMenor=numMayor;
						numMayor=genAle.nextInt(numMayor);
						System.out.println("Tu número es "+numMayor+"? s/n");
						opcion=entrada.nextLine().charAt(0);
					}else if(mayorMenor=="mayor"){
						
					}
			}else {
				numAdivinado=true;
			}
			i++;
			aux=numMayor;
		}while(numAdivinado==false || i<5);
	}

}
