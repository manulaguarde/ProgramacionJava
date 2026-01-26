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
		
		String [] palabras=new String[10];
		palabras=rellenaArray(palabras);
		/*String palabraMasLarga=encuentraMasLarga(palabras);
		System.out.println(palabraMasLarga);
		String palabraMasCorta=encuentraMasCorta(palabras);
		System.out.println(palabraMasCorta);
		double media=calculaLaMedia(palabras);
		System.out.println(media);
		String palabraConMasVocales=tieneMasVocales(palabras);
		System.out.println(palabraConMasVocales);
		muestraPalabrasConsonante(palabras);*/
		String[] palabrasSinRepetir=eliminaDuplicados(palabras);
		for(int i=0;i<palabrasSinRepetir.length;i++) {
			System.out.println(palabrasSinRepetir[i]);
		}

	}
	public static String[] rellenaArray(String[] palabras) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingresa una palabra");
			palabras[i]=scanner.nextLine();
		}
		return palabras;
	}
	
	public static String tieneMasVocales(String[] palabras) {
		String vocales="aeiouAEIOU",palabraConMasVocales="";
		int contadorVocales=0,aux=0;
		for (int i=0;i<10;i++) {
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
	public static String encuentraMasLarga(String []palabras){
		int cont=0, aux=0;
		String palabraMasLarga=palabras[palabras.length-1];
		for(int i=palabras.length-1;i>0;i--) {
			if(palabraMasLarga.length()<palabras[i-1].length()) {
				palabraMasLarga=palabras[i-1];
			}
		}
		return palabraMasLarga;
	}
	public static String encuentraMasCorta(String []palabras){
		int cont=0, aux=0;
		String palabraMasCorta=palabras[palabras.length-1];
		for(int i=palabras.length-1;i>0;i--) {
			if(palabraMasCorta.length()>palabras[i-1].length()) {
				palabraMasCorta=palabras[i-1];
			}
		}
		return palabraMasCorta;
	}
	public static double calculaLaMedia(String [] palabras) {
		int suma=0;
		for (int i=0;i<palabras.length;i++) {
			suma+=palabras[i].length();
		}
		double media=suma/palabras.length;
		return media;
	}

	public static void muestraPalabrasConsonante(String[]palabras){
		String vocales="aeiou",aux="";
		
		for(int i=0;i<palabras.length;i++) {
			if(vocales.contains(aux+palabras[i].charAt(palabras[i].length()-1))==false) {
				System.out.println(palabras[i]);
			}
		}
	}
	
	public static String [] eliminaDuplicados(String[] palabras) {
		
		int cont=10;
		String[]aux=new String[10];
		for(int i=0; i<palabras.length; i++) {
			for(int j=i+1; j<palabras.length; j++) {
				if(palabras[i].equalsIgnoreCase(palabras[j])) {
					palabras[i]="";
					cont-=1;
				}
			}
		}
		String[] palabrasSinRepetir=new String[cont];
		for(int i=0; i<aux.length; i++) {
			if(!palabras[i].equals("")) {
				palabrasSinRepetir[i]=aux[i];
			}
		}
		return palabrasSinRepetir;
	}
}
