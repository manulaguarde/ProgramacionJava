package Ud6;

import java.util.Scanner;

public class UsoFraccion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*Fraccion f1=new Fraccion(1,3);
		Fraccion f2=new Fraccion(1,2);
		Fraccion fRsdo=f1.multiplica(f2);
		
		System.out.println(f1+" X "+f2+" = "+fRsdo);*/
		int opcion;
		System.out.println("Ingresa numerador de la primera fraccion");
		int numerador=scanner.nextInt();
		System.out.println("Ingresa el denominador de la primera fraccion");
		int denominador=scanner.nextInt();
		
		Fraccion f1=new Fraccion(numerador,denominador);
		do {
			System.out.println("Introduce una opcion:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Simplificar\n6.Salir");
			opcion=scanner.nextInt();
			switch (opcion) {
				case 1:
					System.out.println("Ingresa el numerador de la segunda fraccion");
					numerador=scanner.nextInt();
					System.out.println("Ingresa el denominador de la segunda fraccion");
					denominador=scanner.nextInt();
					Fraccion f2=new Fraccion (numerador, denominador);
					Fraccion resultado=f1.suma(f2);
					Fraccion fraccionSimplificada=resultado.simplifica(resultado);
					
					System.out.println(f1+" + "+f2+" = "+fraccionSimplificada);
					break;
				case 2:
					System.out.println("Ingresa el numerador de la segunda fraccion");
					numerador=scanner.nextInt();
					System.out.println("Ingresa el denominador de la segunda fraccion");
					denominador=scanner.nextInt();
					f2=new Fraccion (numerador, denominador);
					resultado=f1.resta(f2);
					fraccionSimplificada=resultado.simplifica(resultado);
					System.out.println(f1+" - "+f2+" = "+fraccionSimplificada);
					break;
				case 3:
					System.out.println("Ingresa el numerador de la segunda fraccion");
					numerador=scanner.nextInt();
					System.out.println("Ingresa el denominador de la segunda fraccion");
					denominador=scanner.nextInt();
					f2=new Fraccion (numerador, denominador);
					resultado=f1.multiplica(f2);
					fraccionSimplificada=resultado.simplifica(resultado);
					System.out.println(f1+" x "+f2+" = "+fraccionSimplificada);
					break;
				case 4:
					System.out.println("Ingresa el numerador de la segunda fraccion");
					numerador=scanner.nextInt();
					System.out.println("Ingresa el denominador de la segunda fraccion");
					denominador=scanner.nextInt();
					f2=new Fraccion (numerador, denominador);
					resultado=f1.suma(f2);
					fraccionSimplificada=resultado.simplifica(resultado);
					System.out.println(f1+" / "+f2+" = "+fraccionSimplificada);
					break;
				case 5:
					
					break;
				case 6:
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opción incorrecta");
			}
			
		}while(opcion!=6);
	}

}
