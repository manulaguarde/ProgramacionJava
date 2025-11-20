package ud4;

import java.util.Scanner;

public class EjerciciosFuncionesYArrays {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		int[]nums1=new int[5];
		int[]nums2=new int[5];
		rellenaArrays(nums1,nums2);
		
		int[]numsSumados=sumaArrays(nums1,nums2);
		for (int i =0;i<5;i++) {
			System.out.println(numsSumados[i]);
		}
	}
	public static void rellenaArrays(int[]nums1, int[]nums2) {
		int numero;
		for (int i=0;i<5;i++) {
			System.out.println("Ingrese un número");
			numero=entrada.nextInt();
			nums1[i]=numero;
		}
		for (int i=0;i<5;i++) {
			System.out.println("Ingrese un número");
			numero=entrada.nextInt();
			nums2[i]=numero;
		}
	}
	public static int[] sumaArrays(int[]nums1, int[] nums2) {
		int[]suma=new int[5];
		for (int i=0;i<5;i++) {
			suma[i]=nums1[i]+nums2[i];
		}
		return suma;
	}
}
