package Ud6;

public class Tienda {
	
	private Producto[] productos;
	private int numProductos=0;


	public Tienda() {
		productos=new Producto[10];
	}
	public boolean darAlta(Producto prod) {
		if(numProductos<10) {
			productos[numProductos]=prod;
			numProductos++;
			return true;
		}
		return false;
	}
	public Producto buscarProducto(String nom) {
		for (int i=0;i<productos.length;i++) {
			if(productos[i].getNombre().equals(nom)) {
				return productos[i];
			}
		}
		return null;
	}
	public boolean modificarStock(String nom, int stock) {
		for(int i=0;i<productos.length;i++) {
			if (productos[i].getNombre().equals(nom)) {
				productos[i].setStock(stock);
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String cad="";
		for (int i=0;i<productos.length;i++) {
			cad+=productos[i].toString()+"\n";
		}
		return cad;
	}
	
	
}

