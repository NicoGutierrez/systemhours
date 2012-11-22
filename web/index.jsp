<%-- 
    Document   : index
    Created on : 14-nov-2012, 22:29:24
    Author     : sam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
        <script src="css/jquery.mobile-1.2.0.min.css"></script>
    <script src="js/jquery.mobile-1.2.0.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido al sistema</title>
    </head>
    <body>
        <!-- Home -->
    <div data-role="page" id="page1">
        <div data-role="content">
            <div data-role="content">
                <h1>Bienvenido al sistema de inscripcion de catedra</h1>
            </div>
            <div data-role="navbar" data-iconpos="top">
                <ul>
                    <li>
                        <a href="#page1" data-theme="" data-icon="" class="ui-btn-active ui-state-persist">
                            Ingreso alumnos
                        </a>
                    </li>
                    <li>
                        <a href="#page1" data-theme="" data-icon="">
                            Ingreso Monitores
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
        <div data-role="page" id="page1">
            
            <a href="AlumnosMain.jsp">Ingreso alumnos</a>
            <br></br>
            <a href="">Ingreso Monitores</a>
        </div>
    </body>
    
</html>
