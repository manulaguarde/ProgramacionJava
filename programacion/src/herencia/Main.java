package herencia;

public class Main {

	public static void main(String[] args) {
		
		Perro perro=new Perro("firulais");
		Gato gato=new Gato("minino");
		
		perro.ladrar();
		perro.comer();
		perro.dormir();
		gato.maullar();
		gato.comer();
		gato.dormir();
		System.out.println(perro.getNombre());
		System.out.println(gato.getNombre());
	}

}
