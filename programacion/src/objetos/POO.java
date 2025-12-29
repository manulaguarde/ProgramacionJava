package objetos;

public class POO {

	public static void main(String[] args) {
		
		Persona pers1=new Persona("Manuel",30,"55357513E");
		Persona pers2=new Persona("Bianca",32,"52664382H");
		Persona pers3=new Persona();
		
		pers3.setNombre("Pedro");
		pers3.setEdad(40);
		pers3.setDni("73867204R");
		
		System.out.println(pers1.getNombre());
		System.out.println(pers1.getEdad());
		System.out.println(pers1.getDni());
		
		System.out.println("------------------");
		
		System.out.println(pers2.getNombre());
		System.out.println(pers2.getEdad());
		System.out.println(pers2.getDni());
		
		System.out.println("------------------");
		
		System.out.println(pers3.getNombre());
		System.out.println(pers3.getEdad());
		System.out.println(pers3.getDni());

	}

}
