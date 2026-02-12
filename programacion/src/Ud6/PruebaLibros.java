package Ud6;

import java.util.Scanner;

public class PruebaLibros {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int opcion;
		ConjuntoLibros conjuntoLibros=new ConjuntoLibros();
		
		do {
			System.out.println("Ingresa una opcion:\n1.Añadir Libro\n2.Eliminar libro por titulo\n3.Eliminar libros por autor\n4.Conocer los mas calificados y lo menos calificados"
					+ "\n5.Ver todos los libros\n6.Salir");
			opcion=scanner.nextInt();
			scanner.nextLine();
			switch(opcion) {
				case 1:
					System.out.println("Ingresa el título del libro");
					//String titulo=scanner.nextLine();
					System.out.println("Ingresa el autor del libro");
					//String autor=scanner.nextLine();
					System.out.println("Ingresa el número de paginas del libro");
					//int numPag=scanner.nextInt();
					System.out.println("Ingresa la calificacion del libro");
					//int calif=scanner.nextInt();
					//if(conjuntoLibros.añadirLibro(new Libro(titulo,autor,numPag,calif))) {
					if(conjuntoLibros.añadirLibro(new Libro(scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextInt()))) {
						System.out.println("Libro añadido correctamente");
					}else {
						System.out.println("No se pudo añadir el libro");
					}
					break;
				case 2:
					System.out.println("Ingresa el título del libro que quieres eliminar");
					if(conjuntoLibros.eliminarLibroPorTitulo(scanner.nextLine()))
						System.out.println("Libro eliminado");
					else
						System.out.println("No se pudo eliminar, titulo no encontrado");
					break;
				case 3:
					break;
				case 4:
					conjuntoLibros.mostrarMayorYMenorCalificados();
					break;
				case 5:
					//conjuntoLibros.muestraLibros();
					System.out.println(conjuntoLibros.toString());
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
