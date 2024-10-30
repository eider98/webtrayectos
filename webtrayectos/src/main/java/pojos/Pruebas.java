package pojos;

import pojos.Trayecto;
import java.sql.*;
import java.util.ArrayList;

public class Pruebas {
	public static void main(String[] args) throws SQLException {
		Long id = 1L;
		Trayecto t1 = new Trayecto(id, "2009-12-08T10:19:10", "2009-12-08T10:19:17", "Erandiogoikoa");
		System.out.println(t1);
		
		Listado l1 = new Listado();
		l1.getTrayectos();
		System.out.println(l1.getTrayectos());
		
		String sql = "SELECT * FROM trayectos";
	    String url = "jdbc:sqlite:C:\\Users\\HTML\\Eider\\java\\proyecto-trayectos\\webtrayectos\\bd\\trayectosbbd.db";
		String user = "";
		String pass = "";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Trayecto trayecto = null;
		ArrayList<Trayecto> trayectos = new ArrayList<>();
		System.out.println(rs.next());
		while (rs.next()) {
			trayecto = new Trayecto(rs.getLong("id"), rs.getString("salida"),rs.getString("llegada"),rs.getString("ruta"));
			trayectos.add(trayecto);
			System.out.println(rs.getLong("id"));
			System.out.println(trayecto);
		}
		
		
	}
}