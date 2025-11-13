package ud4;

import java.util.Scanner;

/*
 * Que muestre una tabla de multiplicar de un número cualquiera por pantalla, el
 * número se pedirá en el programa principal.
*/

public class Hoja5Ejercicio14 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {

		
		System.out.println("Introduce un número para conocer su tabla de multiplicar");
		int num=entrada.nextInt();
		multiplica(num);
		
	}
	//si se muestra el resultado por pantalla dentro de la funcion no devuelve nada (void)
	public static void multiplica(int num) {
	
		for(int i=0;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}
}
