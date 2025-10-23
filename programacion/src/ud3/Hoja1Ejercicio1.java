package ud3;

import java.util.Scanner;

/*
* Que pida (siempre por teclado) un número del 1 al 5 y diga (que muestre por
* pantalla) si es primo o no.*/
public class Hoja1Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);

		System.out.println("Ingrese un número del 1 y el 5");
		
		int num=entrada.nextInt();
		
		if (num==1 || num==4) {
			System.out.println("El número no es primo");
			
		}else if (num==2 || num==3 || num==5){
			System.out.println("El número es primo");
			
		}else {
			System.out.println("Tiene que ser un número del 1 y 5");
		}
		
	}

}
