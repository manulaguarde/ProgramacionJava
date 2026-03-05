package ud8;

import java.util.Scanner;

public class UsoTiendaElectrodomesticos {
	//double precio, String color, char consumo, double peso
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
			
			ingresaElectrodomestico(opcion);
			
			//electrodomesticos(i)=new Electrodomestico()
		}

	}
	
	public void ingresaElectrodomestico(String opcion) {
		
		if(opcion.equals("1")) {
			
		}
	}

}
