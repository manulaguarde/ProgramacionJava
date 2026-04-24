package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploInsercionBBDD {

	public static void main(String[] args) {
		String uri="jdbc:mysql://localhost:3306/bd_clientes";
		String user="admin";
		String passwd="1234";
		// Paso 1: conexión a Base de Datos
		
		try {
			Connection connection=DriverManager.getConnection(uri,user,passwd);
			System.out.println("Conectado a la BD");
			
			//Paso 2:Creamos un objeto que representa una instrucción SQL - DDL
			Statement statementSQL =connection.createStatement(); //un statement es una instrucción en inglés
			
			//Paso 3: Ejecutar la instrucción o sentencia SQL
			String sql="insert into clientes values ('124a','Maria',35)";
			
			//ExecuteUpdate ejecuta instrucciones SQL: insert, update, delete
			int row=statementSQL.executeUpdate(sql);
			System.out.println("se han afectado a "+row+" filas");
			
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
