package ud5;

import java.util.Scanner;

//. Pedir al usuario su nombre y saludarlo.

public class HojaDeCadenasBloque2Ej1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		String nombre=scanner.nextLine();
		
		System.out.println("Hola "+nombre+"!");

	}

}
