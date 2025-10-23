package ud3;

//6. Que imprima la suma de todos los números que van del 1 al 100.

public class Hoja2Ejercicio6 {

	public static void main(String[] args) {
		final int VALOR_MAX=100; //con la palabra reservada final defino una constante, y por convencion van en mayusculas
		int cont=1;
		int suma=0;
		
		while (cont<=VALOR_MAX) {
			suma=suma+cont;
			cont++;
		}
		System.out.println(suma);
	}

}
