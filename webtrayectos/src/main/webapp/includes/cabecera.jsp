<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="pojos.Trayecto"%>
<%@ page import="pojos.Listado"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Fiauuu</title>

<link
	href="css/bootstrap.min.css"
	rel="stylesheet"
	>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/2.1.8/css/dataTables.bootstrap5.css">
</head>
<body>
	<nav class="navbar navbar-expand bg-dark" data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="index">Fiauu</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-0 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="index">Principal</a></li>
				</ul>
				<ul class="navbar-nav mb-0 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="listado">Listado</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<%= "<main class='container my-4'>" %>