package ud4;

import java.util.Scanner;

/*
 * Que rellene dos arrays de 5 leidos por teclado y los almacene en otro array que sea el resultado 
 * de multiplicar el primer array por el segundo
 * 
 */

public class EjercicioEnClase {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int [] nums1= new int[5];
		int [] nums2= new int[5];
		int [] resultado= new int[5];

		
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un número");
			nums1[i]= entrada.nextInt();
			System.out.println("Ingrese un número");
			nums2[i]=entrada.nextInt();
		}
		
		/*for (int i=0;i<5;i++) {
			System.out.println("Ingrese un número");
			nums2[i]= entrada.nextInt();
		}*/
		int i=0, j=0;
		for(j=0;j<5;j++) {
			resultado[j]=nums1[i]*nums2[i];
			i++;
			System.out.println(resultado[j]+" ");
		}
	}

}
