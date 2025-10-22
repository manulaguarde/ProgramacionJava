package ud3;

import java.util.Scanner;

/*
 * Que solicite la media de X números, se dejarán de solicitar números hasta que se
 *introduzca el cero.
 */


public class Hoja2Ejercicio23 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num;
		int suma=0;
		int cont=0;
		double media=0;
		
		System.out.println("Introduce los nº para conocer la media. Para terminar introduce 0");
		num= entrada.nextInt();
		
		if(num==0) {
			System.out.println("La media es: 0");
		}else {
			while(num!=0) {
				suma=suma+num;
				cont++;
				num= entrada.nextInt();
				
			}
		
		media=(double)suma/cont;
				//casting= cambia el tipo original al que le indicamos, en este caso de int a double
		System.out.println("La media es: "+media);
		}
	}

}
