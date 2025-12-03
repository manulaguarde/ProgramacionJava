package ud5;

import java.util.Scanner;

/*
 * Ejercicio 11. Realizar una función a la que se le pasa por parámetro una cadena
 * con un email, y dicha función devuelve si el mail está bien formado.
 * Un email está bien formado cuando:
 * 1.1.- Contiene una y solo una arroba.
 * 1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
 * 1.3.- No puede contener ' '
 */

public class HojaDeCadenasEj11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un email");
		String email = scanner.nextLine();
		if (contieneArroba(email) && noContieneDosPuntos(email) && noContieneEspacios(email)) {
			System.out.println("email valido");
		} else {
			System.out.println("email invalido");
		}

	}

	public static boolean contieneArroba(String email) {
		if (email.indexOf('@')==-1)
			return false;
		
		if (email.indexOf('@')==email.lastIndexOf('@')) {
			return true;
		}
		return false;
	}

	public static boolean noContieneDosPuntos(String email) {

		int arroba = email.indexOf('@');
		String ultimaParte = "";
		for (int i = arroba; i < email.length(); i++) {
			ultimaParte += email.charAt(i);
		}

		int resultado = ultimaParte.indexOf('.');
		if (resultado == ultimaParte.lastIndexOf('.') && resultado > 0) {
			return true;
		}
		return false;

	}

	public static boolean noContieneEspacios(String email) {

		if(email.indexOf(' ')==-1) {
			return true;
		}
		return false;
	}
}
