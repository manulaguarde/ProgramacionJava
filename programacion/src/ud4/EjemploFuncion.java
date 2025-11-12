package ud4;

public class EjemploFuncion {

	public static void main(String[] args) { //lo unico que se ejecuta en el programa es lo que esta en el método main
		//Paso 2: llamo a la funcion suma
		
		int resultado=suma(3,5);
		System.out.println(resultado);

	} //la siguiente funcion tiene que estar fuera de la primera (del main)
	
	//Paso 1: definimos la función suma
	//cabecera
	public static int suma(int a, int b) {
		//cuerpo
		int rsdo=a+b; //las variables dentro de la funcion es distinta a otra variable en otra funcion (puedo nombrarlas igual)
		return rsdo;
	}
}
