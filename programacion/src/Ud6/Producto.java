package Ud6;

public class Producto {

	private String nombre;
	private double precio;
	private int stock;
	

	public Producto(String nombre, double precio, int stock) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
		
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public int stock() {
		return stock;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
	public String toString() {
		String producto="Nombre del producto: "+nombre+"\nPrecio: "+precio+"\nStock: "+stock;
		return producto;
		
	}
}