package ud5;

/*
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2,
 * 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */

import java.util.Random;

public class HojaEjerciciosNumAleatoriosEj4 {

	public static void main(String[] args) {
		Random genAle= new Random();
		String[] palos= {"bastos", "copas", "oros", "espadas"};
		String[] cartas= {"as","2","3","4","5","6","7","sota","caballo","rey"};
		
		System.out.println("La carta es: "+cartas[genAle.nextInt(cartas.length)]+" de "+palos[genAle.nextInt(palos.length)]);

	}

}
