package ud8;

import java.util.HashMap;
import java.util.Set;

public class EjemploHashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> frutas=new HashMap <String,Integer>();

		//añadimos frutas y cantidades al diccionario
		frutas.put("pera", 5);
		frutas.put("melon", 10);
		frutas.put("pera", 7); //si la clave está repetida sobreescribe el último valor
		frutas.put("sandia", 8);
		
		System.out.println(frutas);
		
		System.out.println(frutas.get("melon")); //si paso la clave con get me devuelve el valor
		
		//borrar un elemento
		frutas.remove("sandia");
		
		System.out.println("nº de frutas ="+frutas.size());
		
		//set es la clase padre de HashSet
		Set<String> clavesFrutas=frutas.keySet();
		
		for(String fruta:clavesFrutas) {
			System.out.print(fruta+", ");
		}
		System.out.println();
		
		System.out.println(frutas.containsKey("melon"));//como contiene melon la respuesta es true
		
	}

}
