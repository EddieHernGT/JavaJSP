<%--
  Created by IntelliJ IDEA.
  User: edgar
  Date: 11/19/2022
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  import="java.util.Date" %>
<%@ include file="util.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Mi primera pagina JSP</title>
</head>
<body>
  <h1>Vista main de la aplicacion</h1>
  <h3>Hoy es:<%= new Date() %></h3>
  <c:set var="numero" scope="session" value="${-100}"/>
  <p>El numero es: <c:out value="${numero}"/></p>
  <c:if test="${numero>0}">
      <p>El parrafo es mayor que 0</p>
  </c:if>
  <c:if test="${numero<0}">
      <p>El parrafo es menor que 0</p>
  </c:if>
    <p>El parametro de sesion es: ${parametroSesion2}</p>
    <p>El parametro de respuesta es: ${nuevoParametroRespuesta}</p>
</body>
</html>
