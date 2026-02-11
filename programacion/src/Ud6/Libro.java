package Ud6;

public class Libro {

	private String titulo;
	private String autor;
	private int numPaginas;
	private int calificacion;
	
	public Libro(String titulo, String autor, int numPaginas, int calificacion) {
		this.titulo=titulo;
		this.autor=autor;
		this.numPaginas=numPaginas;
		if(calificacion>=0 && calificacion<=10) {
			this.calificacion=calificacion;
		}else {
			this.calificacion=0;
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setNumPaginas(int numPag) {
		this.numPaginas=numPag;
	}
	public void setCalificacion(int cali) {
		this.calificacion=cali;
	}
	public String toString() {
		String libro="Titulo: "+titulo+"\nAutor: "+autor+"\nNumero de páginas: "+numPaginas+"\nCalificacion: "+calificacion+"\n";
		return libro;
	}
}
