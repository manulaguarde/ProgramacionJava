package ud4;

public class Recursividad {

	public static void main(String[] args) {
		int num=0;
		System.out.println("El factorial de "+num+" es "+factorial(num));

	}
	public static int factorial (int n) {
		if (n==0) { //caso base
			return 1; //0!=1
		}
		else {		//caso general
			return factorial(n-1)*n;
		}
	}

}
