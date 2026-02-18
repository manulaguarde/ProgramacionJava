package ud7;

public class UsoUniversidad {

	public static void main(String[] args) {
		Persona[] personas=new Persona[6];
		
		personas[0]=new Estudiantes("Manuel","Rey Laguarde","123445a","soltero","DAW1");

		personas[1]=new Profesores("Pablo","Grillo","654321z","casado","205",2010,"informática");
		
		personas[2]=new PersonalServicio("Jorge","Ramirez","147258g","viudo","105",2020,"Limpieza");
		
		personas[3]=new Estudiantes("Manuel","Rey Laguarde","123445a","soltero","DAW1");

		personas[4]=new Profesores("Pablo","Grillo","654321z","casado","205",2010,"informática");
		
		personas[5]=new PersonalServicio("Jorge","Ramirez","147258g","viudo","105",2020,"Limpieza");
		
		
		//hace una conversion automática
		//dependiendo el objeto imprime el estado (los atributos o características) de cada uno
		int cont=0;
		for (int i=0;i<personas.length;i++) {
			System.out.println(personas[i]);
			if(personas[i] instanceof Estudiantes) { //instanceof es un operador comparador entre objeto y clase
				cont++;
			}
		
		}
		
		
		
		
	}

}
