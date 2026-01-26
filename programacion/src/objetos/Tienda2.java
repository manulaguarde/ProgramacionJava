package objetos;

public class Tienda2 {
	static int i = 0;

	private Producto[] productos = new Producto[10];

	public Tienda2() {
	}

	public void agregarProducto(Producto producto) {
		if (i < 10) {
			productos[i] = producto;
			i++;
		} else
			System.out.println("almacen lleno");
	}
	
	public void verProductos() {
		for (int i=0;i<10;i++) {
			if(productos[i]!=null) {
				productos[i].mostrarProducto();
			}
		}
	}

}
