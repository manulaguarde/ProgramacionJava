package practicaVeterinaria;

public class Pajaro extends Animal{

	private String especie;
	private boolean cantor;
	
	public Pajaro(String nombre, String fechaNacimiento, double peso,String especie, boolean cantor) {
		super(nombre,fechaNacimiento,peso,"");
		this.especie=especie;
		this.cantor=cantor;
	}

	public String getEspecie() {
		return especie;
	}

	public boolean isCantor() {
		return cantor;
	}

	@Override
	public String toString() {
		return super.toString()+" Pajaro [especie=" + especie + ", cantor=" + cantor + "]";
	}
	public String dameDatosAnimal() {
		String cad="Nombre: "+super.getNombre()+
				"\nEspecie: "+this.especie+
				"\nFecha de Nacimiento: "+super.getFechaNacimiento()+
				"\nPeso: "+super.getPeso()+
				"\nEs cantor?: "+this.cantor+
				"\nComentarios: "+super.getComentarios();
		
		return cad;
		
	}
	
}
