package ud4;

/*Que muestre los primeros 100 números de izquierda a derecha usando un
*array de dos dimensiones
*/

public class Hoja4Ejercicio16 {

	public static void main(String[] args) {
		int [][]matriz=new int[10][10];
		int a=1;
		for (int i=0;i<10;i++) {
			for (int j=0; j<10; j++) {
				matriz[i][j]=a;
				a++;
			}
		}
		for (int i=0; i<10; i++) {
			for (int j=0;j<10;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
