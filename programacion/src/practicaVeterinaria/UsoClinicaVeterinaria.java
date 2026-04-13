package practicaVeterinaria;

import java.util.Scanner;

public class UsoClinicaVeterinaria {
	
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		ClinicaVeterinaria clinica1=new ClinicaVeterinaria();
		String opcion="";
		
		do {
			System.out.println("Ingresa una opción:\n1.Para agregar un animal\n2.Para buscar un animal"
					+ "\n3.Para añadirle un comentario a un animal\n4.Para mostrar todos los animales\n5.Para salir");
			opcion=scanner.nextLine();
			
			switch (opcion) {
				case "1":
					System.out.println("Ingresa el tipo de animal que quieres agreagar (Perro/Gato/Pajaro/Reptil)");
					String tipoAnimal=scanner.nextLine();
					while(!tipoAnimal.equalsIgnoreCase("Perro")&&!tipoAnimal.equalsIgnoreCase("Gato")&&!tipoAnimal.equalsIgnoreCase("Pajaro")&&!tipoAnimal.equalsIgnoreCase("Reptil")) {
						System.out.println("No es posible agregar este animal. Por favor ingrese otro");
						tipoAnimal=scanner.nextLine();
					}
					clinica1.insertaAnimal(agregarAnimal(tipoAnimal));
					break;
				case "2":
					System.out.println("Introduce el nombre del animal que estas buscando");
					String nombre=scanner.nextLine();
					if(clinica1.buscaAnimal(nombre)!=null)
						System.out.println(clinica1.buscaAnimal(nombre));
					else
						System.out.println("No se encuentra el animal");
					break;
				case "3":
					System.out.println("Introduce el nombre");
					nombre=scanner.nextLine();
					System.out.println("Introduce el comentario");
					String comentario=scanner.nextLine();
					if(clinica1.modificaComentarioAnimal(nombre, comentario)) {
						System.out.println("El comentario ha sido agregado existosamente");
					}else {
						System.out.println("No se pudo añadir el comentario, el nombre no se encuentra");
					}
					break;
				case "4":
					System.out.println(clinica1.toString());
					break;
				case "5":
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opción incorercta, vuelve a ingresar");
			}
			
			
		}while(!opcion.equals("5"));

	}
	public static Animal agregarAnimal(String tipoAnimal) {
		System.out.println("Introduce el nombre");
		String nombre=scanner.nextLine();
		System.out.println("Introduce la fecha de nacimiento");
		String fecha=scanner.nextLine();
		System.out.println("Introduce el peso");
		double peso=scanner.nextDouble();
		scanner.nextLine();
		if(tipoAnimal.equalsIgnoreCase("Perro")) {
			System.out.println("Introduce raza");
			String raza=scanner.nextLine();
			System.out.println("Introduce microchip");
			String microchip=scanner.nextLine();
			return new Perro(nombre,fecha,peso,raza,microchip);
		}
		if(tipoAnimal.equalsIgnoreCase("Gato")) {
			System.out.println("Introduce raza");
			String raza=scanner.nextLine();
			System.out.println("Introduce microchip");
			String microchip=scanner.nextLine();
			return new Gato(nombre,fecha,peso,raza,microchip);
		}
		if(tipoAnimal.equalsIgnoreCase("Pajaro")) {
			System.out.println("Ingresa especie");
			String especie=scanner.nextLine();
			System.out.println("¿Es cantora? Si/NO");
			String cantor=scanner.nextLine();
			boolean canta=false;
			if(cantor.equalsIgnoreCase("si")) {
				canta=true;
			}
			return new Pajaro(nombre,fecha,peso,especie,canta);
		}
		System.out.println("Ingresa especie");
		String especie= scanner.nextLine();
		boolean venenoso=false;;
		System.out.println("¿Es venenoso? Si/No");
		String veneno=scanner.nextLine();
		if (veneno.equalsIgnoreCase("si")) {
			venenoso=true;
		}
		return new Reptil(nombre,fecha,peso,especie,venenoso);
		
	}

}
