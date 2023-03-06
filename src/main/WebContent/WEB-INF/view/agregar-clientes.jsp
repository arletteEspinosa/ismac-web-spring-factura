<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar clientes</title>
</head>
<body>

	<h1>CLIENTES</h1>

	<form:form action="add" modelAttribute="cliente" method="POST">
	
		<form:hidden path="idCliente"/>
		
		Cedula
		<form:input path="cedula" type="number" id="cedula" name="cedula" maxLength="10"/>
		<br/><br/>
		Nombre
		<form:input path="nombre" type="text" id="nombre" name="nombre" maxLength="15"/>
		<br/><br/>
		Apellido
		<form:input path="apellido" type="text" id="apellido" name="apellido" maxLength="15"/>
		<br/><br/>
		Fecha de Nacimiento
		<form:input path="fechaNacimiento" type="date" id="fechaNacimiento" name="fechaNacimiento"/>
		<br/><br/>
		Edad
		<form:input path="edad" type="number" id="edad" name="edad" maxLength="15"/>
		<br/><br/>
		Direccion
		<form:input path="direccion" type="text" id="direccion" name="direccion" maxLength="40"/>
		<br/><br/>
		Telefono
		<form:input path="telefono" type="number" id="telefono" name="telefono" maxLength="10"/>
		<br/><br/>
		Correo
		<form:input path="correo" type="email" id="correo" name="correo" maxLength="40"/>
		<br/><br/>
		
		<button type="submit" id="btnGuardar"> Guardar </button>
		<button type="button" id="btnCancelar" onClick="window.location.href='/ismac-spring-factura-web/clientes' ;return false; "> Cancelar </button>
		
	</form:form>


</body>
</html>