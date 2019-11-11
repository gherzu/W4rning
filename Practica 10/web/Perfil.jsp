<%-- 
    Document   : Perfil
    Created on : Nov 7, 2018, 3:55:15 PM
    Author     : hp1tb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Perfil</title>
        <style> 
        body {
            background-color: black;
            left: 550px;
	    top: 25px;
            color: blue;
            position:relative;
            width:800px;
            height:540px;

            font-size: 30px;
            left: 400px;
            top: 80px;  
            font-family: "Times New Roman";
            text-align: center;
        }
        </style>
        <title>Mi Perfil</title>
    </head>
    <body>
        <form action="Controlador" id="form" method="post" > 
            <fieldset>
                Que desea hacer?<br>
                <input size="50" type="text" name="name">
                <br>
                <input size="50" type="hidden" name="varcontrol" value="2">
                <br>
                <br>
                <input type="submit" value="Registrar" > 
            </fieldset>
        </form>
    </body>
</html>
