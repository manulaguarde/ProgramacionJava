package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjercicioEnClaseBD {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String uri="jdbc:mysql://localhost:3306/bd_clientes";
		String user="admin";
		String passwd="1234";
		
		String opcion;
		
		try {
			Connection connection=DriverManager.getConnection(uri,user,passwd);
			Statement statementSQL =connection.createStatement();
			do {
				System.out.println("Ingresa una opción:\n1.Insertar\n2.Actualizar por id\n3.Borrar por id\n4.Salir");
				opcion=scanner.nextLine();
				switch (opcion) {
					case "1":
						System.out.println("Ingresa ID");
						String id=scanner.nextLine();
						System.out.println("Ingresa nombre");
						String nombre=scanner.nextLine();
						System.out.println("Ingresa edad");
						String edad=scanner.nextLine();
						
						String sql="insert into clientes values ("+id+","+nombre+","+Integer.parseInt(edad)+")";
						int row=statementSQL.executeUpdate(sql);
						System.out.println("se han afectado a "+row+" filas");
						
						break;
					case "2":
						System.out.println("Ingresa el id");
						id=scanner.nextLine();
						System.out.println("ingresa el nombre nuevo");
						nombre=scanner.nextLine();
						System.out.println("Ingresa la edad nueva");
						edad=scanner.nextLine();
						
						sql="update clientes set nombre="+nombre+",edad="+Integer.parseInt(edad)+" where id="+id;
						row=statementSQL.executeUpdate(sql);
						System.out.println("se han afectado a "+row+" filas");
						
						break;
					case "3":
						System.out.println("Ingresa el id");
						id=scanner.nextLine();
						
						sql="delete from clientes where id="+id;
						row=statementSQL.executeUpdate(sql);
						System.out.println("se han afectado a "+row+" filas");
						
						break;
					case "4":
						System.out.println("Has salido");
						break;
					default:
						System.out.println("Opción incorrecta");
				}
				
			}while(!opcion.equals("4"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}


	}

}
