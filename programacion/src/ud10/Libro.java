package ud10;

public class Libro {

	private String titulo;
	private String autor;
	private int numPaginas;
	private int calificacion;
	
	public Libro(String titulo, String autor, int numPaginas, int calificacion)throws CalificacionNoCorrecta  {
		this.titulo=titulo;
		this.autor=autor;
		this.numPaginas=numPaginas;
		setCalificacion(calificacion);
		/*try {
			validarCalificacion(calificacion);
			this.calificacion=calificacion;
		}catch(CalificacionNoCorrecta e) {
			System.out.println(e.getMessage());
			this.calificacion=0;
		}*/
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
	public void setCalificacion(int cali)throws CalificacionNoCorrecta  {
		if((cali>=0) && (cali<=10)) {
			this.calificacion=cali;
		}else {
			throw new CalificacionNoCorrecta("La calificación es incorrecta debe estar entre 0 y 10");
		}
	}
	public String toString() {
		String libro="Titulo: "+titulo+"\nAutor: "+autor+"\nNumero de páginas: "+numPaginas+"\nCalificacion: "+calificacion+"\n";
		return libro;
	}
}