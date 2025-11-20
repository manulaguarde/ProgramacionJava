package ud4;

import java.util.Scanner;

public class FuncionConBoolean {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		char caracter;
		System.out.println("Ingresa una letra");
		caracter=entrada.nextLine().charAt(0);
		if (comprobarVocal(caracter)) {
			System.out.println("La letra "+caracter+" es vocal");
		}else {
			System.out.println("La letra "+caracter+" no es vocal");
		}
		
		
	}
	public static boolean comprobarVocal(char letra) {
		if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra =='u') {
			return true;
		}
		
		return false;
		
	}
	public static boolean comprobarVocal2(char letra) {
		char[]vocales= {'a','e','i','o','u','A','E','I','O','U'};
		
		for (int i=0;i<vocales.length;i++) { //propiedad que me da la longitud del array
			if (vocales[i]==letra) { //si el caracter ingresado esta dentro del array devuelve true
				return true;
			}
		}
		return false;
	}
}
