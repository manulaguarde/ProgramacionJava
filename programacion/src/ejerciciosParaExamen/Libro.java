package ejerciciosParaExamen;

public class Libro implements Prestable{
	
	private String titulo;
	private String autor;
	private boolean disponible;
	
	public Libro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
		this.disponible=true;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	
	public void prestar() {
		if (isDisponible()) {
			System.out.println("El libro ha sido prestado correctamente");
			disponible=false;
		}else {
			System.out.println("El libro no se encuentra disponible");
		}
		
		
	}
	
	public void devolver() {
		if(!isDisponible()) {
			System.out.println("El libro ha sido devuelto correctamente");
			disponible=true;
		}else {
			System.out.println("El libro se encuentra en la biblioteca");
		}
	}
	
	public String toString() {
		return this.titulo+" - "+this.disponible;
	}
}
