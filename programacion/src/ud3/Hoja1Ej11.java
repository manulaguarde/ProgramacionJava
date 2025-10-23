package ud3;

/*Que pida una letra y detecte si es una vocal*/


public class Hoja1Ej11 {

	public static void main(String[] args) {
		
		char letra;
		
		System.out.println("Ingrese una letra");
		
		letra= 'e';
		
		System.out.println(letra);
		
		if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra =='u') {
		
			System.out.println("La letra es una vocal");
		
		}else {
			System.out.println("La letra es una consonante");
			
		}

	}

}
