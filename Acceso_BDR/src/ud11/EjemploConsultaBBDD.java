package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploConsultaBBDD {

	public static void main(String[] args) {
		String uri="jdbc:mysql://localhost:3306/bd_clientes";
		String user="admin";
		String passwd="1234";
		//Paso 1: conectarse a la BBDD
		try {
			Connection connection=DriverManager.getConnection(uri,user,passwd);
			
			//Paso 2: crear objeto que representa una sentencia SQL
			Statement statement=connection.createStatement();
			
			//Paso 3: ejecutar sentencia SQL
			String sqlConsulta="select id,nombre,edad from clientes";
			//la consulta devuelve un resultado tipo ResulSet
			ResultSet resulSet=statement.executeQuery(sqlConsulta);
			//Paso 4: recorrer y procesar el resulset que devuelve la consulta
			while(resulSet.next()) {
				System.out.println("id:"+resulSet.getString("id")+"nombre:"+resulSet.getString("nombre"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
