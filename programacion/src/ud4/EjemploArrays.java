package ud4;

import java.util.Scanner;

public class EjemploArrays {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		//int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;
		//double media;
		
		//el problema es que no se pueden usar bucles, porque se almacena cada entrada en una variable distinta, en un bucle perdemos el valor de la variable
		
		/*System.out.println("Introduce nota 1");
		nota1= entrada.nextInt();
		
		System.out.println("Introduce nota 2");
		nota2= entrada.nextInt();*/
		
		//la solucion son los arrays
		
		//definimos un array de notas
		int [] notas;
		
		//reservamos RAM para el array
		notas=new int[8];
		
		//definición de variables
		int suma=0;
		double media;
		int i=0;
		
		for(i=0;i<8;i++) {
			System.out.println("Introduce nota " +(i+1)+": ");
			notas[i]=entrada.nextInt();
			suma=suma+notas[i];
		}
			
		//hacemos el bucle para no tener que hacer lo siquiente
		/*System.out.println("Introduce nota 1");
		notas[0]=entrada.nextInt();
		suma=suma+notas[0];
		
		System.out.println("Introduce nota 2");
		notas[1]=entrada.nextInt();
		suma=suma+notas[1];*/ //etc...
		
		System.out.println("La media es: "+(suma/8.0));
		
		//mostramos las notas del alumno
		for (i=0;i<8;i++) {
			
			System.out.println("nota: "+notas[i]);
		}
	}

}
