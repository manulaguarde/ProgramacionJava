package juegoTresEnRaya;

public class PruebaTableroVacio {

	public static void main(String[] args) {
		int[]array ={1,2,3,4,5,6,7,8,9};
		
		for(int i=1;i<=7;i++) {
			for(int raya=1;raya<=13;raya++) {
				if(i%2!=0)
				System.out.print("-");
			}
			for(int barra=1; barra<4; barra++) {
				if(i%2==0) {
					System.out.print("|");
					for(int espacio=1;espacio<=3;espacio++) {
						System.out.print(" ");
					}
				}
			}
			if(i%2!=0) {
				System.out.println();
			}else {
				System.out.println("|");
			}
		}

	}

}
