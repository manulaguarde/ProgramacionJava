package ud8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioEnClaseDiccionarios {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashMap<String,Integer>palabras=new HashMap<String,Integer>();
		ArrayList<String>pal=new ArrayList<String>();
		String palabra;
		int masRepetida=0,repite=0;
		do {
			System.out.println("Ingresa una palabra, cuando no quieras ingresar más ingresa salir");
			palabra=scanner.nextLine();
			if(palabra.equalsIgnoreCase("Salir"))
				System.out.println("Has salido");
			else {
				pal.add(palabra);
			}
		}while(!palabra.equalsIgnoreCase("salir"));
		
		for(String p:pal) {
			for(String a:pal) {
				if(p.equals(a)) {
					repite++;
				}
			}
			if(repite>masRepetida) {
				masRepetida=repite;
				palabra=p;
			}
			palabras.put(p, repite);
			repite=0;
		}
		System.out.println(palabras);
		System.out.println("La mas repetida es "+palabra+" con "+masRepetida);
		
		

	}

}
