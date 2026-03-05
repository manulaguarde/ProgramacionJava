package ud8;

import java.util.ArrayList;

public class ConjuntoLibros {
	
	private ArrayList<Libro> libros;
	
	public ConjuntoLibros() {
		libros=new ArrayList<Libro>();
	}
	
	public boolean addLibro(Libro lib) {
		if(lib instanceof Libro) {
			if(libros.contains(lib))
				return false;
			else{
				libros.add(lib);
				return true;
			}
		}
		return false;
	}
	
	public boolean eliminarLibroPorTitulo(String titulo) {
		for (int i=0;i<libros.size();i++) {
			if(libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				libros.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean eliminarLibroPorAutor(String autor) {
		for (int i=0;i<libros.size();i++) {
			if(libros.get(i).getAutor().equalsIgnoreCase(autor)) {
				libros.remove(i);
				return true;
			}
		}
		return false;
	}
	
	private int dameMaximaCalificacion() {
		int max=0;
		for(int i=0;i<libros.size();i++) {
			if (libros.get(i).getCalificacion()>max) {
				max=libros.get(i).getCalificacion();
			}
		}
		return max;
	}
	private int dameMinimaCalificacion() {
		int min=10;
		for(int i=0;i<libros.size();i++) {
			if (libros.get(i).getCalificacion()<min) {
				min=libros.get(i).getCalificacion();
			}
		}
		return min;
	}
	
	public void librosConMaxYMinCalificacion() {
		int max=dameMaximaCalificacion();
		int min=dameMinimaCalificacion();
		
		System.out.println("Libros con mejores calificaciones:");
		for(int i=0;i<libros.size();i++) {
			if(libros.get(i).getCalificacion()==max) {
				System.out.println(libros.get(i));
			}
		}
		System.out.println();
		System.out.println("Libros con peores calificaciones");
		for(int i=0;i<libros.size();i++) {
			if(libros.get(i).getCalificacion()==min) {
				System.out.println(libros.get(i));
			}
		}
	}
	
	public void mostrarConjuntoDeLibros() {
		System.out.println(this.toString());	
	}
	
	public String toString() {
		String cad="";
		for(int i=0;i<libros.size();i++) {
			cad+=(i+1)+"."+libros.get(i)+"\n";
		}
		return cad;
	}

}
