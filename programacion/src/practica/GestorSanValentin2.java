package practica;

import java.util.Scanner;

public class GestorSanValentin2 {
	
	static Scanner scanner=new Scanner(System.in);
	static int tam=0;
	static Pareja []parejas=new Pareja[10];

	public static void main(String[] args) {
		mostrarMenu();
		

	}
	public static void mostrarMenu() {
		int opcion;
		do {
			System.out.println("Introduce una opción\n1. Agregar pareja y sus regalos\n2. Mostrar detalles de las parejas y sus regalos"
					+ "\n3. Salir del programa");
			opcion=scanner.nextInt();
			scanner.nextLine();
			switch(opcion) {
				case 1:
					agregarPareja();
					break;
				case 2:
					mostrarDetallesParejas();
					break;
				case 3:
					System.out.println("Feliz San Valentin");
					break;
				default:
					System.out.println("Opcion incorrecta, vuelve a ingresar");
			}
		}while(opcion!=3);
	}
	public static void agregarPareja() {
		if(tam<10) {
			System.out.println("Ingrese el NOMBRE seguido del DNI de la primer persona de la pareja pareja");
			Persona p1=new Persona(scanner.nextLine(),scanner.nextLine());
			System.out.println("Ingresse el NOMBRE seguido del DNI de la segunda persona de la pareja");
			Persona p2=new Persona(scanner.nextLine(),scanner.nextLine());
			parejas[tam]=new Pareja(p1,p2);
			System.out.println("Ahora de la primer persona ingrese el nombre del regalo, seguido del precio y por ultimo la descripción");
			String nom=scanner.nextLine();
			double precio=scanner.nextDouble();
			scanner.nextLine();
			String desc=scanner.nextLine();
			parejas[tam].setRegaloParaPersona1(new Regalo(nom,precio,desc));
			System.out.println("Ahora de la segunda persona ingrese el nombre del regalo, seguido del precio y por ultimo la descripción");
			nom=scanner.nextLine();
			precio=scanner.nextDouble();
			scanner.nextLine();
			desc=scanner.nextLine();
			parejas[tam].setRegaloParaPersona2(new Regalo(nom,precio,desc));
			//parejas[tam]=pareja;
			tam++;
		}
		else {
			System.out.println("Has completado la cantidad de parejas");
			
		}
	}
	public static void mostrarDetallesParejas() {
		for(int i=0;i<tam;i++) {
			parejas[i].mostrarDetalles();
			//System.out.println(parejas[i].toString());
			
			//Queria poner aca todo lo que se pedía pero no me dío tiempo
		}
	}

}
