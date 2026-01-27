package ud5;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		String fecha="25/09/2026";
		Scanner scanner= new Scanner(System.in);
		
		String []fechas=fecha.split("/");
		
		for(int i=0;i<fechas.length;i++) {
			System.out.println(fechas[i]);
		}
		int numero=Integer.parseInt(fechas[1]);
		
		
		
		String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		String fechaNueva= fechas[0]+" de "+meses[numero]+" del "+fechas[2];
		System.out.println(fechaNueva);

	}

}
