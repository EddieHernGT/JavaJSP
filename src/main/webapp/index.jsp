<html>
<body>
<h2>Hello World!</h2>
<%! int numero=5; String nombre="JPS";%>
<form method="POST" action="servlet2">
    <input name="saludo" type="text" value="Saludo desde index">
    <input type="submit" value="Enviar">
    <p>El valor del numero es<%=numero%></p>
</form>
</body>
</html>
