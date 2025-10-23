package ud3;

/*Desarrolle un algoritmo que permita leer dos valores distintos, determinar cuál de los
dos valores es el mayor y escribirlo por pantalla.*/

public class Hoja0Ejercicio1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		System.out.println("Introduce dos números");
		num1=5;
		num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		}
		else {
			System.out.println(num2+" es mayor que "+num1);
		}
		
	}

}
