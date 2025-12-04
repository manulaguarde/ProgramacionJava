package ud5;

import java.util.Scanner;

//Repite el ejercicio anterior pero usando indexOf.

public class HojaDeCadenasBloque2Ej8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingresa una cadena");
		String cad=scanner.nextLine();
		System.out.println("Ingresa un carácter");
		char car=scanner.nextLine().charAt(0);
		
		if(contieneElCaracter(cad,car)) {
			System.out.print("El carácter se encuentra en las posiciones: ");
			muestraPosicion(cad,car);
		}
		else {
			System.out.println("El carácter no se encuentra en la cadena");
		}

	}
	public static boolean contieneElCaracter(String cad,char car) {
		for(int i=0;i<cad.length();i++) {
			if (car==cad.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	public static void muestraPosicion(String cad,char car) {
		for(int i=0;i<cad.length();i++) {
			if(car==cad.charAt(i)) {
				System.out.print((i+1)+", ");
			}
		}

	}

}
