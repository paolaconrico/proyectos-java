
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%--Scriptlet para enviar informacon al navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        <%--Scriptlet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%
            if (session != null && session.isNew()) {
        %>
        la sesion es nueva
        <%
            } else if (session != null) {

        %>
        la sesion No es nueva
        <% } %>
    <br>
    <a href="index.html"> Regresar al inicio</a>

    </body>
</html>
