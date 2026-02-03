package Ud6;

import java.util.Scanner;

public class UsoTienda {

	public static void main(String[] args) {
		
		//Creo una Tienda
		Tienda tienda=new Tienda();
		
		Scanner scanner=new Scanner(System.in);
		int opcion;

		String nombre;
		
		do {
			System.out.println("Ingrese una opción:\n1.Para dar de alta un producto\n2.Para buscar un producto\n3.Para modificar el stock\n4.Para borrar un producto"
					+ "\n5.Para Salir");
			opcion=scanner.nextInt();
			scanner.nextLine();
			switch(opcion) {
				case 1:
					System.out.println("Ingresa nombre del producto");
					nombre=scanner.nextLine();
					System.out.println("Ingresa el precio");
					double precio=scanner.nextDouble();
					System.out.println("Ingresa el stock actual");
					int stock=scanner.nextInt();
					//scanner.nextLine();
					//Creo un producto anónimo
					tienda.darAlta(new Producto(nombre,precio,stock));
					break;
				case 2:
					System.out.println("Ingresa nombre del producto que quieres buscar");
					nombre=scanner.nextLine();
					System.out.println(tienda.buscarProducto(nombre));
					break;
				case 3:
					System.out.println("Ingresa el nombre del producto que deseas modificar el stock");
					nombre=scanner.nextLine();
					System.out.println("Ingresa el nuevo stock");
					int cantidad=scanner.nextInt();
					scanner.nextLine();
					tienda.modificarStock(nombre, cantidad);
					break;
				case 4:
					System.out.println("Ingersa el nombre del producto que quieres eliminar");
					nombre=scanner.nextLine();
					tienda.borraProducto(nombre);
					break;
				case 5:
					System.out.println("Hasta luego!");
					break;
				case 6:
					System.out.println(tienda);
					break;
				default:
					System.out.println("Opción incorrecta");
			}
		}while(opcion!=5);
		

	}

}
