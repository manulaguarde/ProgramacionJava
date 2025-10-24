package ud3;

import java.util.Scanner;

//Que calcule el factorial de un número cualquiera y lo muestre en pantalla.

public class Hoja2Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num, cont=1, acum=1;
		
		System.out.println("Ingresa un número igual o mayor a uno, para conocer su factorial");
		num=entrada.nextInt();
		
		while(num<1) {
			System.out.println("El número no puede ser menor a 1, vuelve a ingresar");
			num=entrada.nextInt();
		}
		
		for(cont=num;cont>=1;cont--) {
			acum=acum*cont;
		}

		System.out.println("el factorial de "+num+" es "+acum);

	}

}
