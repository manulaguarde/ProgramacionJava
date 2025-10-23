package ud3;

import java.util.Scanner;

//Que pida 3 números y los muestre en pantalla de mayor a menor.
//Y que pida 3 números y los muestre en pantalla de menor a mayor.

public class Hoja1Ejercicio5 {

	public static void main(String[] args) {
		
		int num1, num2, num3, opcion;
	
		
		Scanner entrada=new Scanner(System.in);
		

		
		System.out.println("Ingrese 3 números:");
		
		num1= entrada.nextInt();
		num2= entrada.nextInt();
		num3= entrada.nextInt();
		
		System.out.println("Ingrese 1 para mostrarlos de mayor a menor y 2 para mostrarlos de menor a mayor");
		opcion =entrada.nextInt();

		
		if (opcion==1) {
		
			if (num1>num2 && num2>num3) {
			
				System.out.println(num1+","+num2+","+num3);
			
			}if (num1>num3&&num3>num2) {
			
				System.out.println(num1+","+num3+","+num2);
			
			}if (num2>num1&&num1>num3) {
			
				System.out.println(num2+","+num1+","+num3);
			
			}if (num2>num3&&num3>num1) {
			
				System.out.println(num2+","+num3+","+num1);
			
			}if(num3>num2&&num2>num1) {
			
				System.out.println(num3+","+num2+","+num1);
			
			}if (num3>num1&&num1>num2) {
			
				System.out.println(num3+","+num1+","+num2);
			}
		
		}else if (opcion==2) {
			
			if (num1<num2 && num2<num3) {
				
				System.out.println(num1+","+num2+","+num3);
				
			}if (num1<num3&&num3<num2) {
				
				System.out.println(num1+","+num3+","+num2);
				
			}if (num2<num1&&num1<num3) {
				
				System.out.println(num2+","+num1+","+num3);
				
			}if (num2<num3&&num3<num1) {
				
				System.out.println(num2+","+num3+","+num1);
				
			}if(num3<num2&&num2<num1) {
				
				System.out.println(num3+","+num2+","+num1);
				
			}if (num3<num1&&num1<num2) {
				
				System.out.println(num3+","+num1+","+num2);
			}
			
		}else {
			System.out.println("Opción incorrecta");
		}
	}

}
