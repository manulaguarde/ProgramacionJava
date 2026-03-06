package ud8;

import java.util.Scanner;

public class UsoTiendaElectrodomesticos {
	static Scanner scanner;
	static Electrodomestico[] electrodomesticos=new Electrodomestico[3];
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		String opcion;
		for(int i=0;i<electrodomesticos.length;i++) {
			
			System.out.println("Ingresa 1. Si es una lavadora\n2. Si es una Television\n3. Otro");
			opcion=scanner.nextLine();
			while(!opcion.equals("1") || !opcion.equals("2") || !opcion.equals("3")) {
				System.out.println("Opción incorrecta, vuelve a ingresar");
				System.out.println("Ingresa 1. Si es una lavadora\n2. Si es una Television\n3. Otro");
				opcion=scanner.nextLine();
			}
			if(opcion.equals("1"))
				electrodomesticos[i]=ingresaLavadora();
			if(opcion.equals("2"))
				electrodomesticos[i]=ingresaTelevision();
			if(opcion.equals("3"))
				electrodomesticos[i]=ingresaElectrodomestico();
		}
		
		

	}
	
	public static Electrodomestico ingresaElectrodomestico() {
		
		System.out.println("Ingresa precio");
		double precio=scanner.nextDouble();
		System.out.println("Ingresa color");
		String color=scanner.nextLine();
		System.out.println("Ingresa consumo (A,B,C,D,E,F)");
		char consumo=scanner.nextLine().charAt(0);
		System.out.println("Ingresa peso");
		double peso=scanner.nextDouble();
		
		return new Electrodomestico(precio,color,consumo,peso);
	}
	
	public static Television ingresaTelevision() {
		Electrodomestico e=ingresaElectrodomestico();
		boolean tdt=false;
		System.out.println("Ingresa pulgadas");
		int pulgadas=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa 'si' si cuenta con sintonizador tdt, sino ingresa 'no'");
		String tieneTdt=scanner.nextLine();
		if(tieneTdt.equalsIgnoreCase("si")) tdt=true;
		else tdt=false;
		
		return new Television(e.getPrecio_base(),e.getColor(),e.getConsumo_energ(),e.getPeso(),pulgadas,tdt);
	}
	
	public static Lavadora ingresaLavadora() {
		Electrodomestico e=ingresaElectrodomestico();
		
		System.out.println("Ingresa carga");
		double carga=scanner.nextDouble();
		
		return new Lavadora(e.getPrecio_base(),e.getColor(),e.getConsumo_energ(),e.getPeso(),carga);
	}
	
	public static void mostrarPrecioFinal() {
		double precioTotal=0;
		for (int i=0;i<electrodomesticos.length;i++) {
			if(electrodomesticos[i] instanceof Television) {
				precioTotal+=((Television)electrodomesticos[i]).precioFinal();
			}else if (electrodomesticos[i] instanceof Lavadora){
				precioTotal+=((Lavadora)electrodomesticos[i]).precioFinal();
			}else {
				precioTotal+=electrodomesticos[i].precioFinal();
			}
		}
		System.out.println("Precio total final: "+precioTotal);
	}
	
	public static void precioFinalTelevisiones() {
		for(int i=0;i<electrodomesticos.length;i++) {
			if(electrodomesticos[i] instanceof Television) {
				System.out.println("Precio final Televisores: "+((Television)electrodomesticos[i]).precioFinal());
			}
		}
	}
	
	public static void precioFinalLavadoras() {
		for(int i=0;i<electrodomesticos.length;i++) {
			if(electrodomesticos[i] instanceof Television) {
				System.out.println("Precio final lavadoras: "+((Lavadora)electrodomesticos[i]).precioFinal());
			}
		}
	}

}
