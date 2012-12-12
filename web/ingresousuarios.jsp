<%-- 
    Document   : ingresousuarios
    Created on : 11-12-2012, 11:27:13 PM
    Author     : Nico
--%>

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
    <body><div data-role="page" data-theme="h" id="page1">
            <div data-theme="b" data-role="header">
                <h3>
                    Ingreso de Alumnos
                </h3>
                <a data-role="button" data-rel="back" href="index.jsp" data-icon="back" data-iconpos="left" class="ui-btn-left">
                    Volver
                </a>
            </div>
            <div data-role="content" style="padding: 10%">
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="nombre">
                            Nombre
                        </label>
                        <input name="nombre" id="nombre" placeholder="" value="" type="text" />
                    </fieldset>
                </div>
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="apellido">
                            Apellido
                        </label>
                        <input name="apellido" id="apellido" placeholder="" value="" type="text" />
                    </fieldset>
                </div>
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="rut">
                            Rut
                        </label>
                        <input name="rut" id="rut" placeholder="" value="" type="text" />
                    </fieldset>
                </div>
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="telefono">
                            Telefono
                        </label>
                        <input name="telefono" id="telefono" placeholder="" value="" type="text" />
                    </fieldset>
                </div>
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="contrasena">
                            Password
                        </label>
                        <input name="contrasena" id="contrasena" placeholder="" value="" type="text" />
                    </fieldset>
                </div>
                <a data-role="button" onclick="return validarform();"   data-inline="true" data-theme="b" href="#page1">
                         Crear Alumno
                </a>
            </div>
        </div>
        
        
        
    
    
    
    
    </body>
</head>
</html>

