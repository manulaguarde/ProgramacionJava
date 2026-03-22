package ejerciciosParaExamen;

import java.util.HashMap;
import java.util.Set;

public class Biblioteca {

	private HashMap<String,Libro> libros;
	
	public Biblioteca() {
		libros=new HashMap<String,Libro>();
	}
	
	public boolean agregarLibro(Libro libro) {
		if (libros.containsKey(libro.getTitulo()))
			return false;
		
		libros.put(libro.getTitulo(), libro);
		return true;
	}
	
	public void prestarLibro(String titulo) {
	if(libros.containsKey(titulo)) {
		Libro libroAPrestar=libros.get(titulo);
		libroAPrestar.prestar();
	}else {
		System.out.println("El libro no se encuentra");
	}

	}
	
	public void mostrarLibros() {
		
		for(Libro libro:libros.values()) {
			System.out.println(libro);
		}
			
	}
}
