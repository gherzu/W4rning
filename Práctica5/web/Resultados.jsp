<%-- 
    Document   : resultados
    Author     : Bárbara Viridiana Lara Espinosa
--%>
<%@page import="Modelo.Persona"%>
<%
    Persona p = (Persona)request.getSession().getAttribute("persona1");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1>Resultados</h1><br>
        <h3><%=p.getNombre()%> <%=p.getPrimerApellido()%> <%=p.getSegundoApellido()%></h3>
        <br><br>
        
        <footer>Autor: Alan Francisco Contreras Garza</footer>
    </body>
</html>
