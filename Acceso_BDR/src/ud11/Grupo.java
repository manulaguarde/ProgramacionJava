package ud11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Grupo {
	
	private ArrayList<Alumno> alumnos;
		
		public Grupo() {
			alumnos=new ArrayList<Alumno>();
		}
		
		public void insertaAlumnoLista(String nombre, int edad, double calificacion) {
			
			alumnos.add(new Alumno(nombre,edad,calificacion));
		}
		
		public String imprime() {
			String listado="";
			
			for(Alumno alumno:alumnos) {
				listado+=alumno.imprime()+"\n\n";
			}
			
			return listado;
		}
		
		public void insertaAlumnoEnBD() {

			String sql="";
				for(Alumno alumno:alumnos) {
					sql+="insert into alumnos values ('"+alumno.getNombre()+"',"+alumno.getEdad()+","+alumno.getCalificacion()+",";
				}
				
				try {
					int row=conectaConBDR().executeUpdate(sql);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			
		}
		
		public void consultaBD() {
			String sql="select * from alumnos";
			
			try {
				ResultSet resultSet=conectaConBDR().executeQuery(sql);
				while(resultSet.next()) {
					System.out.println("ID:"+resultSet.getString("id")+" Alumno:"+resultSet.getString("nombre")
					+" Edad:"+resultSet.getString("edad")+" Calificación:"+resultSet.getString("calificacion"));
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		private Statement conectaConBDR() {
			String uri="jdbc:mysql://localhost:3306/grupo_alumno";
			String usuario="admin";
			String pwd="1234";
			Statement statement=null;
			Connection connection;
			try {
				connection = DriverManager.getConnection(uri,usuario,pwd);
				statement=connection.createStatement();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			return statement;
			
		}

}
