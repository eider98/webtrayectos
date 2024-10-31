package pojos;

import java.sql.*;

public class Pruebas {
	public static void main(String[] args) throws SQLException {
		Long id = 1L;
		Trayecto t1 = new Trayecto(id, "2009-12-08T10:19:10", "2009-12-08T10:49:17", "Erandiogoikoa","ida",null);
		System.out.println(t1.getDuration());
		
		Listado l1 = new Listado();
		Trayecto t2 = l1.getTrayectos().get(0);
		System.out.println(l1.getTrayectos());
		System.out.println(t2.getDuration());
		System.out.println(t2.getDurationFormated());
		
		l1.meterTrayecto(t1);
		System.out.println(l1.getTrayectos().get(4));
		
		l1.eliminarTrayecto(7L);
		System.out.println(l1.getTrayectos());
		
		Trayecto t3= new Trayecto("2009-12-08T10:19:10","2009-12-08T10:19:10","Erandiogoikoa","ida");
		System.out.println(t3);
	}
}