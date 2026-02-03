package Ud6;

import java.util.Scanner;

public class UsoTienda {

	public static void main(String[] args) {
		
		//Creo una Tienda
		Tienda tienda=new Tienda();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese una opción:\n1.Para dar de alta un producto\n2.Para buscar un producto\n3.Para modificar el stock\n4.Para borrar un producto"
				+ "\n5.Para Salir");
		int opcion=scanner.nextInt();
		//scanner.nextLine();
		String nombre;
		
		do {
			switch(opcion) {
				case 1:
					System.out.println("Ingresa nombre del producto");
					nombre=scanner.nextLine();
					System.out.println("Ingresa el precio");
					double precio=scanner.nextDouble();
					System.out.println("Ingresa el stock actual");
					int stock=scanner.nextInt();
					//Creo un producto anónimo
					tienda.darAlta(new Producto(nombre,precio,stock));
					break;
				case 2:
					System.out.println("Ingresa nombre del producto que quieres buscar");
					nombre=scanner.nextLine();
					tienda.buscarProducto(nombre);
					break;
				case 3:
					
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Opción incorrecta");
			}
		}while(opcion!=5);
		

	}

}
