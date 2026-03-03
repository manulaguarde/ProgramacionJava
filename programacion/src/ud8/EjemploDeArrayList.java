package ud8;

import java.util.ArrayList;

public class EjemploDeArrayList {

	public static void main(String[] args) {
		
		// definimos una collección
	  //coleccion tipo   nombre
		ArrayList<Integer> numeros; // se pone dentro de los <> el tipo, solo puede almacenar objetos asi que debemos definir para enteros Integer de la clase wrapper
									//<> alude a un concepto que se llama genérico
									//ArrayList<Integer> es una clase
		
		numeros=new ArrayList<Integer>();
		System.out.println(numeros); //lista vacía
		numeros.add(5); //agrego un número, con sintaxis de objeto (uso el punto)
		numeros.add(10);
		numeros.add(7);
		System.out.println(numeros); //se muestran en orden, y llama al toString de la clase ArrayList
		
		for(int i=0;i<numeros.size();i++) { //es size y no length
			System.out.println(numeros.get(i)); //recorro el ArrayList y los muestro uno a uno
			
		}
		System.out.println(numeros.contains(5)); //comprobamos si la lista contiene un dato, en este caso el número 5
		
		System.out.println(numeros.indexOf(10)); //comprobamos en que posición (en que índice) está el 10 - si no está aparece un -1
		
		numeros.remove(0);//elimina por índice, en este caso elimina el 5
		
		numeros.clear(); //borra toda la coleccion
		System.out.println(numeros); //lista vacía
		
		
		
		
		
	}

}
