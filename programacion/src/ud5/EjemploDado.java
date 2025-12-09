package ud5;

import java.util.Random;

public class EjemploDado {

	public static void main(String[] args) {
		int[]frecuencia= new int[6];
		Random genAle= new Random();
		
		for(int i=0;i<100;i++) {
			int numAle=genAle.nextInt(6)+1;
			frecuencia[numAle-1]++;
		}
		for (int i=0;i<6;i++) {
			System.out.println((i+1)+":"+frecuencia[i]+":"+((100.0*frecuencia[i])/100)+"%");
		
		}
	}

}
