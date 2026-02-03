package Ud6;

public class Tienda {
	
	private Producto[] productos;
	private int numProductos=0;


	public Tienda() {
		productos=new Producto[10];
	}
	public boolean darAlta(Producto prod) {
		if(numProductos<10) {
			this.productos[numProductos]=prod;
			numProductos++;
			return true;
		}
		return false;
	}
	public Producto buscarProducto(String nom) {
		for (int i=0;i<numProductos;i++) {
			if(productos[i].getNombre().equals(nom)) {
				return productos[i];
			}
		}
		return null;
	}
	public boolean modificarStock(String nom, int stock) {
		for(int i=0;i<numProductos;i++) {
			if (productos[i].getNombre().equals(nom)) {
				productos[i].setStock(stock);
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String cad="";
		for (int i=0;i<numProductos;i++) {
			cad+=productos[i].toString()+"\n";
		}
		return cad;
	}
	public void borraProducto(String nombre) {
		for (int i=0;i<numProductos;i++) {
			if(nombre.equals(productos[i].getNombre())) {
				productos[i]=productos[i+1];
				for(int j=i+1;j<numProductos-1;j++) {
					productos[j]=productos[j+1];
				}
			}
		}
	}
	
}

