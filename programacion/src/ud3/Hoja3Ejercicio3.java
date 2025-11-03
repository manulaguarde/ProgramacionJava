package ud3;

import java.util.Scanner;

/*
 * 3. Números Primos Gemelos. Desarrolla un programa que encuentre y muestre todos los
 * pares de "números primos gemelos" en un rango dado. Los números primos gemelos son dos
 * números primos que difieren en 2 unidades. Por ejemplo, 41 y 43 son un par de números
 * primos gemelos.
 * 
 */

public class Hoja3Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int rangoUno, rangoDos, num, suma=0, numPrimo, sumaPrimos=0, gemeloUno=0, gemeloDos=0, cont;
		
		System.out.println("Ingrese el rango donde quiere hayar numeros primos gemelos");
		rangoUno= entrada.nextInt();
		System.out.println("Ingrese el límite");
		rangoDos= entrada.nextInt();
	
		for (num=rangoUno;num<=rangoDos;num++) {
			for (cont=1;cont<=num/2;cont++) {
				if (num%cont==0) {
					suma++;
				}
			}
			if (suma==1) {
				numPrimo=num;
				sumaPrimos++;
				
				if (sumaPrimos==1) {
					gemeloUno=numPrimo;
					gemeloDos=gemeloUno;
				}else {
					gemeloUno=gemeloDos;
					gemeloDos=numPrimo;
				}
				if (gemeloDos==gemeloUno+2) {
					System.out.println(gemeloUno+" y "+gemeloDos+" son números primos gemelos");
					}
				}

			suma=0;
		}
	}

}
