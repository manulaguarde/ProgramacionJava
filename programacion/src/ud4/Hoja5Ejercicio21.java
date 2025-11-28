package ud4;

import java.util.Scanner;

/*
 * Que eleve un número cualquiera a una potencia cualquiera, mostrar en pantalla el
 * resultado, se debe utilizar la recursividad.
 */

public class Hoja5Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		System.out.println("Ingrese un número");
		int num=entrada.nextInt();
		System.out.println("Ingrese la potencia a la que lo quiere elevar");
		int potencia=entrada.nextInt();
		
		System.out.println(num+" elevado a la potencia "+potencia+" es "+mostrarNumElevado(num,potencia));
	}
	public static int mostrarNumElevado(int a, int b) {
		if(a==b) {
			
		}else {
			return mostrarNumElevado(a)*a;
		}
		
	}

}
