<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/cabecera.jsp"%>

<% Listado listado = (Listado) request.getAttribute("listado");%>

<h1 class="pb-1">Listado</h1>

<table class="table table-bordered table-striped table-hover">
	<caption>Trayectos</caption>

	<thead class="table-dark">
		<tr>
			<th class="text-end">Fecha</th>
			<th>Dirección</th>
			<th>Ruta</th>
			<th>Salida</th>
			<th>Llegada</th>
			<th>Duración</th>
			<th>Observaciones</th>
			<th>Opciones</th>
		</tr>
	</thead>
	<tbody>
		<%
		for (Trayecto t : listado.getTrayectos()) {
		%>
		<tr>
			<th class="text-end"><%=t.getFecha()%></th>
			<td><%=t.getDireccion()%></td>
			<td><%=t.getRuta()%></td>
			<td><%=t.getSalida().toLocalTime()%></td>
			<td><%=t.getLlegada().toLocalTime()%></td>
			<td><%=t.getDurationFormated()%></td>
			<td><%=t.getObservaciones()%></td>
			<td>
				<a
				onclick="return confirm('¿Está seguro de que quiere borrar el trayecto del <%=t.getFecha()%>?')"
				class="btn btn-danger" href="borrar?id=<%=t.getId()%>">Borrar</a>
			</td>
		</tr>
		<%
		}
		%>
	</tbody>
	<tfoot class="table-dark">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><a class="btn btn-primary" href="index">Añadir</a></td>
		</tr>
	</tfoot>
</table>



<%@ include file="includes/pie.jsp"%>