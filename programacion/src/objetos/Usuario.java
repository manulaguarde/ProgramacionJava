package objetos;

import java.util.Scanner;

public class Usuario {
	
	static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		
		CuentaBancaria usuario1=new CuentaBancaria("538409386304968634","Pedro Ramirez");
		int opcion;
		double deposito,retiro;
		do {
			System.out.println("Ingresa una opción:\n1.Para depositar dinero\n2.Para retirar dinero\n"
					+ "3.Para ver el estado de la cuenta\n4.Para salir");
			opcion=scanner.nextInt();
			
			switch (opcion) {
				case 1: 
					System.out.println("Ingrese la cantidad a depositar");
					deposito=scanner.nextDouble();
					usuario1.depositar(deposito);
					break;
				case 2:
					System.out.println("Ingrese la cantidad a retirar");
					retiro=scanner.nextDouble();
					usuario1.retirar(retiro);
					break;
				case 3:
					usuario1.mostrarEstado();
					break;
				case 4:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
		}while(opcion!=4);

	}

}
