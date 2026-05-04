package ud11;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*use bd_clientes;
create table clientes(
	id varchar(10) primary key,
    nombre varchar(20),
	edad int
);*/
public class EjemploInsercionBD {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String opcion="",id="",nombre="",edad="",sql="";
		do {
			muestraMenu();
			opcion=scanner.nextLine();
			switch(opcion) {
			case "1":
				System.out.println("Introduce id, nombre y edad:");
				id=scanner.nextLine();
				if(!compruebaUsuario(id)) {
					nombre=scanner.nextLine();
					edad=scanner.nextLine();
					sql="insert into clientes values ('"+id+"','"+nombre+"',"+edad+")";
					System.out.println(sql);
					ejecutaInstruccionSQL(sql);
				}else {
					System.out.println("El usuario ya existe");
				}

				break;
			case "2":
				System.out.println("Introduce id:");
				id=scanner.nextLine();
				if(compruebaUsuario(id)) {
					System.out.println("Introduce nuevo nombre y edad:");
					nombre=scanner.nextLine();
					edad=scanner.nextLine();
					
					sql="update clientes set nombre='"+nombre+"',edad="+edad+" where id='"+id+"'";
					System.out.println(sql);
					ejecutaInstruccionSQL(sql);
				}else {
					System.out.println("El usuario no existe");
				}
				break;
				
			case "3":
				System.out.println("Introduce id:");
				
					id=scanner.nextLine();
				if(compruebaUsuario(id)) {
					sql="delete from clientes where id='"+id+"'";
					System.out.println(sql);
					ejecutaInstruccionSQL(sql);
				}else {
					System.out.println("El usuario no existe");
				}
				break;
			
			case "4":
				System.out.println("Introduce el id");
				id=scanner.nextLine();
				if(compruebaUsuario(id)) {
					sql="select * from clientes where id='"+id+"'";
					ejecutaQuery(sql);
				}else {
					System.out.println("El usuario no existe");
				}
				break;
			case "5":
				break;
			default:
				System.out.println("Opcion no válida");
				
			}
			
		}while(!opcion.equals("5"));
		
		System.out.println("Has salido.");
	}
	
	public static void muestraMenu() {
		System.out.println("1. Insertar");
		System.out.println("2. Actualizar por id");
		System.out.println("3. Borrar por id");
		System.out.println("4. Consulta Usuario");
		System.out.println("5. Salir");
	}
	
	public static void ejecutaInstruccionSQL(String sql) {
		String uri = "jdbc:mysql://localhost:3306/bd_clientes";
		String user = "admin";
		String passwd = "1234";
		try {
			// Paso 1: conexión a BD
			Connection connection = DriverManager.getConnection(uri, user, passwd);
			System.out.println("Conectado a la BD");
			// Paso 2:Creamos un objeto que representa una instrucción SQL-DDL
			Statement statementSQL = connection.createStatement();

			// ExecuteUpdate ejecuta instrucciones SQL:insert, update, delete
			int rows = statementSQL.executeUpdate(sql);
			connection.close();
			System.out.println("Se ha afectado a " + rows + " fila");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ejecutaQuery(String sql) {
		String uri = "jdbc:mysql://localhost:3306/bd_clientes";
		String user = "admin";
		String passwd = "1234";
		
		try {
			Connection connection=DriverManager.getConnection(uri,user,passwd);
			Statement statement=connection.createStatement();
			
			ResultSet resultSet=statement.executeQuery(sql);
			
			while(resultSet.next()) {
				System.out.println("ID:"+resultSet.getString("id")+" Nombre:"+resultSet.getString("nombre")+
						" Edad:"+resultSet.getString("edad"));
			}
			
			connection.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static boolean compruebaUsuario(String id) {
		
		String uri="jdbc:mysql://localhost:3306/bd_clientes";
		String user="admin";
		String psw="1234";
		
		try {
			Connection connection=DriverManager.getConnection(uri,user,psw);
			Statement statement=connection.createStatement();
			
			String sql="select id from clientes where id='"+id+"'";
			ResultSet resultSet=statement.executeQuery(sql);
			
			if(resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
