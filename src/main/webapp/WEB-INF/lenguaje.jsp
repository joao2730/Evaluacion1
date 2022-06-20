<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 20-06-2022
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Lenguajes</title>
</head>
<body>
<div>
    <%--@elvariable id="lenguaje" type="lenguaje"--%>
    <form:form action="/lenguaje/guardar" method="post" modelAttribute="lenguaje">
        <form:label path="idioma">Idioma</form:label>
        <form:input path="idioma"/>
        <br>
        <form:label path="paisLengua">Pais idioma</form:label>
        <form:input path="paisLengua"/>
        <br>
        <form:label path="ejemplo">Ejemplo</form:label>
        <form:input path="ejemplo"/>
        <br>
        <button type="submit" class="btn btn-outline-primary">Guardar Lengua</button>
    </form:form>
</div>

</body>
</html>
