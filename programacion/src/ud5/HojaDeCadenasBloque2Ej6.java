package ud5;

import java.util.Scanner;

//Elabora un programa que escriba todos los caracteres de una cadena cada uno en una línea.

public class HojaDeCadenasBloque2Ej6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingresa una cadena");
		String cad=scanner.nextLine();
		
		for (int i=0;i<cad.length();i++) {
			System.out.println(cad.charAt(i));
		}
		
	}

}
