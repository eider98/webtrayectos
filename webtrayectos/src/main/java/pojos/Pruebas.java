package pojos;

import java.sql.*;

public class Pruebas {
	public static void main(String[] args) throws SQLException {
		Long id = 1L;
		Trayecto t1 = new Trayecto(id, "2009-12-08T10:19:10", "2009-12-08T10:19:17", "Erandiogoikoa","ida");
		System.out.println(t1);
		
		Listado l1 = new Listado();
		System.out.println(l1.getTrayectos());
		
		
		
		
	}
}