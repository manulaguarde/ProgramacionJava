package ud4;

import java.util.Scanner;

public class EjerciciosFuncionesYArrays2 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero;
		int[]nums1=new int[5];
		int[]nums2=new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un número");
			numero=entrada.nextInt();
			nums1[i]=numero;
		}
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un número");
			numero=entrada.nextInt();
			nums2[i]=numero;
		}
		suma(nums1,nums2);
		for(int i=0;i<5;i++) {
			System.out.println(nums1[i]);
		}
	}
	public static void suma (int[] nums1,int[] nums2) {
		
		for(int i=0;i<5;i ++) {
			nums1[i]=nums1[i]+nums2[i];
			
		}
	}

}
