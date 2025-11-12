package ud4;

import java.util.Scanner;

//Que muestre por pantalla si un número es par o impar, utilizar una función

public class Hoja5Ejercicio11 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {


		
	}
	
	public static int parOImpar() {
		System.out.println("Ingrese un número");
		int num=entrada.nextInt();
		int resultado, par=0, impar=0;
		
		if(num%2==0) {
			par=num;
		}else {
			impar=num;

		}
		return par;
	}

}
