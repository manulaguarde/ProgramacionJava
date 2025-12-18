package ud5;

import java.util.Random;

public class HojaEjerciciosNumAleatoriosEj14Bis {

	static Random genAle=new Random();
	public static void main(String[] args) {
		int numCompases=genAle.nextInt(7)+1;
		String melodia="";
		
		for (int i=0;i<numCompases;i++) {
			melodia=generaCompas(melodia);
		}
		melodia+="|";
		System.out.println(melodia);
		

	}
	public static String generaCompas(String melodia) {
		String [] notas= {"do","re","mi","fa","sol","la","si"};
		for (int i=0;i<4;i++) {
			int numAle=genAle.nextInt(7);
			melodia+=notas[numAle]+" ";
		}
		melodia+=" ";
		return melodia;
	}
	public static String extraePrimeraNota(String melodia) {
		String primeraNota="";
		for (int i=0;i<melodia.length();i++) {
			if (melodia.charAt(i)!=' ') {
			primeraNota+=melodia.charAt(i);
			}else {
			return 
		}
	}

}
