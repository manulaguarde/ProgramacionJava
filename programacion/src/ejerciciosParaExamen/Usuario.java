package ejerciciosParaExamen;

public class Usuario {
	
	private static int contadorUsuarios=0;
	
	private String nombre;
	private String email;

	public Usuario(String nombre, String email) {
		this.nombre=nombre;
		this.email=email;
		contadorUsuarios++;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public static int getContadorUsuario() {
		return contadorUsuarios;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Usuario)) {
			return false;
		}
		
		Usuario u=(Usuario) obj;
		if(this.email.equals(u.getEmail()))
			return true;
	
		return false;
	}
	
	
	
}
