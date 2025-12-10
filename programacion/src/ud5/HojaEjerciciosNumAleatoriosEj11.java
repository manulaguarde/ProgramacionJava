package ud5;

import java.util.Random;

/*
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
 * forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
 * suspensos, el número de suficientes, el número de bienes, etc.
 */

public class HojaEjerciciosNumAleatoriosEj11 {

	public static void main(String[] args) {
		Random genAle= new Random();
		String [] notas= {"Suspensos","Suficientes","Bienes","Notables","Sobresalientes"};
		int[] cantidadDeNotas=new int[5];
		
		for (int i=0;i<20;i++) {
			int nota=genAle.nextInt(5);
			cantidadDeNotas[nota]++;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(notas[i]+": "+cantidadDeNotas[i]);	
		}
		
	}

}
