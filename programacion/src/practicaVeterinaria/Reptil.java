package practicaVeterinaria;

public class Reptil extends Animal {
	
	private String especie;
	private boolean venenoso;
	
	public Reptil(String nombre, String fechaNacimiento, double peso,String especie, boolean venenoso) {
		super(nombre, fechaNacimiento, peso,"");
		this.especie=especie;
		this.venenoso=venenoso;
	}

	public String getEspecie() {
		return especie;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	@Override
	public String toString() {
		return super.toString()+ " Reptil [especie=" + especie + ", venenoso=" + venenoso + "]";
	}
	
	public String dameDatosAnimal() {
		String cad="Nombre: "+super.getNombre()+
				"\nEspecie: "+this.especie+
				"\nFecha de Nacimiento: "+super.getFechaNacimiento()+
				"\nPeso: "+super.getPeso()+
				"\nEs venenoso?: "+this.venenoso+
				"\nComentarios: "+super.getComentarios();
		
		return cad;
	}
	

}
