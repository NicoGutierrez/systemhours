<%-- 
    Document   : loginAlumnos
    Created on : 05-12-2012, 10:12:31 PM
    Author     : Nico
--%>

<%@page import="cl.SistemaDeCatedra.perfiles.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="css/jquery.mobile-1.2.0.min.css" />
        <script src="js/jquery-1.8.3.min.js"></script>
        <script src="js/jquery.mobile-1.2.0.min.js"></script>
        <script language="javascript" type="text/javascript" src="js/validaciones.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido al sistema</title>
    </head>
    <body>
        <div data-role="page" data-theme="h" id="page1">
            <div data-theme="b" data-role="header">
                <h3>
                    Login Alumnos
                </h3>
                
                        
                <a data-role="button" data-rel="back" href="#page1" data-icon="back" data-iconpos="left" class="ui-btn-left">
                    Volver
                </a>
            </div>
            <div data-role="content" style="padding: 10%">
             <form id="form" name="form" action="/SistemaDeCatedra/Login" method="post">
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="usuario">
                            Usuario
                        </label>
                        <input name="usuario" id="usuario" placeholder="" value="" type="text" />
                    </fieldset>
                </div>
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                       <label for="contrasena">
                            Contraseña
                        </label>
                        <input name="contrasena" id="contrasena" placeholder="" value="" type="password" />
                        <br />
                        <br />
                        <br />
                        <input type="submit" value="Ingresar" data-mini="true" data-theme="b">
                    </fieldset>
                </div>
                
                 <input type="hidden" name="tipo" value="alumno" />
              </form>
            </div>
        </div> 
    </body>
</head>
</html>
