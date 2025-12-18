package ud5;

import java.util.Random;

/*
 * 14. Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a
28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la
barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */

public class HojaEjerciciosNumAleatoriosEj14 {

	public static void main(String[] args) {
		Random genAle=new Random();
		String [] notas= {"do","re","mi","fa","sol","la","si"};
		String primeraNota="";
		int ale=genAle.nextInt(7)+1;
		
		for(int i=0;i<ale;i++) {
			for(int j=0;j<4;j++) {
				String notaAle=notas[genAle.nextInt(notas.length)];
				if(i==0 && j==0) {
					primeraNota=notaAle;
					System.out.print(primeraNota+" ");
				}
				else if(i==ale-1 && j==3) {
					System.out.print(primeraNota);
				}
				else {
					System.out.print(notaAle+" ");
				}
			}
			if(i==ale-1) {
				System.out.print("||");
			}else {
				System.out.print("| ");
			}
		}

	}

}
