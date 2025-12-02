package ud5;

import java.util.Scanner;

public class EjercicioCadena {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto, textoAlReves="";
		
		System.out.println("Ingrese una palabra");
		texto=scanner.nextLine();
		
		for(int i=texto.length()-1;i>=0;i--) {
			textoAlReves=textoAlReves+texto.charAt(i);
		}
		
		System.out.println(textoAlReves);
	}

}
