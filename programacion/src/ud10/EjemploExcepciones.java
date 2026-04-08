package ud10;

//Este es un ejemplo de excepción predefinida en Java

public class EjemploExcepciones {
	
	public static double divide(double a,double b) throws ArithmeticException{ //este método estático puede (o no) lanzar una excepción de tipo ArithmeticException
		//si el denominador es 0 lanzamos una excepcion -> como es un objeto, el objeto hay que crearlo.
		if(b==0) {
			throw new ArithmeticException("No se puede dividir por cero"); //creamos el objeto y lo lanzamos
		}
		return a/b;
	}

	public static void main(String[] args) {
		try { //dentro ponemos la línea de código de generar una excepción
			System.out.println(divide(5,0));
		}catch (ArithmeticException e){ //si se produce la excepción entra en el catch
			// e es el objeto que se captura
			System.out.println(e.getMessage());
		}
		

	}

}
