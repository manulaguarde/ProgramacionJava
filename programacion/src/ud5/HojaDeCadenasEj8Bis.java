package ud5;

/*
 * Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y
 * viceversa.
 */

public class HojaDeCadenasEj8Bis {

	public static void main(String[] args) {
		String cad="hola";
		String cadMayus="";
		
		for (int i=0;i<cad.length();i++) {
			cadMayus+=(char)(cad.charAt(i)-32); //con char me convierte el resultado de restar 32 para convertir a mayusculas (que da un número) en carácter
		}

	}

}
