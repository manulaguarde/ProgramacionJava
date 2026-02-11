package Ud6;

import java.util.Scanner;

public class PruebaLibros {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int opcion;
		Libro l1;
		
		do {
			System.out.println("Ingresa una opcion:\n1.Añadir Libro\n2.Eliminar libro por titulo\n3.Eliminar libros por autor\n4.Conocer los mas calificados y lo menos calificados"
					+ "\n5.Ver todos los libros\n6.Salir");
			opcion=scanner.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Ingresa el título del libro");
					System.out.println("Ingresa el autor del libro");
					System.out.println("Ingresa el número de paginas del libro");
					System.out.println("Ingresa la calificacion del libro");
					l1=new Libro(scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextInt());
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
		}while(opcion!=6);

	}

}
