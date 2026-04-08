package ud10;

public class UsoEdadNoEstaEnRango {
	
	public static void validarEdad(int edad) throws EdadNoEstaEnRango{// es una excepción porque hereda de Exception
		
		if ((edad <=0) || (edad>=100)) {
			throw new EdadNoEstaEnRango("La edad debe estar comprendida entre 1 y 99");
		}
	}

	public static void main(String[] args) {
	
		try {
			validarEdad(5);
		}catch(EdadNoEstaEnRango e) {
			System.out.println(e.getMessage());
		}
	}

}
