package pruebas;

import java.sql.*;

public class Pruebas {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlite:bd/trayectosbbd.db";
		String user = "";
		String pass = "";

		String sql = "SELECT * FROM trayectos";
		String sqlInsert = "INSERT INTO trayectos (salida, llegada, ruta) VALUES ('10:36', '11:45','erandio')";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sqlInsert);

		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			System.out.printf("%3s %-30s %-30s %30S\n", rs.getInt("id"), rs.getString("salida"), rs.getString("llegada"),rs.getString("ruta"));
		}
	}
}