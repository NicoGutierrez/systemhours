<%-- 
    Document   : loginMonitores
    Created on : 05-12-2012, 10:16:18 PM
    Author     : Nico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="css/jquery.mobile-1.2.0.min.css" />
        <script src="js/jquery-1.8.3.min.js"></script>
        <script src="js/jquery.mobile-1.2.0.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido al sistema</title>
    </head>
    <body><div data-role="page" data-theme="h" id="page1">
            <div data-theme="b" data-role="header">
                <h3>
                    Login Monitores
                </h3>
                <a data-role="button" data-rel="back" href="#page1" data-icon="back" data-iconpos="left" class="ui-btn-left">
                    Volver
                </a>
            </div>
            <div data-role="content" style="padding: 10%">
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="textinput1">
                            Usuario
                        </label>
                        <input name="" id="textinput1" placeholder="" value="" type="password" />
                    </fieldset>
                </div>
                <div data-role="fieldcontain">
                    <fieldset data-role="controlgroup" data-mini="true">
                        <label for="textinput2">
                            Contraseña
                        </label>
                        <input name="" id="textinput2" placeholder="" value="" type="password" />
                    </fieldset>
                </div>
                <a data-role="button" data-inline="true" data-theme="b" href="#page1">
                    Ingresar
                </a>
            </div>
        </div>
        
        
        
    
    
    
    
    </body>
</head>
</html>
