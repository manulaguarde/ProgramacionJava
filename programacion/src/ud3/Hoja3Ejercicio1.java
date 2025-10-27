package ud3;

import java.util.Scanner;

/*
 * 1. Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong
o Narcisista. Un número es Armstrong cuando la suma de cada uno de los números que lo
componen elevado al número de dígitos de dicho número da como resultado
el propio número. Ejemplo de un número de 3 dígitos: 153=1³+5³+3³
*/

public class Hoja3Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		/*int centenas, decenas, unidades, centenasALaTres, decenasALaTres,unidadesALaTres, numero, numeroNarcisista;
		
		do {
		System.out.println("ingrese un número de 3 cifras, primero las centenas (entre 1 y 9");
		centenas= entrada.nextInt();
		System.out.println("ahora las decenas  (entre 0 a 9)");
		decenas= entrada.nextInt();
		System.out.println("y por ultimo las unidades (entre 0 a 9)");
		unidades= entrada.nextInt();
		
		}while((centenas<=0&&centenas>9) || (decenas<0&&decenas>9) || (unidades<0&&unidades>9));
		
		
		centenasALaTres= centenas*centenas*centenas;
		decenasALaTres= decenas*decenas*decenas;
		unidadesALaTres= unidades*unidades*unidades;
		
		numero=(centenas*100)+(decenas*10)+unidades;
		
		numeroNarcisista=centenasALaTres+decenasALaTres+unidadesALaTres;
		
		if(numero==numeroNarcisista) {
			System.out.println("El número ingresado "+numero+ " es número Narcisista o número Armstrong");
		}*/
		
		int numeroIngresado, numero=0, centenas=0, decenas=0, centenasALaTres, decenasALaTres, unidadesALaTres, numeroNarcisista;
		
		do {	
		System.out.println("Ingrese un número de 3 cifras");
		numeroIngresado= entrada.nextInt();
		}while(numeroIngresado<100&&numeroIngresado>999);
		
		numero=numeroIngresado;
		while(numero>=100) {
			numero=numero-100;
			centenas++;
		}
		while(numero>=10) {
			numero=numero-10;
			decenas++;
		}
		
		centenasALaTres= centenas*centenas*centenas;
		decenasALaTres= decenas*decenas*decenas;
		unidadesALaTres= numero*numero*numero;
		
		numeroNarcisista=centenasALaTres+decenasALaTres+unidadesALaTres;
		
		if(numeroIngresado==numeroNarcisista) {
			System.out.println("El número ingresado "+numeroIngresado+ " es número Narcisista o número Armstrong");
		}else {
			System.out.println("El número ingresado "+numeroIngresado+" no es número Narcisista o número Armstrong");
		}
	}

}
