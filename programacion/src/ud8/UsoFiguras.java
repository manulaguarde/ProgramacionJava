package ud8;

public class UsoFiguras {

	public static void main(String[] args) {
		
		Figura[] figuras=new Figura[3];
		
		figuras[0]=new Punto("punto");
		figuras[1]=new Circulo("circulo",5);
		figuras[2]=new Cilindro("cilindro",5,2);
		
		for(Figura f:figuras) {
			System.out.println(f);
		}

	}

}
