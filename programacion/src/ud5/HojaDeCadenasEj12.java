package ud5;

import java.util.Scanner;

/*
 * Ejercicio 12. Realizar un programa en java que gestione los datos de stock de una
tienda de comestibles,la información a recoger será: nombre del producto(no se
puede repetir), precio, cantidad en stock.
La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
1. Dar de alta un producto nuevo.
2. Buscar un producto por su nombre.
3. Modificar el stock y precio de un producto dado.
 */

public class HojaDeCadenasEj12 {
	static Scanner scanner=new Scanner(System.in);
	static String nombres[]=new String[10];
	static double precio[]=new double[10];
	static int stock[]=new int[10];
	static int i=0;

	public static void main(String[] args) {

		
		

	}
	public static void darAlta() {
		
		if(i<10) {
			String nombre;
			do {
				System.out.println("Ingresa nombre del producto");
				nombre=scanner.nextLine();
			}while(!compruebaNombre(nombre));
			nombres[i]=nombre;
			
			System.out.println("Ingresa el precio del producto");
			precio[i]=scanner.nextDouble();
			
			System.out.println("Ingresa el stock del producto");
			stock[i]=scanner.nextInt();
		}else {
			System.out.println("El almacen está lleno");
		}
	}
	public static boolean compruebaNombre(String nombre) {
		for (int j=0;j<nombres.length;j++) {
			if (nombres[j].equals(nombre)){
				return false;
			}
		}
		return true;
	}
	

}
