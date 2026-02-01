package Ud6;

import java.util.Scanner;

public class PruebaCuentas {
	
	static int pos=0;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		PersonaCuentas []Personas=new PersonaCuentas[10];
		int opcion;
		
		do {
			System.out.println("Ingresa una opcion:\n1.Añadir Persona\n2.Buscar Persona\n3.Añadir Cuenta"
					+ "\n4.Realizar ingreso/pago\n5.Salir");
			opcion=scanner.nextInt();
			String dni="", numCuenta,operacion;
			double cantidad=0;
			switch (opcion) {
				case 1:
					System.out.println("Ingresa DNI");
					dni=scanner.nextLine();
					PersonaCuentas p=new PersonaCuentas(dni);
					Personas[pos]= p;
					System.out.println("Persona añadida correctamente");
					pos++;
					break;
				case 2: 
					System.out.println("Ingresa DNI");
					dni=scanner.nextLine();
					for(int i=0;i<Personas.length;i++) {
						if(Personas[i].dameDni().equals(dni)) {
							System.out.println(Personas[i]);
						}
						else {
							System.out.println("No se encontro la persona");
						}
					}
					break;
				case 3:
					System.out.println("Ingresa DNI");
					dni=scanner.nextLine();
					System.out.println("Ingresa el nº de cuenta");
					numCuenta=scanner.nextLine();
					for(int i=0;i<Personas.length;i++) {
						if(Personas[i] !=null && Personas[i].dameDni().equals(dni)) {
							CuentaPersona cuenta= new CuentaPersona(numCuenta);
							Personas[i].añadirCuenta(cuenta);
							System.out.println("Cuenta añadida con éxito");
						}
					}
					break;
				case 4:
					System.out.println("Ingresa DNI");
					dni=scanner.nextLine();
					System.out.println("Ingresa el nº de cuenta");
					numCuenta=scanner.nextLine();
					System.out.println("Desea hacer un pago o un ingreso?\nSi es pago ingrese 'p'\nSi es ingreso ingrese 'i'");
					operacion=scanner.nextLine();
					if (operacion.equalsIgnoreCase("p")) {
						System.out.println("Ingrese la cantidad");
						cantidad=scanner.nextDouble();
						scanner.nextLine();
						for(int i=0;i<Personas.length;i++) {
							if(Personas[i] !=null && Personas[i].dameDni().equals(dni)) {
								if(Personas[i].efectuaPagoEnCuenta(numCuenta, cantidad)) {
									System.out.println("Pago efectuado correctamente");
								}else {
									System.out.println("El pago no pudo efectuarse");
								}
								}
							}
					}else if(operacion.equalsIgnoreCase("i")) {
						System.out.println("Ingrese la cantidad");
						cantidad=scanner.nextDouble();
						scanner.nextLine();
						for(int i=0;i<Personas.length;i++) {
							if(Personas[i] !=null && Personas[i].dameDni().equals(dni)) {
								if(Personas[i].recibeAbonoEnCuenta(numCuenta, cantidad)) {
									System.out.println("Ingreso efectuado correctamente");
								}else {
									System.out.println("El ingreso no pudo efectuarse");
								}
							}
						}
					}else {
						System.out.println("Opción incorrecta");
					}
					break;
				case 5:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Opcion incorrecta, vuelva a ingresar");
			}
		}while(opcion!=5);
		
		
	}

}
