<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Login - Cute Shoes</title>

<link rel="stylesheet" href="css/estilos.css">

</head>

<body>

<h1>CUTE SHOES</h1>

<form action="LoginServlet" method="post">

<label>Correo</label>

<br>

<input
type="email"
name="correo"
placeholder="Ingrese correo">

<br><br>

<label>Contraseña</label>

<br>

<input
type="password"
name="clave"
placeholder="Ingrese contraseña">

<br><br>

<button type="submit">

Ingresar

</button>

</form>

</body>

</html>