package ejerciciosParaExamen;

import java.util.ArrayList;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
		
		vehiculos.add(new Coche ("Toyota","Auris"));
		vehiculos.add(new Coche("Citroen","C3"));
		vehiculos.add(new Moto("Honda","XR"));
		vehiculos.add(new Moto("Vespa","ModeloQueNoConozco"));
		
		for (Vehiculo vehiculo:vehiculos) {
			if(vehiculo instanceof Coche) {
				vehiculo.acelerar(50);
			}else {
				vehiculo.acelerar(30);
			}
		}
		
		for(Vehiculo vehiculo:vehiculos) {
			System.out.println(vehiculo);
		}
		
		
	}

}
