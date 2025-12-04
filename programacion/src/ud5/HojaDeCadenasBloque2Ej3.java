package ud5;

import java.util.Scanner;

//Pedir al usuario una cadena y decir si empieza por el carácter ‘H’

public class HojaDeCadenasBloque2Ej3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		String cad=scanner.nextLine();
		
		empiezaPorH(cad);


	}
	public static void empiezaPorH(String cad) {
		if(cad.charAt(0)=='H') {
			System.out.println("La cadena empieza por H");
		}else {
			System.out.println("La cadena no empieza por H");
		}
	}

}
