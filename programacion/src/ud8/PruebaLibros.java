package ud8;

import java.util.Scanner;

public class PruebaLibros {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ConjuntoLibros coleccion=new ConjuntoLibros();
		String opcion;
		
		do {
			System.out.println("Ingresa una opción:\n1. Para añadir libros\n2. Para eliminar por título del libro"
					+ "\n3. Para eliminar por autor del libro\n4. Para ver mejores y peores calificaciones"
					+ "\n5. Para ver todos los libros\n6. Para salir");
			opcion=scanner.nextLine();
			
			switch(opcion) {
				case "1":
					System.out.println("Ingresa el título del libro");
					String titulo=scanner.nextLine();
					System.out.println("Ingresa el autor del libro");
					String autor=scanner.nextLine();
					System.out.println("Ingresa el número de páginas del libro");
					int numPag=scanner.nextInt();
					System.out.println("Ingresa la calificación (entre 0 y 10)");
					int calif=scanner.nextInt();
					scanner.nextLine();
					if(coleccion.addLibro(new Libro(titulo,autor,numPag,calif))) {
						System.out.println("Libro añadido correctamente");
					}else {
						System.out.println("El libro no se pudo añadir o bien ya existe");
					}
					break;
				case "2":
					System.out.println("Ingresa el título del libro");
					titulo=scanner.nextLine();
					if(coleccion.eliminarLibroPorTitulo(titulo)) {
						System.out.println("El libro ha sido eliminado correctamente");
					}else {
						System.out.println("El libro no se pudo eliminar o el título no existe");
					}
					break;
				case "3":
					System.out.println("Ingresa el autor del libro");
					autor=scanner.nextLine();
					if(coleccion.eliminarLibroPorAutor(autor)) {
						System.out.println("El libro ha sido eliminado correctamente");
					}else {
						System.out.println("El libro no se pudo eliminar o el autor no existe");
					}
					break;
				case "4":
					coleccion.librosConMaxYMinCalificacion();
					break;
				case "5":
					coleccion.mostrarConjuntoDeLibros();
					break;
				case "6":
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opción incorrecta, vuelve a ingresar");
			}
		}while(!opcion.equals("6"));

	}

}
