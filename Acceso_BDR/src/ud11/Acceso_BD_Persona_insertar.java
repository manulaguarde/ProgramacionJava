package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Acceso_BD_Persona_insertar {

	public static void main(String[] args) {
		// protocolo://ip:puerto_tcp/nombre_BD
		String uri="jdbc:mysql://localhost:3306/prog_ejemplo";
		String user="root";
		String passwd="Root123*";
		// Paso 1: Crear conexión entre esta app y Mysql
		try {
			// Paso 1: Crear conexión entre esta app y Mysql
			Connection miConexion=DriverManager
					.getConnection(uri, user, passwd);
			//Paso 2: Crear una sentencia SQL
			Statement sentenciaSQL=miConexion.createStatement();
			//Paso 3: ejecutar sentenciaSQL
			String sql="insert into persona (dni,nombre,edad) values"
					+ "	('123ab','Ana Gil',25);";
			sentenciaSQL.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
