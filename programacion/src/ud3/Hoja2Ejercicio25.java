package ud3;

//Que escriba los primeros 25 dígitos de la sucesión de Fibonacci.

public class Hoja2Ejercicio25 {

	public static void main(String[] args) {
		int i=0, j=0, k=1, l;
	
		System.out.println(j);
		System.out.println(k);
		for(i=1;i<=23;i++) {
			l=j+k;
			System.out.println(l);
			
			j=k;
			k=l;
				
			
		}

	}

}
