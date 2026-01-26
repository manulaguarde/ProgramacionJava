package objetos;

import java.util.Scanner;

public class Tienda {
	
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		Producto producto1=new Producto(01,"Manzana",1.9);
		Producto producto2=new Producto(02,"peras",2.5);
		
		int opcion, cantidad;
		double precioNuevo;
		do {
			System.out.println("Ingresa una opción:\n1. Para ingresar stock\n2. Para vender stock\n"
					+ "3. Para modificar el precio\n4. Para ver el estado de la tienda\n5. Para salir");
			opcion=scanner.nextInt();
			
			switch (opcion) {
				case 1: 
					System.out.println("Ingrese la cantidad a ingresar");
					cantidad=scanner.nextInt();
					producto1.aumentarStock(cantidad);
					break;
				case 2:
					System.out.println("Ingrese la cantidad a vender");
					cantidad=scanner.nextInt();
					producto1.vender(cantidad);;
					break;
				case 3:
					System.out.println("Ingrese el precio nuevo");
					precioNuevo=scanner.nextDouble();
					producto1.cambiarPrecio(precioNuevo);
					break;
				case 4:
					producto1.mostrarProducto();
					break;
				case 5:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
		}while(opcion!=5);

	}

}
