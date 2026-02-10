package Ud6;

import java.util.Scanner;

public class UsoFraccion2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		final int TAM=3;
		Fraccion [] fracciones=new Fraccion[TAM];
		
		for(int i=0;i<fracciones.length;i++) {
			System.out.println("Introduce numerador y denominador");
			fracciones[i]=new Fraccion(scanner.nextInt(),scanner.nextInt());
		}
		System.out.println("SUMA");
		Fraccion resultado=fracciones[0];
		for(int i=1;i<fracciones.length;i++) {
			resultado=resultado.suma(fracciones[i]);
		}
		Fraccion simplificada=new Fraccion(resultado.getNumerador(),resultado.getDenominador()).simplifica(resultado);
		System.out.println(simplificada);
		
		System.out.println("RESTA");
		
		resultado=fracciones[0];
		for(int i=1;i<fracciones.length;i++) {
			resultado=resultado.resta(fracciones[i]);
		}
		simplificada=resultado.simplifica(resultado);
		System.out.println(simplificada);
		
		System.out.println("MULTIPLICACION");

		resultado=fracciones[0];
		for(int i=1;i<fracciones.length;i++) {
			resultado=resultado.multiplica(fracciones[i]);
		}
		simplificada=resultado.simplifica(resultado);
		System.out.println(simplificada);
		
		System.out.println("DIVIDE");
		resultado=fracciones[0];
		for(int i=1;i<fracciones.length;i++) {
			resultado=resultado.divide(fracciones[i]);
		}
		simplificada=resultado.simplifica(resultado);
		System.out.println(simplificada);
	}

}
