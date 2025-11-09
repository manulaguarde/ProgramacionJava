package juegoTresEnRaya;

import java.util.Scanner;

public class PruebaMenu {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int[]array ={1,2,3,4,5,6,7,8,9};
		int j=0;
		int opcion;
		
		do {
			System.out.println("1. Jugar una partida\n"
					+ "2. Mostrar estadísticas\n"
					+ "3. Salir\n"
					+ "Seleccione una opción:");
			opcion=entrada.nextInt();
			
			switch (opcion){
				case 1:
					for(int i=1;i<=7;i++) {
						for(int raya=1;raya<=13;raya++) {
							if(i%2!=0)
							System.out.print("-");
						}
						for(int barra=1; barra<4; barra++) {
							if(i%2==0) {
								System.out.print("|");
								for(int espacio=1;espacio==1;espacio++) {
									System.out.print(" ");
									for(int numero=1;numero==1;numero++){
										System.out.print(array[j]);
									}
									j++;
									System.out.print(" ");
								}
							}
						}
						if(i%2!=0) {
							System.out.println();
						}else {
							System.out.println("|");
						}
					}

					break;
				case 2:
					break;
				case 3: 
					System.out.println("Has salido");
					break;
				default: 
					System.out.println("Opcion incorrecta");
			}
			
			
		}while(opcion!=3);

	}

}
