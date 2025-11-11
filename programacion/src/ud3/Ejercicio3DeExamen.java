package ud3;

import java.util.Scanner;

/*Ejercicio 3. Diseñe un algoritmo mediante pseudocódigo o diagramas
de flujo (especifique las variables a usar, para qué sirven y su tipo de
dato) que pida dos números entre 0 y 100. Se debe controlar que los
valores son correctos (mostrando en caso contrario un mensaje de
error), es decir: que están comprendidos entre 0 y 100, y que los
números no son iguales. Se deben considerar los siguientes casos:
- En caso de que el primer número (A) sea menor que el
segundo (B) se mostrarán todos los números que van desde A
hasta B en orden creciente (Por ejemplo si los números leídos
son A=2 y B=5, se mostrará: 2,3,4,5).
- En caso de que el primer número (A) sea mayor que el segundo
(B) se mostrarán todos los números que van desde A hasta B
en orden decreciente (Por ejemplo si los números leídos son
A=5 y B=1, se mostrará: 5,4,3,2,1). 
*/

public class Ejercicio3DeExamen {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Ingrese dos números entre 0 y 100");
		System.out.println("Ingrese el primer número");
		num1=entrada.nextInt();
		System.out.println("Ingrese el segundo número");
		num2=entrada.nextInt();
		
		if((num1<0 || num1>100) || (num2<0 ||num2>100) || (num1==num2)) {
			System.out.println("Error al ingresar algun número");
		}else {
			if(num1<num2) {
				for(int i=num1;i<=num2;i++) {
					System.out.println(i);
				}
			}
			if(num1>num2) {
				for(int i=num1; i>= num2; i--) {
					System.out.println(i);
				}
			}
		}
	}

}
