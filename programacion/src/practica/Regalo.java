package practica;

public class Regalo {

	private String nombre;
	private double precio;
	private String descripcion;
	
	public Regalo(String nombre,double precio,String descripcion) {
		this.nombre=nombre;
		this.precio=precio;
		this.descripcion=descripcion;
		
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
		
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public void setDescripcion(String desc) {
		this.descripcion=desc;
	}
	public String toString() {
		return "Nombre del regalo: "+nombre+"\nPrecio: "+precio+" Euros"+"\nDescripcion: "+descripcion+"\n";
	}
}
