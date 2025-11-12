package ud4;

import java.util.Scanner;

//Que realice la media de dos números, utilizar una función.

public class Hoja5Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int num1=entrada.nextInt();
		System.out.println("Ingrese otro número");
		int num2=entrada.nextInt();
		
		double resultado=media(num1,num2);
		System.out.println(resultado);
		
		
	}
	public static double media(int a, int b) { //los parametros pueden ser de un tipo (int) y lo que devuelve otro tipo (double)
		
		double resultado=(a+b)/2.0; // para convertir la division en decimal, o hago un casting (double) antes, o
									// uno de los dos parametros a dividir lo transformo en decimal
		return resultado;
	}

}
