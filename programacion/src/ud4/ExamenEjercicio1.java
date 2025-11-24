package ud4;

import java.util.Scanner;

public class ExamenEjercicio1 {
	static final int TAM=5;
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		double promedio;
		int jubilado;
		int [] edades=new int[TAM];
		rellenaEdades(edades);
		promedio=promedioEdades(edades);
		System.out.println("El promedio es: "+ promedio);
		jubilado=esJubilado(edades);
		System.out.println("la cantidad de jubilados es: "+jubilado);
		System.out.println("la cantidad de trabajadores es "+(TAM-jubilado));
		
	
	}
	public static void rellenaEdades(int[]edades) {
		
		for (int i=0;i<TAM;i++) {
			System.out.println("Ingresa una edad");
			edades[i]=entrada.nextInt();
		}
	}
	public static double promedioEdades(int[]edades) {
		double suma=0;
		for (int i=0;i<TAM;i++) {
			suma=suma+edades[i];
		}
		double promedio=suma/TAM;
		return promedio;
	}
	public static int esJubilado(int[]edades) {
		int contadorJubilado=0;
		for (int i=0;i<TAM;i++) {
			if (edades[i]>65) {
				contadorJubilado++;
			}
		}
		return contadorJubilado;
	}
}
