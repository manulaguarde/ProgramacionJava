package ud4;

//Que muestre por pantalla los números del 1 al 100, utilizar recursividad.

public class Hoja5Ejercicio3 {

	public static void main(String[] args) {
		mostrarNumeros(1);
		

	}
	public static void mostrarNumeros(int n) {
		if(n==100) {
			System.out.println("100");
		}
		else {
			System.out.println(n);
			n++;
			mostrarNumeros(n);
		}
	}
}
