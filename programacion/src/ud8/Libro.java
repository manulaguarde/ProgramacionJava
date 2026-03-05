package ud8;

public class Libro {
	
	private String titulo,autor;
	private int numPag, calificacion;
	
	public Libro(String titulo, String autor,int numPag,int calificacion) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.numPag=numPag;
		setCalificacion(calificacion);
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		if(calificacion>=0 && calificacion <=10)
			this.calificacion = calificacion;
		else
			this.calificacion=0;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + ", calificacion=" + calificacion
				+ "]";
	}
	
	

}
