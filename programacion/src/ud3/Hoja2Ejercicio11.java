package ud3;

import java.util.Scanner;

/*
 * Que pida dos números y muestre todos los números que van desde el primero al
segundo. Se debe controlar que los valores son correctos.
*/

public class Hoja2Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num1, num2, i=0;
		
		System.out.println("Ingrese dos números");
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		
		i=num1;
		if(num1<=num2) {
			while(i<=num2) {
				System.out.println(i);
				i++;
			}
		}else {
			while(i>=num2) {
				System.out.println(i);
				i--;
			}
		}
	}

}
