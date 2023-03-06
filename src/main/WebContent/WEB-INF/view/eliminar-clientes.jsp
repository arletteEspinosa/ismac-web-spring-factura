<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Clientes</title>
</head>
<body>

	<h1>CLIENTES</h1>

	<form:form action="del" modelAttribute="cliente" method ="GET">
		
		<form:hidden path="idCliente" id="idCliente" name="idCliente"/>
		<strong>¿Desea eliminar el registro?</strong>
		<hr/>	
		<button type="submit" id="btnEliminar"> Eliminar </button>
		<button type="button" id="btnCancelar" onClick="window.location.href='/ismac-spring-factura-web/clientes' ;return false; "> Cancelar </button>
	</form:form>
	


</body>
</html>