package objetos;

public class Producto {
	
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto (int codigo, String nombre, double precio){
		
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		this.stock=0;
		
		
	}
	
	public void aumentarStock(int cantidad) {
		if (cantidad>0) {
			this.stock+=cantidad;
			System.out.println("Stock actualizado");
		}
		else 
			System.out.println("No se permiten cantidades inferiores a 1");
		
	}
	public void vender(int cantidad) {
		if (cantidad>0 && cantidad<=stock) {
			this.stock-=cantidad;
			System.out.println("Venta realizada");
		}
		else
			System.out.println("No se puede ingresar un valor menor a 1 o bien no hay stock disponible");
			
	}
	public void mostrarProducto() {
		System.out.println("Código del producto: "+codigo);
		System.out.println("Nombre del producto: "+nombre);
		System.out.println("Precio: "+precio);
		System.out.println("Stock disponible: "+stock);
	}
	public void cambiarPrecio(double nuevoPrecio) {
		if (nuevoPrecio>0) {
			this.precio=nuevoPrecio;
			System.out.println("Precio actualizado correctamente");
		}
		else
			System.out.println("El precio no puede ser inferior a 1");
	}

}
