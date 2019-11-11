<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 6: Login</title>
        <style> 
        body {
            background-color: black;
            left: 550px;
	    top: 25px;
            color: red;
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
    </head>
    <body>
        <script>
            var img = document.createElement("img");
        </script>    
        <form action="Controlador" id="form" method="post" > 
            <fieldset>
                <legend>Login</legend>
                Correo:<br>
                <input size="50" type="text" name="correo">
                <br>
                Contraseña:<br>
                <input size="50" type="password" name="contra">
                <br>
                <br>
                <input type="submit" value="Entrar" > 
            </fieldset>
        </form>
    </body>
</html>