package ud8;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crear una lista de String que almacene productos. 
 * Menú: 1 Añadir producto
 * 2. Mostrar todos los productos
 * 3. Borrar Producto
 * 4. Salir
 */

public class Ejemplo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String opcion;
		ArrayList<String> productos=new ArrayList<String>();
		
		do {
			System.out.println("Ingresa una opción\n1. Añadir producto\n2. Mostrar todos los productos"
					+ "\n3. Borrar producto\n4. Salir");
			opcion=scanner.nextLine();
			switch (opcion) {
				case "1":
					System.out.println("Ingrese el nombre del producto");
					String producto=scanner.nextLine();
					productos.add(producto);
					break;
				case "2":
					for(int i=0;i<productos.size();i++) {
						System.out.println(productos.get(i));
					}
					break;
				case "3":
					System.out.println("Ingrese el nombre del producto que desea borrar");
					producto=scanner.nextLine();
					/*for(int i=0;i<productos.size();i++) {
						if(productos.get(i).equals(producto)) {
							productos.remove(i);
						}
					}*/
					if(productos.contains(producto)) {
						productos.remove(productos.indexOf(producto));
					}else {
						System.out.println("El producto no se encuentra en la lista");
					}
					break;
				case "4":
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opción incorrecta, vuelve a ingrear");
			}
		}while(!opcion.equals("4"));
		

	}

}
