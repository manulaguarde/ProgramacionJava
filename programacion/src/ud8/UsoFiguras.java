package ud8;

import java.util.ArrayList;

public class UsoFiguras {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras=new ArrayList<Figura>();
		/*
		figuras[0]=new Punto("punto",1,1);
		figuras[1]=new Circulo("circulo",5,figuras[0]);
		figuras[2]=new Cilindro("cilindro",5,2);
		*/

		Punto punto=new Punto("centro",1,1);
		Circulo circulo=new Circulo("base",2,punto);
		Cilindro cilindro=new Cilindro("cilindro",circulo,3);
		
		figuras.add(punto);
		figuras.add(circulo);
		figuras.add(cilindro);
		
		for(int i=0; i<figuras.size();i++) {
			System.out.println("Area: "+figuras.get(i).getNombre()+" "+figuras.get(i).obtenerArea());
		}
		System.out.println();
		for(Figura f:figuras) {
			System.out.println("Area: " +f.getNombre()+" "+f.obtenerArea());
		}

	}

}
