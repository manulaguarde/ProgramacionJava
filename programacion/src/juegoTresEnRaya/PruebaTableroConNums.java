package juegoTresEnRaya;

public class PruebaTableroConNums {

	public static void main(String[] args) {
		
		/*int[]array ={1,2,3,4,5,6,7,8,9};
		int j=0;
		
		for(int i=1;i<=7;i++) {
			for(int raya=1;raya<=13;raya++) {
				if(i%2!=0)
				System.out.print("-");
			}
			for(int barra=1; barra<4; barra++) {
				if(i%2==0) {
					System.out.print("|");
					for(int espacio=1;espacio==1;espacio++) {
						System.out.print(" "+array[j]+" ");
						j++;
					}
				}
			}
			if(i%2!=0) {
				System.out.println();
			}else {
				System.out.println("|");
			}
		}*/
		int i=1;
		System.out.println("-------------");
		for(int filas=0;filas<3;filas++) {
			for(int columnas=0;columnas<3;columnas++) {
				System.out.print("| "+i+" ");
				i++;
			}
			System.out.println("|\n-------------");
			
		}

	}

}
