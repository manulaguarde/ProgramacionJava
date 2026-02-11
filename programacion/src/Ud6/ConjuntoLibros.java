package Ud6;

public class ConjuntoLibros {


	private Libro[] libros;
	private final int TAM=3;
	private int posicion=0;
	
	public ConjuntoLibros() {
		libros=new Libro[TAM];
	}
	public boolean añadirLibro(Libro lib) {
		if(posicion<TAM) {
			libros[posicion]=lib;
			posicion++;
			return true;
		}
		return false;
	}
	public boolean eliminarLibro(String cad) {
		for(int i=0;i<posicion;i++) {
			if(libros[i].getTitulo().equalsIgnoreCase(cad) || libros[i].getAutor().equalsIgnoreCase(cad)) {
				libros[i]=null;
				return true;
			}
		}
		return false;
		//for(int i=0;i<)
	}
	public void mostrarMayorYMenorCalificados() {
		int mayor=0,menor=10;
		
		for(int i=0;i<posicion;i++) {
			if(libros[i].getCalificacion()>mayor) {
				mayor=libros[i].getCalificacion();
			}
			if(libros[i].getCalificacion()<menor) {
				menor=libros[i].getCalificacion();
			}
		}
		System.out.println("Libros con mayor calificación");
		for(int i=0;i<posicion;i++) {
			if(libros[i].getCalificacion()==mayor) {
				System.out.println(libros[i]);
			}
		}
		System.out.println("Libros con menor calificación");
		for(int i=0;i<posicion;i++) {
			if(libros[i].getCalificacion()==menor) {
				System.out.println(libros[i]);
			}
		}
		
	}
	public String toString() {
		String cad="";
		for (int i=0;i<posicion;i++) {
			cad+=libros[i].toString()+"\n";
		}
		return cad;
	}
	public void muestraLibros() {
		for(int i=0;i<posicion;i++) {
			System.out.println(libros[i]);
		}
	}

}
