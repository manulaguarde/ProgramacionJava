package practicaVeterinaria;

public class Gato extends Animal {
	
	private String raza;
	private String microchip;
	
	public Gato(String nombre, String fechaNacimiento, double peso, String raza, String microchip) {
		super(nombre,fechaNacimiento,peso,"");
		this.raza=raza;
		this.microchip=microchip;
		
	}
	
}
