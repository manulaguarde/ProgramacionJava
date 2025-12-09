package ud5;

import java.util.Scanner;

/*
 * Programa que reciba como entrada una cadena y un carácter y escriba cuántas veces aparece
 * ese carácter en la cadena. No se puede usar indexOf.

 */

public class HojaDeCadenasBloque2Ej9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese una cadena");
		String cad=scanner.nextLine();
		System.out.println("Ingrese un carácter");
		char car=scanner.nextLine().charAt(0);
		int cantidadCar=cuentaCaracteres(cad,car);
		System.out.println("El carácter aparece "+cantidadCar+" veces");

	}
	public static int cuentaCaracteres(String cad, char car) {
		int cont=0;
		for (int i=0;i<cad.length();i++) {
			if(cad.charAt(i)==car)
				cont+=1;
		}
		return cont;
	}

}
