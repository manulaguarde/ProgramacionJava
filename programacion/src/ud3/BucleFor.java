package ud3;

/*
 * Ejemplos para entender el bucle for
 */

public class BucleFor {

	public static void main(String[] args) {
		int i=0;
		
		for (i=1;i<=10;i++) { //la primera vuelta solo evalua la condicion pero no se incrementa
			//1º  3º 	2º			//luego en la segunda vuelta el primer paso es incrementar y despues evaluar
			System.out.println(i);
		}

	}

}
