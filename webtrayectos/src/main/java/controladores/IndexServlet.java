package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import pojos.Trayecto;

import java.io.IOException;



@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sSalida = request.getParameter("salida");
		String sLlegada = request.getParameter("llegada");
		String direccion = request.getParameter("direccion");
		String ruta = request.getParameter("ruta");
		String observaciones = request.getParameter("observaciones");
		
		
		// 3. Empaquetar en modelo;
		Trayecto trayecto = new Trayecto(sSalida, sLlegada, ruta, direccion, observaciones);
		
		// 4. Logica (Añadir trayecto)
		globales.Global.listado.meterTrayecto(trayecto);
		
		// 6. Ir a la vista/controlador
		response.sendRedirect("listado");
	}

}
