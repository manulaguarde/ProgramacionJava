package ud5;

import java.util.Random;

/*
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
 * termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos
 * números se han generado.
 */

public class HojaEjerciciosNumAleatoriosEj9 {

	public static void main(String[] args) {
		Random genAle= new Random();
		int num=0, cont=0;
		
		do {
			num=genAle.nextInt(51)*2;
			cont++;
		}while(num!=24);

		System.out.println("Se han generado "+cont+" números");
	}

}
