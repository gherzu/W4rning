<%-- 
    Document   : buscar
    Author     : Gerardo
--%>

<%@page import="modelo.ComentariosPOJO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ComentariosControlador" method="post">
            <label for="nombre">Nombre: </label>
            <input type="text" id="nombre" name="nombre"><br>
            <label for="comentario">Comentarios:</label>
            <textarea name="comentario" id="comentario" maxlenght="200" cols="40" type="text"></textarea><br>
            <input type="submit" value="Enviar"/>
            <input type="hidden" name="accion" value="buscar">
        </form><br>
        <%
            if(session != null){
            List comentarios = (List)session.getAttribute("comentarios");
            if(comentarios != null){
        %>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Comentario</th>
            </tr>
            <%
                for(Object o : comentarios){
                    ComentariosPOJO comentario = (ComentariosPOJO) o;
            %>
            <tr>
                <td><%=comentario.getNombre()%></td>
                <td><%=comentario.getComentario()%></td>
            </tr>
            <% } %>
        </table>
        <%
            }
        }        
        %>

        <br>
        <a href="index.html">Comentar</a>  
    </body>
</html>
