package ud3;

import java.util.Scanner;

//Que pida un número y muestre en pantalla el mismo número de asteriscos.

public class Hoja2Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num,cont;
		
		System.out.println("Introduce un número mayor a 0");
		num=entrada.nextInt();
		
		while(num<=0) {
			System.out.println("El número no puede ser 0 o menor a 0, vuelve a ingresar otro número");
		
			num=entrada.nextInt();
		}
		for(cont=1;cont<=num;cont++) {
			
			System.out.print("*");
		}
	}

}
