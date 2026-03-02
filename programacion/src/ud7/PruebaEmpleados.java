package ud7;

import java.util.Scanner;

public class PruebaEmpleados {
	
	static Scanner scanner;
	public static void main(String[] args) {
		Empleado[] empleados=new Empleado[4];
		scanner=new Scanner(System.in);
		int indice=0;
		
		System.out.println("Qué tipo de empleado quieres dar de alta?\n1.Base más comision\n2.Por comision");
		String opcion=scanner.nextLine();
		
		if(opcion.equals("1")) {
			empleados[indice]=pedirDatosEmpleado(opcion);
			indice++;
		}
		else if(opcion.equals("2")) {
			empleados[indice]=pedirDatosEmpleado(opcion);
			indice++;
		}
		else {
			System.out.println("Opción incorrecta");
		}
		
	}
	public static Empleado pedirDatosEmpleado(String opcion) {
		System.out.println("Introduce nombre");
		String nombre=scanner.nextLine();
		System.out.println("Introduce apellido");
		String apellido=scanner.nextLine();
		System.out.println("Introduce núm Seguridad Social");
		String num_SS=scanner.nextLine();
		String salarioBase="0";
		if(opcion.equals("1")) {
			System.out.println("Introduce salario base");
			salarioBase=scanner.nextLine();
		}
		System.out.println("Introduce número de ventas");
		String numVenta=scanner.nextLine();
		System.out.println("Introduce comisión por venta");
		String comision=scanner.nextLine();
		
		Empleado empleado;
		if(opcion.equals("1")) {
			empleado=new EmpleadoBaseMasComision(nombre,apellido,num_SS,Integer.parseInt(salarioBase),Integer.parseInt(numVenta),Integer.parseInt(comision));
		}
		else {
			empleado=new EmpleadoPorComision(nombre, apellido, num_SS,Integer.parseInt(numVenta),Integer.parseInt(comision));
		}
		return empleado;
	}

}
