package ud3;

import java.util.Scanner;

//19. Que muestre la tabla de multiplicar de un número cualquiera.

public class Hoja2Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num, cont=0;
		
		System.out.println("Ingrese un número para conocer su tabla de multiplicar");
		num= entrada.nextInt();
		
		while(cont<=10) {
			System.out.println(num+"X"+cont+"="+(num*cont));
			cont++;
		}
		
	}

}
