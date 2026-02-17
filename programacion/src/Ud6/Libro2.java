package Ud6;

public class Libro2 {


	private String titulo;
	private String autor;
	private int numPaginas;
	private int calificacion;
	
	public Libro2(String titulo, String autor, int numPaginas, int calificacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		setCalificacion(calificacion);
	}
	public Libro2(String titulo,String autor, int numPaginas) {
		this(titulo,autor,numPaginas,0);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		if (calificacion>=0 && calificacion<=10)
			this.calificacion = calificacion;
		else
			this.calificacion=0;
	}
	@Override
	public String toString() {
		return "Libro2 [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", calificacion="
				+ calificacion + "]";
	}
	
	
}
