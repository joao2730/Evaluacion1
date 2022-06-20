<%--
  Created by IntelliJ IDEA.
  User: Joao Aranda
  Date: 20-06-2022
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
  <title>Mostrar Lenguaje</title>
  <link
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
</head>
<body>
<div class="container">

  <table class="table">
    <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Idioma</th>
      <th scope="col">Pais Lengua</th>
      <th scope="col">Ejemplo</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="lenguaje" items="${lenguajesCapturados}">
      <tr>
        <th scope="row">${lenguaje.id}</th>
        <td>${lenguaje.idioma}</td>
        <td>${lenguaje.paisLengua}</td>
        <td>${lenguaje.ejemplo}</td>
        <td><a class="btn btn-warning" href="/lenguaje/editar/${lenguaje.id}" role="button">Editar</a></td>
        <td><a class="btn btn-danger" href="eliminar/${lenguaje.id}" role="button">Eliminar</a></td>
      </tr>
    </c:forEach>

    </tbody>
  </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous">
</script>
</body>
</html>

