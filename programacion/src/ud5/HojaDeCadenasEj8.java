package ud5;

import java.util.Scanner;

/*
 * Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y
 * viceversa.
 */

public class HojaDeCadenasEj8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		String cad=scanner.nextLine();
		
		cambiaString(cad);
		
	}
	public static void cambiaString (String cad){
		String cadCambiada="";
		String abcMinus="abcdefghijklmnñopqrstuvwxyz";
		String abcMayus="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String letraMayus;
		
		for (int i=0; i<cad.length();i++) {
			for (int j=0; j<abcMinus.length();j++) {
				if(cad.charAt(i)==abcMinus.charAt(j)) {
					//letraMayus=cad.charAt(i);
					cadCambiada+=cad.toUpperCase().charAt(i);
				}
				else if(cad.charAt(i)==abcMayus.charAt(j)) {
					cadCambiada+=cad.toLowerCase().charAt(i);
				}
			}
			if(cad.charAt(i)==' ') {
				cadCambiada+=' ';
			}
		}
		System.out.println(cadCambiada);
		
		
	}

}
