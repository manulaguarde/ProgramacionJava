package Ud6;

public class Rectangulo_Uso {

	public static void main(String[] args) {
		//Objeto llamado r1
		Rectangulo r1=new Rectangulo(2, 3);
		System.out.println(r1.calculaPerimetro()+" es el perimetro de r1 "
				+ "y "+r1.calculaArea()+" es su area");

		Rectangulo r2=new Rectangulo(8, 20);
		System.out.println(r2.calculaPerimetro()+" es el perimetro de r2 "
				+ "y "+r2.calculaArea()+" es su area");
		
		/*Rectangulo r3=new Rectangulo(3, 7);
		System.out.println(r3.calculaPerimetro()+" es el perimetro de r3 "
				+ "y "+r3.calculaArea()+" es su area");
		
		//Otro objeto llamado r4
		Rectangulo r4=new Rectangulo(8, 2);
		System.out.println(r4.calculaPerimetro()+" es el perimetro de r4 "
				+ "y "+r4.calculaArea()+" es su area");
		
		Rectangulo r5=new Rectangulo(2.5, 2);
		System.out.println(r5.calculaPerimetro()+" es el perimetro de r5 "
				+ "y "+r5.calculaArea()+" es su area");*/
	}

}
