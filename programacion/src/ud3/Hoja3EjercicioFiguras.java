package ud3;

import java.util.Scanner;

/*
 * Realiza un programa usando bucles que muestren las siguientes figuras. Se deben pedir por
teclado el número de filas de la figura antes de dibujarlas.
*/
public class Hoja3EjercicioFiguras {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int i=0,j=0,numFilas, cont=0, k=0,l=0 ,contDos;
		
		
		System.out.println("ingrese un número de filas");
		numFilas=entrada.nextInt();
		
		/*for(i=0;i<numFilas;i++) {
			for(j=0;j<=cont;j++) {
			System.out.print("*");	
			}
			cont++;
			System.out.println();
			}*/
		k=numFilas-1;
		
		for(i=0;i<numFilas;i++) {
			for(j=0;j<=cont;j++) {

				for(l=k;l>0;l--) {
					System.out.print(" ");
					
				}
				k--;
				System.out.print("*");
				
			}
			cont=cont+2;
			System.out.println();
		}	

	}

}
