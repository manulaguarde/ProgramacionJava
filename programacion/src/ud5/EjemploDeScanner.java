package ud5;

import java.util.Scanner;

public class EjemploDeScanner {

	public static void main(String[] args) {
		// CONSTRUYO UN OBJETO
		
		Scanner scanner; //el nombre del objeto es el mismo de la clase pero en minúscula
		
		scanner= new Scanner(System.in); //Reservamos memoria ram con new y lo siguiente es un metodo con el parámetro System.in (buffer del teclado)
		
		System.out.println("Introduce un número");
		int num=0;
		
		//este metodo lee c comprueba si el siguiente elemento del buffer del teclado es un entero
		// por último retrocede el cursor al inicio para ser leído
		boolean esEntero=scanner.hasNextInt();
		
		if (esEntero) {
			System.out.println("Es entero");
			num = scanner.nextInt();
		}else {
			System.out.println("No es entero");
		}
		
		System.out.println("El número leido es: "+num);

	}

}
