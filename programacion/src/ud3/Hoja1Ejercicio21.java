package ud3;

import java.util.Scanner;

/*
21. Que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y
“Escaleno”, pida una opción y calcule el perímetro del triángulo seleccionado.
*/

public class Hoja1Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int opcion;
		double ladoA,ladoB,base;
		
		System.out.println("Para calcular el perímetro de un triángulo Isósceles pulse 1. Para triángulo Equilátero pulse 2. Para triángulo Escaleno pulse 3");
		opcion= entrada.nextInt();
	
		if (opcion == 1) {
			System.out.println("Ingrese la medida de la base primero y luego un lado");
			base=entrada.nextDouble();
			ladoA=entrada.nextDouble();
			
			System.out.println("El perímetro de su triángulo Isósceles es: "+ (base+ladoA+ladoA));
		} else if (opcion==2) {
			System.out.println("Ingrese la medida de uno de los lados");
			ladoA=entrada.nextDouble();
			
			System.out.println("El perímetro de su triángulo Equilátero es: "+ (ladoA+ladoA+ladoA));
		}else if (opcion==3) {
			System.out.println("Ingrese la medida de todos los lados: ");
			ladoA=entrada.nextDouble();
			ladoB=entrada.nextDouble();
			base=entrada.nextDouble();
			
			System.out.println("El perímetro de su triángulo Escaleno es: "+ (ladoA+ladoB+base));
		}else {
			System.out.println("La opción ingresada es incorrecta");
		}

	}

}
