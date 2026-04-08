package ud10;

public class UsoLibro {

	public static void main(String[] args) {
		Libro l1=null;
		try {
			l1=new Libro("hoal","asdlkfjas",200,11);
		}catch(CalificacionNoCorrecta e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(l1);

	}

}
