package Ud6;

import java.util.Scanner;

public class CreaPasswords {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingresa cantidad de contraseñas a generar");
		int cant=scanner.nextInt();
		System.out.println("Indica la longitud de las contraseñas");
		int longitud=scanner.nextInt();
		
		Password[] contrasenias=new Password[cant];
		
		for(int i=0;i<contrasenias.length;i++) {
			contrasenias[i]=new Password(longitud);
		}
		
		boolean [] fortaleza=new boolean[cant];
		for(int i=0;i<fortaleza.length;i++) {
			fortaleza[i]=contrasenias[i].esFuerte();
			System.out.println("Contraseña: "+contrasenias[i].getContrasenia()+" es lo suficientemente fuerte?: "+fortaleza[i]);
		}

	}

}
