package ud5;

import java.util.Random;

/*
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados).
 */

public class HojaEjerciciosNumAleatoriosEj2 {

	public static void main(String[] args) {
		Random genAle= new Random();
		int suma=0;
		
		for(int i=0;i<3;i++) {
			int dado=genAle.nextInt(6)+1;
			suma=suma+dado;
			System.out.println(dado);
		}
		
		System.out.println("La suma es: "+suma);

	}

}
