package ud5;

import java.util.Random;
import java.util.Scanner;

/*
 * El programa intentará adivinar el número que estás pensando – un número entre 0 y 100 –
 * teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el
 * número que estás pensando es mayor o menor que el que te acaba de decir.
 */
public class HojaEjerciciosNumAleatoriosEj13 {
	static Random genAle = new Random();

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random genAle = new Random();
		int min = 0, max = 100, numAle, i=1;
		String opcion, mayorMenor;

		System.out.println("Piensa un número entre 0 y 100");
		numAle = genAle.nextInt(101);

		do {
			System.out.println("Tu número es: " + numAle + "? si/no");
			opcion = entrada.nextLine();
			if (opcion.equalsIgnoreCase("no") && i<5) {
				System.out.println("Tu número es mayor o menor que " + numAle + "?");
				mayorMenor=entrada.nextLine();
				if (mayorMenor.equalsIgnoreCase("mayor")) {
					min=numAle;
					numAle=genAle.nextInt(max-min)+min;
				}else if (mayorMenor.equalsIgnoreCase("menor")) {
					max=numAle;
					numAle=genAle.nextInt(max-min)+min;
				}
			}
			i++;
		} while (opcion.equalsIgnoreCase("no") && i<6);
		
		if (opcion.equalsIgnoreCase("si")) {
			System.out.println("Adiviné tu número");
		}else {
			System.out.println("No logré adivinar tu número");
		}
	}

}
