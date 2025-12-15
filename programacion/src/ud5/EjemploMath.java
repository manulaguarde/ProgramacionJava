package ud5;

public class EjemploMath {

	public static void main(String[] args) {
		//abs sirve para conseguir el valor absoluto (sin importar el signo)
		int rsdo=Math.abs(-3);
		
		System.out.println(rsdo);
		
		// pow sirve para elevar a la potencia un número (primero numero y despues potencia)
		double resultado=Math.pow(2, 3);
		System.out.println(resultado);
		
		//Raiz cuadrada
		
		System.out.println("sqrt: "+Math.sqrt(9));
		
		//PI
		System.out.println("PI:"+Math.PI);
		
		//max entre dos parametros
		System.out.println("max: "+Math.max(8, 2));
		
		
		//redondo alejandose del 0
		System.out.println(Math.ceil(-2.5));
		
		//redondeo acercandose al 0
		System.out.println(Math.floor(-3.2));
		
		//redondeo a partir de 0.5
		System.out.println(Math.round(8.3));
	}

}
