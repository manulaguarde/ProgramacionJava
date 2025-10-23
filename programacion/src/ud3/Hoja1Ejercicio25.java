package ud3;

import java.util.Scanner;

/*25. Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra
40.000 euros anuales, el programa debe realizar los cálculos en función de los
siguientes criterios:
a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
d. Si lleva menos de 3 años se le aplica un aumento del 3%*/

public class Hoja1Ejercicio25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declaración de variables
		double sueldo;
		int años;
		double aumento = 0;
		double total;
		
		
		System.out.println("Ingrese el sueldo del trabajador:");
		 sueldo = entrada.nextDouble();//leemos del buffer del teclado que se encuentra en RAM
		
		System.out.println("Ingrese los años trabajados:");
		años = entrada.nextInt();
		
			
		if(años>10) {
			
			aumento=(sueldo*0.1);
		} else if (años <= 10 && años > 5) {
			
			aumento=(sueldo*0.07);
		}else if (años <=5 && años >3) {
			
			aumento=(sueldo*0.05);
		
		}else if(años<=3) {
			
			aumento=(sueldo*3)/100;
		}
		
		total=sueldo+aumento;
			
	System.out.println("El sueldo que le corresponde es: "+ total);

	}

}
