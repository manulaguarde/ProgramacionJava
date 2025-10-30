package ud3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int opcion=1;
		
		do {
			System.out.println("Introduce una opcion");
			System.out.println("Para salir Opcion 3");
			opcion= entrada.nextInt();
			
			switch (opcion) {
			
				case 1:
					System.out.println("Opcion 1");
					break;//sentencia de salto incondicional (si no esta sigue evaluando los casos del switch
				case 2:
					System.out.println("Opcion 2");
					break;
				case 3:
					System.out.println("Has salido");
					break;
				default: //caso por defecto
					System.out.println("Opcion no valida");
			}
	
		}while(opcion!=3);
	}

}
