package pojos;

import java.sql.*;
import java.util.ArrayList;

public class Listado {
	private static final String url = "jdbc:sqlite:C:\\Users\\HTML\\Eider\\java\\proyecto-trayectos\\webtrayectos\\bd\\trayectosbbd.db";
	private static final String user = "";
	private static final String pass = "";

	private ArrayList<Trayecto> trayectos = new ArrayList<Trayecto>();
	
	// "CONSTRUCTOR ESTÁTICO"
		static {
			try {
				Class.forName("org.sqlite.JDBC");
			} catch (ClassNotFoundException e) {
				System.out.println("NO SE HA ENCONTRADO EL DRIVER");
			}
		}

	// GETTERS Y SETTERS
		public ArrayList<Trayecto> getTrayectos() {
			String sql = "SELECT * FROM trayectos";
			
			try (Connection con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(sql)) {
				Trayecto trayecto = null;
				trayectos.clear();
				
				while (rs.next()) {
					trayecto = new Trayecto(rs.getLong("id"), rs.getString("salida"),rs.getString("llegada"),rs.getString("ruta"),rs.getString("direccion"));
					trayectos.add(trayecto);
				}
				return trayectos;
				
			} catch (SQLException e) {
				throw new RuntimeException("Ha fallado la consulta", e);
			}
			
		}

		public void setTrayectos(ArrayList<Trayecto> trayectos) {
			this.trayectos = trayectos;
		}
		
	
	
}
