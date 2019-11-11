<%-- 
    Document   : Form
    Created on : Oct 10, 2018, 4:17:04 PM
    Author     : hp1tb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
        body {
        background-color: red;
        }
        
        form {
            left: 550px;
	    top: 25px;
            text-color: blue;
            position:relative;
            width:800px;
            height:540px;
            background-color: green;
            font-size: 30px;
            left: 400px;
            top: 80px;
            font-family: "Times New Roman";
            text-align: center;
        }
        </style>
        <title>Practica 5: Solicitud</title>
    </head>
    <body>
        <div id="form">
            <form action="Controlador" id="form" method="post" > 
            <fieldset>
                <legend>Informacion Personal:</legend>
                Nombre:<br>
                <input size="50" type="text" name="name">
                <br>
                Primer Apellido:<br>
                <input size="50" type="text" name="lastname1">
                <br>
                Segundo Apellido:<br>
                <input size="50" type="text" name="lastname2">
                <br>
                Fecha de Nacimiento:<br>
                <input size="50" type="date" name="brtdy">
                <br>
                Correo:<br>
                <input size="50" type="email" name="mail">
                <br>
                Contraseña:<br>
                <input size="50" type="password" name="pass">
                <input size="50" type="hidden" name="varcontrol" value="1">
                <br>
                <br>
                <input type="submit" value="Registrar" > 
            </fieldset>
        </form>
      </div>
        
    </body>
</html>

