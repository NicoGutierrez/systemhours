<%-- 
    Document   : web-alumnos
    Created on : 12-dic-2012, 18:19:27
    Author     : sam
--%>

<%@page import="cl.SistemaDeCatedra.perfiles.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumnos</title>
    </head>
    <body>
        <% Alumno alumno = (Alumno)session.getAttribute("alumno"); %>
    <div data-role="page" id="page1">
    <div data-theme="a" data-role="header">
        <a data-role="button" href="Logout" class="ui-btn-left">
            Salir
        </a>
        <h3>
            Bienvenido <% out.write(alumno.getNombre()); %>
        </h3>
    </div>
    <div data-role="content">
        <ul data-role="listview" data-divider-theme="b" data-inset="true">
            <li data-role="list-divider" role="heading">
                Menu
            </li>
            <li data-theme="c">
                <a href="#page1" data-transition="slide">
                    Ver mis catedras
                </a>
            </li>
            <li data-theme="c">
                <a href="#page1" data-transition="slide">
                    Tomar catedras
                </a>
            </li>
        </ul>
    </div>
    <div data-theme="a" data-role="footer" data-position="fixed">
        <h3>
        </h3>
    </div>
</div>
        </body>
</html>
