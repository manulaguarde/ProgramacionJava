package ud5;

import java.util.Scanner;

/*
 * Rellenar un array con 10 palabras leidas por teclado
 * Mostrar:
 * La palabra mas larga y mas corta
 * la longitud media de las palabras
 * la palabra con mas vocales
 * las palabras que terminan en consonante
 * Eliminar las palabras duplicadas (independientemente de si son mayusculas o minusculas)
 * Ordenar el array alfabeticamente
 */

public class EjercicioEnClase2 {
	
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		String [] palabras=new String[3];
		palabras=rellenaArray(palabras);
		String palabraConMasVocales=tieneMasVocales(palabras);
		System.out.println(palabraConMasVocales);

	}
	public static String[] rellenaArray(String[] palabras) {
		
		for(int i=0;i<3;i++) {
			System.out.println("Ingresa una palabra");
			palabras[i]=scanner.nextLine();
		}
		return palabras;
	}
	
	public static String tieneMasVocales(String[] palabras) {
		String vocales="aeiouAEIOU",palabraConMasVocales="";
		int contadorVocales=0,aux=0;
		for (int i=0;i<3;i++) {
			for(int j=0;j<vocales.length();j++) {
				for(int k=0;k<palabras[i].length();k++) {
					if(vocales.charAt(j)==palabras[i].charAt(k)) {
						contadorVocales+=1;
					}
				}
			}
			if(contadorVocales>aux) {
				palabraConMasVocales=palabras[i];
				aux=contadorVocales;
			}
			contadorVocales=0;
		}
		return palabraConMasVocales;
		
	}

}
