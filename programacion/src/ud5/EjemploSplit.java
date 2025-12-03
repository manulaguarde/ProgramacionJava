package ud5;

public class EjemploSplit {

	public static void main(String[] args) {
		String cad1="hola a todos";
		
		String[]palabras=cad1.split(" ");
		
		//System.out.println(palabras[2]);
		
		for (int i=0;i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}

	}

}
