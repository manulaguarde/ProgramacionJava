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
		char car1, car2;
		//scanner.nextLine();
		do {
			System.out.println("Introduce el caracter que desea sustituir");
			car1=scanner.nextLine().charAt(0);
			//scanner.nextLine();
		}while(!esCaracter(car1));
		do {
			System.out.println("Introduce el caracter nuevo");
			car2=scanner.nextLine().charAt(0);
		}while(!esCaracter(car2));
		String cadenaNueva=cad.replace(car1, car2);
		
		
		/*for(int i=0;i<cad.length();i++) {
			if(cad.charAt(i)==car1) {
				//cad.charAt(i)=car2;
				cadenaNueva+=car2;
			}else {
				cadenaNueva+=cad.charAt(i);
			}
		}*/
		System.out.println(cadenaNueva);
		
	}
	public static boolean esCaracter(char a) {
		String abc="abcdefghijklmnñopqrstuvwxyz";
		for (int i=0;i<abc.length();i++) {
			if (abc.charAt(i)==a) {
				return true;
			}
		}
		return false;
	}

}
