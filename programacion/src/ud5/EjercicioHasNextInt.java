package ud5;

import java.util.Scanner;

public class EjercicioHasNextInt {

	public static void main(String[] args) {
		Scanner scanner; //el nombre del objeto es el mismo de la clase pero en minúscula
		
		scanner= new Scanner(System.in); //Reservamos memoria ram con new y lo siguiente es un metodo con el parámetro System.in (buffer del teclado)
		
		boolean esNum;
		int num=0;
		do {
			System.out.println("Introduce un número");
			esNum=scanner.hasNextInt();
			if (esNum){
				num=scanner.nextInt();
			}
			else {
				scanner.nextLine();
			}
		}while(!esNum);
		
		System.out.println(num+2);
		

	}

}
