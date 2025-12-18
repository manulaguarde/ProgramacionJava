package ud5;

import java.util.Random;

/*
 * 15. Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
 */

public class PracticaEvaluable {

	public static void main(String[] args) {
		String[] figuras = { "corazon", "diamante", "herradura", "campana", "limon" };
		String[] tirada = new String[3];

		Random genAle = new Random();

		// System.out.print("Tirada: ");
		for (int i = 0; i < 3; i++) {
			tirada[i] = figuras[genAle.nextInt(5)];
			System.out.print(tirada[i] + " ");

		}
		System.out.println();
		if (tirada[0].equals(tirada[1]) && tirada[0].equals(tirada[2])) {
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		} else if (tirada[0].equals(tirada[1]) || tirada[0].equals(tirada[2]) || tirada[1].equals(tirada[2])) {
			System.out.println("Bien, ha recuperado su moneda");
		} else {
			System.out.println("Lo siento, ha perdido");
		}
	}

}
