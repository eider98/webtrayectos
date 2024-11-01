package pojos;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

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
					trayecto = new Trayecto(rs.getLong("id"), rs.getString("salida"),rs.getString("llegada"),rs.getString("ruta"),rs.getString("direccion"),rs.getString("duration"),rs.getString("observaciones"));
					trayectos.add(trayecto);

				}
				Collections.reverse(trayectos); //Darle la vuelta para que los más nuevos salgan primero por defecto
				return trayectos;
				
			} catch (SQLException e) {
				throw new RuntimeException("Ha fallado la consulta", e);
			}
			
		}

		public void setTrayectos(ArrayList<Trayecto> trayectos) {
			this.trayectos = trayectos;
		}
		
		//METODOS
		public Trayecto meterTrayecto(Trayecto trayecto) {
			String sql = "INSERT INTO trayectos (salida, llegada, ruta, direccion, duration, observaciones) VALUES (?, ?, ?,?,?,?)";
			
			try (Connection con = DriverManager.getConnection(url, user, pass); PreparedStatement pst = con.prepareStatement(sql)) {
				pst.setString(1,trayecto.getSalida().toString());
				pst.setString(2,trayecto.getLlegada().toString());
				pst.setString(3, trayecto.getRuta());
				pst.setString(4, trayecto.getDireccion());
				pst.setString(5, trayecto.getDuration());
				pst.setString(6, trayecto.getObservaciones());
				pst.executeUpdate();
				return trayecto;
			} catch (SQLException e) {
				throw new RuntimeException("Ha fallado la consulta", e);
			}
		}
		
		public void eliminarTrayecto(Long id) {
			String sql = String.format("DELETE FROM trayectos WHERE id='%s'", id);

			try (Connection con = DriverManager.getConnection(url, user, pass); Statement st = con.createStatement()) {
				st.executeUpdate(sql);
			} catch (SQLException e) {
				throw new RuntimeException("Ha fallado la consulta", e);
			}
		}
	
}
