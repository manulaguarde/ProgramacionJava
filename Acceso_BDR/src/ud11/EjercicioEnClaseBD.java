package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjercicioEnClaseBD {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String uri="jdbc:mysql://localhost:3306/bd_clientes";
		String user="admin";
		String passwd="1234";
		String consultaSql="", sql;
		
		String opcion;
		
		try {
			Connection connection=DriverManager.getConnection(uri,user,passwd);
			Statement statementSQL =connection.createStatement();
			do {
				System.out.println("Ingresa una opción:\n1.Insertar\n2.Actualizar por id\n3.Borrar por id\n4.Consulta por id\n5.Salir");
				opcion=scanner.nextLine();
				switch (opcion) {
					case "1":
						System.out.println("Ingresa ID");
						String id=scanner.nextLine();
						System.out.println("Ingresa nombre");
						String nombre=scanner.nextLine();
						System.out.println("Ingresa edad");
						String edad=scanner.nextLine();
						if(existeCliente(id, statementSQL)) {
							System.out.println("El id ya existe");
						}else {
							sql="insert into clientes values ('"+id+"','"+nombre+"',"+edad+")";
							int row=statementSQL.executeUpdate(sql);
							System.out.println("se han afectado a "+row+" filas");
						}
						
						
						break;
					case "2":
						System.out.println("Ingresa el id");
						id=scanner.nextLine();
						System.out.println("ingresa el nombre nuevo");
						nombre=scanner.nextLine();
						System.out.println("Ingresa la edad nueva");
						edad=scanner.nextLine();
						if(!existeCliente(id, statementSQL)) {
							System.out.println("El id no se encuentra");
						}else {
							sql="update clientes set nombre='"+nombre+"',edad="+edad+" where id='"+id+"'";
							int row=statementSQL.executeUpdate(sql);
							System.out.println("se han afectado a "+row+" filas");
							
						}

						break;
					case "3":
						System.out.println("Ingresa el id");
						id=scanner.nextLine();
						if(!existeCliente(id, statementSQL)) {
							System.out.println("El id no se encuentra");
						}else {
							sql="delete from clientes where id='"+id+"'";
							int row=statementSQL.executeUpdate(sql);
							System.out.println("se han afectado a "+row+" filas");
						}
						
						break;
					case "4":
						System.out.println("Ingresa el id");
						id=scanner.nextLine();
						consultaSql="select nombre,edad from clientes where id='"+id+"'";
						ResultSet resultSet=statementSQL.executeQuery(consultaSql);
						while(resultSet.next()) {
							System.out.println("Nombre: "+resultSet.getString("nombre")+" Edad: "+resultSet.getString("edad"));
						}
						break;
					case "5":
						System.out.println("Has salido");
						break;
					default:
						System.out.println("Opción incorrecta");
				}
				
			}while(!opcion.equals("5"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}


	}
	
	public static boolean existeCliente(String id, Statement statement) {
		String consulta="select id from clientes where id='"+id+"'";
		try {
			ResultSet resultSet=statement.executeQuery(consulta);
			//entra en el if si la consulta devuelve al menos una fila
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//si no devuelve la consulta ni una fila retorna False
		return false;
	}

}
