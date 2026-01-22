package ud5;

import java.util.Random;

public class EjercicioEnClase {

	public static void main(String[] args) {
		int [] nums=new int[10];
		Random genAle=new Random();
		
		for (int i=0;i<10;i++) {
			nums[i]=genAle.nextInt(101);
		}
		cuentaParesEImpares(nums);
		System.out.println("La mediana es:"+calculaMediana(nums));

	}
	public static void cuentaParesEImpares(int[]nums) {
		int contadorPar=0,contadorImpar=0;
		for (int i=0;i<10;i++) {
			if(nums[i]%2==0) {
				contadorPar+=1;
			}
			else {
				contadorImpar+=1;
			}
			
		}
		System.out.println("cantidad pares= "+contadorPar);
		System.out.println("cantidad impares= "+contadorImpar);
	}
	public static double calculaMediana (int[]nums) {
		double mediana=0;
		int aux=0;
		for(int i=0;i<10;i++) {
			for (int j=0;j<9;j++) {
				if(nums[j]>nums[j+1]) {
					aux=nums[j];
					nums[j]=nums[j+1];
				}
			}
		}
		mediana=((nums[4]+nums[5])/2);
		return mediana;
	}

}
