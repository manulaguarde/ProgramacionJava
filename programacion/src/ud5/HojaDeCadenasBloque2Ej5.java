package ud5;

import java.util.Scanner;

//Programa que pida un carácter c y un número n y que devuelva una cadena con c repetido n veces.

public class HojaDeCadenasBloque2Ej5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingresa un carácter");
		char caracter=scanner.nextLine().charAt(0);
		System.out.println("Ahora ingresa un número");
		int num=scanner.nextInt();
		String cad="";
		
		for(int i=0;i<num;i++) {
			cad+= caracter;
		}
		System.out.println(cad);

	}

}
