package ud5;

import java.util.Scanner;

public class EjercicioCapicua {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num="";
		int numero;
		boolean esEntero=false;
		
		do {
			System.out.println("Ingrese un número");
			esEntero=scanner.hasNextInt();
			if (esEntero) {
				num=scanner.nextLine();
			}else {
				esEntero=false;
			}
		
		}while(esEntero==false);
		
		
		String numInvertido=invierteCadena(num);

		
		if (num.equals(numInvertido)) {
			System.out.println("El número es capicua");
		}else {
			System.out.println("El número no es capicua");
		}

	}
	public static String invierteCadena(String num) {
		String numInvertido="";
		
		for(int i=num.length()-1;i>=0;i--) {
			numInvertido=numInvertido+num.charAt(i);
		}
		return numInvertido;
	}
	public static boolean esNumero(String num) {
		String numeros="0123456789";
		for (int i=0;i<num.length();i++) {
			for (int j=0;j<numeros.length();j++) {
				if (num.charAt(i)!=numeros.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
