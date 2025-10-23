package ud3;

//18. Que escriba las tablas de multiplicar del 0 al 10.

import java.util.Scanner;

public class Hoja2Ejercicio18 {

	public static void main(String[] args) {

	
			
			int num=0;
			
			while(num<=10){
			int cont=0;
				while(cont<=10) {
					System.out.println(num+"X"+cont+"="+(num*cont));
					cont++;
				}
			num++;
			}
			
		}
	

}
