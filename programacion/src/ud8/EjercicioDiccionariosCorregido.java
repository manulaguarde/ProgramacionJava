package ud8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EjercicioDiccionariosCorregido {

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
			if(!palabras.containsKey(p)) {
				palabras.put(p, 1);
			}else {
				palabras.put(p, palabras.get(p)+1);
			}
		}
		
		Set<String>clavesDePalabras=palabras.keySet();
		for(String p:clavesDePalabras) {
			System.out.println(p+" - "+palabras.get(p));
		}
		
		

	}

}
