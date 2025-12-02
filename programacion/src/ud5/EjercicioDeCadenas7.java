package ud5;

import java.util.Scanner;

/*
 * Pide una cadena y dos caracteres por teclado (valida que sea un caracter), sustituye la aparicion del
 * primer caracter en la cadena por el segundo caracter
 */

public class EjercicioDeCadenas7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		String cad=scanner.nextLine();
		//scanner.nextLine();
		
		System.out.println("Introduce el caracter que desea sustituir");
		char car1=scanner.nextLine().charAt(0);
		//scanner.nextLine();
		System.out.println("Introduce el caracter nuevo");
		char car2=scanner.nextLine().charAt(0);
		
		String cadenaNueva="";
		char cadNueva;
		
		for(int i=0;i<cad.length();i++) {
			String cadena2;
			if(cad.charAt(i)==car1) {
				//cad.charAt(i)=car2;
				cadenaNueva+=car2;
			}else {
				cadenaNueva+=cad.charAt(i);
			}
		}
		System.out.println(cadenaNueva);
		
	}

}
