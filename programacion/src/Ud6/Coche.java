package Ud6;

public class Coche {
	//Atributos sin modificador de acceso
		/*int ruedas;
		String motor, color, matricula;*/
	
	//atributos con modificador de acceso
		private int ruedas;
		private String motor, color, matricula;
	
	//Métodos
				/*La matricula es un atributo que tiene que establecerse al crear el objeto
				 * y el método constructor permite inicializar estos atributos.
				 * Con el getter la matricula puede leerse(recibirse por parámetro) pero no hay setters, por lo cual 
				 * ese valor inicial no puede cambiar(porque la matricula es única)
				 */
		
				//El método constructor debe dar un valor inicial a los atributos del objeto
				//En el caso de las ruedas, no se reciben por parámetro porque no debe modificarse, es un valor por defecto, pero el resto si
				//matricula es donde se guardará el dato y mat es el dato a guardar, por eso se llaman diferente aunque se refieran a lo mismo
		public Coche(String mat, String mot, String col) { 
			ruedas=4;
			matricula=matricula;
		}
		
		//Métodos getters: permiten LEER el valor de un atributo desde fuera de la clase
		public int dameRuedas() {
			return ruedas;
		}
		
		public String dameColor() {
			return color;
		}
		
		public String dameMatricula() {
			return matricula;
		}
		
		public void arrancar() {
			System.out.println("Has arrancado!!!");
		}
		
		public void frenar() {
			System.out.println("Has frenadado!!!");
		}
		
		public void pitar() {
			System.out.println("Pip Pip Pip!!!!!");
		}

		
		//Métodos setters: permiten MODIFICAR o ESCRIBIR el valor del un atributo desde fuera de la clase
		public void establecerColor(String nuevoColor) {
			color=nuevoColor;
		}
		
		

}
