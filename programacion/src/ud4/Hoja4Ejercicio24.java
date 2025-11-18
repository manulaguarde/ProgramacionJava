package ud4;

/*Realiza un programa en Java que gestione los datos de stock de una tienda de comestibles, la información a
recoger será: nombre del producto, precio, cantidad en stock. La tienda dispone de
10 productos distintos. El programa debe ser capaz de:
1. Dar de alta un producto nuevo.
2. Buscar un producto por su nombre.
3. Modificar el stock y precio de un producto dado.
*/

import java.util.Scanner;

public class Hoja4Ejercicio24 {
	
static Scanner entrada=new Scanner(System.in);
final static int TAM=10;
static char[] producto=new char[TAM];
static double[] precio= new double[TAM];
static int[] stock= new int[TAM];
static int i=0;

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("Ingrese:\n1. Para dar de alta un producto nuevo.\n"
					+ "2. Para buscar un producto por su nombre.\n"
					+ "3. Para modificar el stock y precio de un producto dado.\n"
					+ "4. Para salir");
			opcion=entrada.nextInt();
			
			switch (opcion) {
				
				case 1:
					darAlta();
					break;
				case 2:
					buscarProducto();
					break;
				case 3:
					modificarPrecioStock();
					break;
				case 4:
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opción no válida");
			}
			
		}while(opcion!=4);
	}
	public static void darAlta() {
		if (i<TAM) {
			System.out.println("Ingrese nombre del producto");
			entrada.nextLine();
			producto[i]=entrada.nextLine().charAt(0);
			
			System.out.println("Ingrese el precio del producto añadido");
			precio[i]=entrada.nextDouble();
			
			System.out.println("Ingrese el stock disponible del producto");
			stock[i]=entrada.nextInt();
			
			i++;
			
		}else {
			System.out.println("El almacen está lleno");
		}
	}
	public static void buscarProducto() {
		
		System.out.println("Ingrese el producto que desea buscar");
		entrada.nextLine();
		int prodBuscado=entrada.nextLine().charAt(0);
		
		for (i=0;i<TAM;i++) {
			if(producto[i]==prodBuscado) {
				System.out.println("El producto buscado es: " +producto[i]+", precio: "+precio[i]+" euros y stock: "+stock[i]);
				return ; //es como hacer un break, porque no devuelve nada.
				
			}
		}
		System.out.println("Producto no encontrado");
	}
	public static void modificarPrecioStock() {
	
		double precioNuevo=0;
		int stockNuevo=0;
		
		System.out.println("Ingrese el producto que desea modificar");
		entrada.nextLine();
		int prodBuscado=entrada.nextLine().charAt(0);
		
		for (i=0;i<TAM;i++) {
			if(producto[i]==prodBuscado) {	
				System.out.println("Introduce 1 para modificar el precio\n"
								+ "Introduce 2 para modificar el stock\n"
								+ "Introduce 3 para modificar el precio y el stock");
				int opcion=entrada.nextInt();
				
				switch (opcion) {
					case 1:
						System.out.println("Introduce el precio nuevo del producto");
						precioNuevo=entrada.nextDouble();//podria tambien poner directamente precio[i] en la entrada por teclado
						
						precio[i]=precioNuevo; 
						break;
					case 2:
						System.out.println("Introduce el número del nuevo stock disponible del producto");
						stockNuevo=entrada.nextInt(); 
						
						stock[i]=stockNuevo;
						break;
					case 3:
						System.out.println("Introduce el precio nuevo del producto");
						precioNuevo=entrada.nextDouble();
						
						System.out.println("Introduce el número del nuevo stock disponible del producto");
						stockNuevo=entrada.nextInt();
						
						precio[i]=precioNuevo;
						stock[i]=stockNuevo;
						break;
				}
			}
		
		}
	}
	
}
