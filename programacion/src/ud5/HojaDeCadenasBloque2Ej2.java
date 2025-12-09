package ud5;

import java.util.Scanner;

//  Programa que diga si una cadena dada por el usuario está o no vacía.

public class HojaDeCadenasBloque2Ej2 {

	public static void main(String[] args) {
		Scanner scaner=new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		String cad=scaner.nextLine();
		
		if (estaVacia(cad)) {
			System.out.println("La cadena está vacía");
		}else {
			System.out.println("La cadena no está vacía");
		}
	}
	public static boolean estaVacia(String cad) {
		if (cad!="") {
			for (int i=0;i<cad.length();i++) {
				if (cad.charAt(i)!=' ') {
					return false;
				}
			}
		}
		return true;

	}
			
		
	

}
