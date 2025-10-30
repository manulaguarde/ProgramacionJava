package ud3;
/*
 * 21. Que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y
 *“Escaleno”, pida una opción y calcule el perímetro del triángulo seleccionado.
 */

import java.util.Scanner;

public class Hoja1Ejercicio21ConSwitch {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		
		int opcion;
		double base, ladoA, ladoB;
		do {
			System.out.println("Ingrese una opción:");
			System.out.println("1: Para calcular el perímetro de un triángulo Equilatero");	
			System.out.println("2: Para calcular el perímetro de un triángulo Isósceles");
			System.out.println("3: Para calcular el perímetro de un triángulo Escaleno");
			System.out.println("4: Para Salir");
			opcion=entrada.nextInt();
			
			
			switch (opcion) {
				case 1:
					System.out.println("Ingrese la medida de uno de los lados");
					ladoA=entrada.nextDouble();
					
					System.out.println("El perímetro de su triángulo Equilátero es: "+ (ladoA+ladoA+ladoA));
					break;
				case 2:
					System.out.println("Ingrese la medida de la base primero y luego un lado");
					base=entrada.nextDouble();
					ladoA=entrada.nextDouble();
					
					System.out.println("El perímetro de su triángulo Isósceles es: "+ (base+ladoA*2));
					break;
				case 3:
					System.out.println("Ingrese la medida de todos los lados: ");
					ladoA=entrada.nextDouble();
					ladoB=entrada.nextDouble();
					base=entrada.nextDouble();
					
					System.out.println("El perímetro de su triángulo Escaleno es: "+ (ladoA+ladoB+base));
					break;
				case 4:
					System.out.println("Has Salido");
					break;
				default:
					System.out.println("Opción incorrecta");
			}
		
		}while(opcion!=4);
	}	

}
