package Ud6;

import java.util.Scanner;

public class PruebaCuentas {
	
	static int pos=0;

	public static void main(String[] args) {
		/*PersonaCuentas persona=new PersonaCuentas("123A");
		CuentaPersona cuenta1=new CuentaPersona("1");
		persona.añadirCuenta(cuenta1);
		System.out.println(persona.mostrarSaldo(cuenta1));*/
		Scanner scanner=new Scanner(System.in);
		PersonaCuentas []Personas=new PersonaCuentas[10];
		
		System.out.println("Ingresa una opcion:");
		int opcion=scanner.nextInt();
		String dni="";
		switch (opcion) {
			case 1:
				System.out.println("Ingresa DNI");
				dni=scanner.nextLine();
				PersonaCuentas p=new PersonaCuentas(dni);
				Personas[pos]= p;
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
				String cuenta=scanner.nextLine();
				for(int i=0;i<Personas.length;i++) {
					if(Personas[i].dameDni().equals(dni)) {
						Personas[i].añadirCuenta(cuenta);
					}
				}
		}
		
		
	}

}
