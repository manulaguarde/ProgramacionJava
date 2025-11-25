package ud4;

import java.util.Scanner;

public class EjemploBidimensionales {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int[][] matriz=new int[2][3];
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.println("Introduce un número");
				matriz[i][j]=entrada.nextInt();
				
			}
		}
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}

}
