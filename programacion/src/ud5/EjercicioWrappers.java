package ud5;

import java.util.Scanner;

/*
 * Leer un número por teclado como cadena y le sume 2
 */

public class EjercicioWrappers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean esNumero=false;
		do {
			System.out.println("Introduce un número entero");
			esNumero=scanner.hasNextInt();
			String num=scanner.nextLine();
			if(esNumero) {

				int numero=Integer.parseInt(num);
				
				System.out.println(numero+2);
			}else {
				System.out.println("No es un número");
			}
		}while(!esNumero);
		
	}
	/*public static boolean esNumerico (String num) {
		for(int i=0;i<num.length();i++) {
			if (!Character.isDigit(num.charAt(i))) {
				return false;
			}
		}
		return true;
	}*/

}
