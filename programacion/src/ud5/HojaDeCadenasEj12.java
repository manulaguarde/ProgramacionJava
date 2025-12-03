package ud5;

import java.util.Scanner;

/*
 * Ejercicio 12. Realizar un programa en java que gestione los datos de stock de una
 * tienda de comestibles,la información a recoger será: nombre del producto(no se
 * puede repetir), precio, cantidad en stock.
 * La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
 * 1. Dar de alta un producto nuevo.
 * 2. Buscar un producto por su nombre.
 * 3. Modificar el stock y precio de un producto dado.
 */

public class HojaDeCadenasEj12 {
	static Scanner scanner=new Scanner(System.in);
	static String nombres[]=new String[3];
	static double precio[]=new double[3];
	static int stock[]=new int[3];
	static int i=0;

	public static void main(String[] args) {
		
		int opcion;

		do {
			System.out.println("Ingrese una opcion:\n1. Dar de alta un producto nuevo.\n"
					+ "2. Buscar un producto por su nombre.\n"
					+ "3. Modificar el stock y precio de un producto dado.\n"
					+ "4. Para salir");
			opcion=scanner.nextInt();
			scanner.nextLine();
			switch(opcion) {
			case 1:
				darAlta();
				break;
			case 2:
				buscaProducto();
				break;
			case 3:
				modificaPrecioYStock();
				break;
			case 4:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		}while(opcion!=4);
		

	}
	public static void darAlta() {
		
		if(i<3) {
			System.out.println("Ingresa nombre del producto");
			nombres[i]=scanner.nextLine();
			while(!compruebaNombre(nombres)&&i>0) {
				System.out.println("El producto ya se encuentra en el almacen, vuelve a ingresar nombre");
				nombres[i]=scanner.nextLine();
			}
			System.out.println("Ingresa el precio del producto");
			precio[i]=scanner.nextDouble();
			
			System.out.println("Ingresa el stock del producto");
			stock[i]=scanner.nextInt();
			
			i++;
		}else {
			System.out.println("El almacen está lleno");
		}
	}
	public static boolean compruebaNombre(String[] nombre) {
		for (int j=i-1;j>=0;j--) {
			if (nombres[j].equalsIgnoreCase(nombre[i])){
				return false;
			}
		}
		return true;
	}
	public static void buscaProducto() {
		System.out.println("Ingrese el producto que desea buscar");
		String prodBuscado=scanner.nextLine();
		
		for (int j=0;j<nombres.length;j++) {
			if (nombres[j].equalsIgnoreCase(prodBuscado)) {
				System.out.println("el producto "+nombres[j]+" tiene un precio de "+precio[j]+" y un stock de "+stock[j]);
			}
		}
		
	}
	public static void modificaPrecioYStock() {
		
		System.out.println("Ingresa el producto que desea modificar: ");
		String producto=scanner.nextLine();
		
		for (int j=0;j<nombres.length;j++) {
			if (nombres[j].equalsIgnoreCase(producto)) {
				System.out.println("Ingrese el nuevo precio del producto");
				precio[j]=scanner.nextDouble();
				System.out.println("Ingrese el nuevo stock del producto");
				stock[j]=scanner.nextInt();
			}
		}
	}

}
