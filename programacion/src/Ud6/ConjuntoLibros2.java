package Ud6;

import java.util.Arrays;

public class ConjuntoLibros2 {

	private Libro[] libros;
	public final static int TAM=10;
	private int numLibros;
	
	public ConjuntoLibros2() {
		libros=new Libro[TAM];
		numLibros=0;
	}
	public boolean addLibro(Libro libro) {
		if (numLibros==TAM) 
			return false;
		
		if(existeLibro(libro))
			return false;
		
		libros[numLibros]=libro;
		numLibros++;
		return true;
		
	}
	public void mostrarMinimaYMaximaCalificacion() {
		int max=dameMaximaCalificacion();
		int min=dameMinimaCalificacion();
		
		for(int i=0;i<numLibros;i++) {
			if(libros[i].getCalificacion()==max) {
				System.out.println("Libros con máxima calificacion:" +libros[i]);
			}
		}
		for(int i=0;i<numLibros;i++) {
			if(libros[i].getCalificacion()==min) {
				System.out.println("Libros con mínima calificacion: "+libros[i]);
			}
		}
	}
	public void mostrarLibros() {
		System.out.println(this.toString());
	}
	//los private van debajo de los public
	private boolean existeLibro(Libro libroBuscado) {
		for (int i=0;i<numLibros;i++) {
			if(libros[i].getAutor().equals(libroBuscado.getAutor())) {
				if (libros[i].getTitulo().equals(libroBuscado.getTitulo())) {
					return true;
				}
			}
		}
		return false;
	}
	private int dameMaximaCalificacion() {
		int max=libros[0].getCalificacion();
		for (int i=1;i<numLibros;i++) {
			if (libros[i].getCalificacion()>max) {
				max=libros[i].getCalificacion();
			}
		}
		return max;
	}
	private int dameMinimaCalificacion() {
		int min=libros[0].getCalificacion();
		for (int i=1;i<numLibros;i++) {
			if (libros[i].getCalificacion()<min) {
				min=libros[i].getCalificacion();
			}
		}
		return min;
	}
	
	public String toString() {
		String cad="";
		for(int i=0;i<numLibros;i++) {
			cad+=(i+1)+"."+libros[i]+"\n";
		}
		return cad;
	}
	
}
