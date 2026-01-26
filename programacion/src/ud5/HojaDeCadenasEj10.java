package ud5;

import java.util.Scanner;

public class HojaDeCadenasEj10 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Introduce una cadena");
		String cad=scanner.nextLine();
		
		String cadInvertida=invierteCadena(cad);
		
		if(compruebaPalindromo(cadInvertida,cad)) {
			System.out.println("La palabra es palíndromo");
		}
		else {
			System.out.println("La palabra no es palíndromo");
		}
			

	}
	public static String invierteCadena(String cad) {
		
		String cadInvertida="";
		
		for(int i=cad.length()-1;i>=0;i--) {
			cadInvertida+=cad.charAt(i);
		}
		return cadInvertida;
	}
	public static boolean compruebaPalindromo(String cadInvertida, String cad) {
		
		if(cad.equalsIgnoreCase(cadInvertida))
			return true;
		
		return false;
		
	}

}
