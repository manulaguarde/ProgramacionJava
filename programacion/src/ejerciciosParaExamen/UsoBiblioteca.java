package ejerciciosParaExamen;

public class UsoBiblioteca {

	public static void main(String[] args) {
		Biblioteca biblioteca=new Biblioteca();
		
		biblioteca.agregarLibro(new Libro("Alicia en el pais de las maravillas","no se el autor"));
		biblioteca.agregarLibro(new Libro("Moby Dick","No se el autor tampoco"));
		biblioteca.agregarLibro(new Libro("El Señor de los Anillos", "Tolkien"));
		
		biblioteca.prestarLibro("Moby Dick");
		biblioteca.prestarLibro("El Señor de los Anillos");
		biblioteca.prestarLibro("Moby Dick");
		
		biblioteca.prestarLibro("asfasdf");
		
		biblioteca.mostrarLibros();

	}

}
