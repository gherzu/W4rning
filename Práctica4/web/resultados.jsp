<%-- 
    Document   : resultados
    Author     : Gerardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1>Resultados</h1>
        <%
            String nombre = request.getParameter("txt-name");
            String nombre2 = request.getParameter("first-lastname");
            String nombre3 = request.getParameter("second-lastname");
            String conca = nombre+ " " +nombre2+ " " +nombre3;
            
            
            
            %>
            
            <h2><%= conca %></h2>
    </body>
</html>
