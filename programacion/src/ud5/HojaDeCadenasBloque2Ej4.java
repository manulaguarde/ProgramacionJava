package ud5;

import java.util.Scanner;

// Como el anterior, pero sin importar si es mayúscula o minúscula.

public class HojaDeCadenasBloque2Ej4 {	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		String cad=scanner.nextLine();
		
		empiezaPorH(cad);


	}
	public static void empiezaPorH(String cad) {
		if(cad.toLowerCase().charAt(0)=='h') {
			System.out.println("La cadena empieza por H o h");
		}else {
			System.out.println("La cadena no empieza por H o h");
		}
	}
}
