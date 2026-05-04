package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Acceso_BD_Persona_consultar {

	public static void main(String[] args) {
		// protocolo://ip:puerto_tcp/nombre_BD
		String uri="jdbc:mysql://localhost:3306/prog_ejemplo";
		String user="root";
		String passwd="Root123*";
		
		
		try {
			// Paso 1: Crear conexión entre esta app y Mysql (IGUAL)
			Connection miConexion=DriverManager
					.getConnection(uri, user, passwd);
			//Paso 2: Crear una sentencia SQL (IGUAL)
			Statement sentenciaSQL=miConexion.createStatement();
			//Paso 3: ejecutamos la consulta (CAMBIA)
			String sql="select * from persona";
			ResultSet resultSet=sentenciaSQL.executeQuery(sql);
			//Paso 4: recorremos el resultSet
			while (resultSet.next()) {
				String dni="",nombre="";
				int edad=0;
				dni=resultSet.getString("dni");
				nombre=resultSet.getString("nombre");
				edad=resultSet.getInt("edad");
				System.out.println("dni:"+dni+" nombre:"+
						nombre+ " edad:"+edad);
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
