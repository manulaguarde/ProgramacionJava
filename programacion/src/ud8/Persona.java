package ud8;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	//para sobrescribir un método la cabecera tiene que ser exactamente igual
	public boolean equals(Object obj) {
		
		//comprobamos que ambos apuntal al mismo lado
		if(this==obj) return true;
		
		//en caso de que el objeto que le paso no es de tipo Persona comprobamos
		if(!(obj instanceof Persona)) {
			return false;
		}
		
		//para usar los métodos de Persona tenemos que forzar el tipo, castear
		Persona p=(Persona) obj;
		if(this.nombre.equals(p.getNombre()) && this.edad==p.getEdad()) {
			return true;
		}
		return false;
	}
}
