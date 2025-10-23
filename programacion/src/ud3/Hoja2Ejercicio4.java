package ud3;

//4. Que muestre los números pares que haya del 1 al 100.

public class Hoja2Ejercicio4 {

	public static void main(String[] args) {
	
		int cont=1;
		int resultado=0;
		
		while(cont<=100) {
			
			resultado=cont%2;
					if (resultado==0) {
						System.out.println(cont);
					}
			cont= cont+1;
		}
		/*
		 * *
		 
		System.out.println();
		int cont=2;
		
		while(cont<=100) {
			System.out.print(cont+" "); //asi aparecen los resultados en la misma linea (quitando el "ln"), uno detras del otro y agregamos el espacio
			cont=cont+2;
		}
		*
		*/
	}

}
