package ud4;

import java.util.Scanner;

public class Hoja5Ejercicio7 {
	
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2, resultado, opcion;
		double resultadoDiv;
		
		do {
			mostrarMenu();
			opcion=entrada.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese los números a sumar");
				num1=entrada.nextInt();
				num2=entrada.nextInt();
				
				resultado=sumar(num1, num2);
				System.out.println("El resultado es: "+resultado);
				break;
			case 2:
				System.out.println("Ingrese los números a restar");
				num1=entrada.nextInt();
				num2=entrada.nextInt();
				
				resultado=restar(num1,num2);
				System.out.println("El resultado es: "+resultado);
				break;
			case 3:
				System.out.println("Ingrese los números a multiplicar");
				num1=entrada.nextInt();
				num2=entrada.nextInt();
				
				resultado=multiplicar(num1,num2);
				System.out.println("El resultado es: "+resultado);
				break;
			case 4:
				System.out.println("Ingrese los números a dividir");
				num1=entrada.nextInt();
				num2=entrada.nextInt();
				
				resultadoDiv=dividir(num1,num2);
				System.out.println("el resultado es: "+resultadoDiv);
				break;
			case 5:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opcion inválida");	
			}
			
		}while(opcion!=5);
	

	}
	public static void mostrarMenu() {
		System.out.println("Ingrese una opción\n"
						+ "1. Para sumar\n"
						+ "2. Para restar\n"
						+ "3. Para multiplicar\n"
						+ "4. Para dividir\n"
						+ "5. Para salir");
	}
	public static int sumar(int a, int b) {
		
		int resultado = a+b;
		return resultado;
	}
	public static int restar(int a, int b) {
		
		int resultado = a-b;
		return resultado;
	}
	public static int multiplicar(int a, int b) {
		
		int resultado = a*b;
		return resultado;
	}
	public static double dividir(int a, int b) {
		
		double resultado = (double) a/b;
		return resultado;
	}

}
