package ud5;

import java.util.Random;
import java.util.Scanner;

/*
 * El programa intentará adivinar el número que estás pensando – un número entre 0 y 100 –
 * teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el
 * número que estás pensando es mayor o menor que el que te acaba de decir.
 */
public class HojaEjerciciosNumAleatoriosEj13 {
	static Random genAle=new Random();
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num,i=0;
		char opcion;
		String mayorMenor;
		
		System.out.println("Piensa un número entre 0 y 100");
		num=genAle.nextInt(101);
		
		
		System.out.println("Tu número es: "+num+"? s/n");
		opcion=entrada.nextLine().charAt(0);
		if(!numAdivinado(opcion)) {
			do {
				System.out.println("Tu número es mayor? o menor?");
				mayorMenor=entrada.nextLine();
			}while (!esMayorOMenor(num,mayorMenor)); 
				
			
		}
		
		
	}
	public static int esMayorOMenor(int num, String mayor) {
		if (mayor=="mayor") {
			num=genAle.nextInt()
		}
	}
	public static boolean numAdivinado (char opcion) {
		if (opcion=='s')
			return true;
		
		return false;
	}

}
