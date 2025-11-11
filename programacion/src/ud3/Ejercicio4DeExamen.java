package ud3;

import java.util.Scanner;

/*Ejercicio 4. Diseñe un algoritmo mediante pseudocódigo o diagramas
de flujo (especifique las variables a usar, para qué sirven y su tipo de
dato) que pida al usuario un carácter (mostrando las dos opciones que
se plantean a continuación) y tenga el siguiente funcionamiento:
- En caso de que el carácter sea igual a ‘p’, deberá mostrar por
pantalla todos los números pares comprendidos entre 1 y 500.

- En caso de que el carácter sea igual a ‘i’, deberá mostrar por
pantalla todos los números impares comprendidos entre 1 y
500.
- En caso de que sea cualquier otro carácter el introducido por el
usuario, mostrará un mensaje de error y pedirá de nuevo al
usuario que introduzca una opción para mostrar los números
pares o impares.*/

public class Ejercicio4DeExamen {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		char opcion;

		System.out.println("Ingrese una opción\n"
				+ "Ingrese 'p' para conocer todos los números pares entre 1 y 500\n"
				+ "Ingrese 'i' para conocer todos los números impares entre 1 y 500");
				opcion=entrada.nextLine().charAt(0);
				
			while(opcion!='i' && opcion!='p'){
				System.out.println("Opcion incorrecta, vuelve a ingresar");
				opcion=entrada.nextLine().charAt(0);
			}
					
			if(opcion=='p') {
				for(int i=2;i<=500;i+=2) {
					System.out.println(i);
				}
			}else if(opcion=='i') {
				for (int i=1;i<=500;i+=2) {
					System.out.println(i);
				}
			}
	}

}
