package objetos;

import java.util.Scanner;

public class Main {
	static Scanner scanner=new Scanner(System.in);
	

	public static void main(String[] args) {
		Tienda2 tienda=new Tienda2();
		
		System.out.println("Ingrese un producto");
		System.out.println("Ingrese el código");
		int codigo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el nombre");
		String nombre=scanner.nextLine();
		System.out.println("Ingrese el precio");
		double precio=scanner.nextDouble();
		Producto producto = new Producto(codigo, nombre, precio);
		tienda.agregarProducto(producto);
		
		tienda.verProductos();
	}

}
