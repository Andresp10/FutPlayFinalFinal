<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FutPlay - Campos Sobresalientes</title>
        <%@include file="../includes/importsCSS.jsp"%>
    </head>
    <body>
        <div class="wrapper">
            <%@include file="../includes/notificaciones.jsp" %>
            <%@include file="../includes/sidebarJugador.jsp" %>
            <div class="main-panel">
                <%@include file="../includes/header.jsp" %>
                <div class="content">
                    <div class="container-fluid">
                        
                        
                        
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../includes/importsJS.jsp" %>
        <script>
            $("#iniciojugador").addClass('active');
            CargarNotificaciones();
        </script>
    </body>
</html>
