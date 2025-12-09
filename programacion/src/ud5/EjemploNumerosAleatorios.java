package ud5;

import java.util.Random;

public class EjemploNumerosAleatorios {

	public static void main(String[] args) {
		int[]frecuencia=new int[11];
		
		Random genAle=new Random();
		
		//generamos 100 números aleatorios
		for(int i=0;i<100;i++) {
			int numAle=genAle.nextInt(11);
			frecuencia[numAle]++;
		}
		for (int i=0;i<11;i++) {
			System.out.println(i+":"+frecuencia[i]+":");
		
		}

	}

}
