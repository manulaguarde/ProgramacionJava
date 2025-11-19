package ud4;

/*
 * Hacer un programa que pida la cantidad de letras de una palabra y luego ingresarla letra a letra
 * Se debe mostrar la palabra al derecho y al revés
 */

import java.util.Scanner;

public class ArraysDeCaracteres {

	public static void main(String[] args) {
		//declaración de variables
		char[]letras;
		int cantidad;
		//leer por Scanner
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce cuantas letras tiene tu palabra");
		//leemos cantidad de letras de la palabra
		cantidad=entrada.nextInt();
		//capturamos el buffer
		entrada.nextLine();
		//creamos el array
		letras=new char[cantidad];
		
		System.out.println("Introduce letra a letra tu palabra");
		
		//leemos letra a letra la palabra, y la almacenamos en letras[]
		for (int i=0;i<cantidad;i++) {
			letras[i]=entrada.nextLine().charAt(0);
		}
		//mostramos la palabra por pantalla separada por letras
		for(int i=0;i<cantidad;i++) {
			System.out.print("'"+letras[i]+"'");
		}
		//mostramos la palabra invertida
		System.out.println();
		for(int i=cantidad-1;i>=0;i--) {
			System.out.print(letras[i]);
		}

	}

}
