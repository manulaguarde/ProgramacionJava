package ud8;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
		
		HashSet<String> conjuntoFrutas=new HashSet<String>();
		
		//añado elementos al conjunto
		
		conjuntoFrutas.add("Pera");
		conjuntoFrutas.add("Manzana");
		conjuntoFrutas.add("Melon");
		
		//el conjunto no añade duplicados, no lo permite
		conjuntoFrutas.add("Pera");

		System.out.println(conjuntoFrutas);
		
		//son rapidos para ver si un elemento pertenece al conjunto
		System.out.println(conjuntoFrutas.contains("sandia")); //false
		System.out.println(conjuntoFrutas.contains("Melon")); //true
		
		//eliminar un elemento del conjunto
		conjuntoFrutas.remove("Pera");
		System.out.println(conjuntoFrutas);
		
		//recorrer el conjunto
		for(String fruta:conjuntoFrutas) {
			System.out.println(fruta);
		}
		
		//ver el tamaño
		System.out.println("Tamaño del conjunto: "+conjuntoFrutas.size());
		
		//ver si esta vacío o no
		System.out.println(conjuntoFrutas.isEmpty()); //false
		
		//borrar conjunto
		conjuntoFrutas.clear();
		System.out.println(conjuntoFrutas); //aparece vacío
		
		
	}

}
