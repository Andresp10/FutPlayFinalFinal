package org.apache.jsp.material_002ddashboard.pages.jugador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Persona;
import Modelo.Jugador;

public final class editarPerfilJugador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/material-dashboard/pages/jugador/../includes/importsCSS.jsp");
    _jspx_dependants.add("/material-dashboard/pages/jugador/../includes/notificaciones.jsp");
    _jspx_dependants.add("/material-dashboard/pages/jugador/../includes/sidebarJugador.jsp");
    _jspx_dependants.add("/material-dashboard/pages/jugador/../includes/header.jsp");
    _jspx_dependants.add("/material-dashboard/pages/jugador/../includes/importsJS.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>FutPlay - Editar perfil</title>\r\n");
      out.write("        ");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../../assets/img/apple-icon.png\" />\n");
      out.write("    <link rel=\"icon\" type=\"shortcut-icon\" href=\"../../assets/img/favicon.png\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("    <!-- Canonical SEO -->\n");
      out.write("    <link rel=\"canonical\" href=\"https://www.creative-tim.com/product/material-dashboard-pro\" />\n");
      out.write("    <!--  Social tags      -->\n");
      out.write("    <meta name=\"keywords\" content=\"material dashboard, bootstrap material admin, bootstrap material dashboard, material design admin, material design, creative tim, html dashboard, html css dashboard, web dashboard, freebie, free bootstrap dashboard, css3 dashboard, bootstrap admin, bootstrap dashboard, frontend, responsive bootstrap dashboard, premiu material design admin\">\n");
      out.write("    <meta name=\"description\" content=\"Material Dashboard PRO is a Premium Material Bootstrap Admin with a fresh, new design inspired by Google's Material Design.\">\n");
      out.write("    <!-- Schema.org markup for Google+ -->\n");
      out.write("    <meta itemprop=\"name\" content=\"Material Dashboard PRO by Creative Tim | Premium Bootstrap Admin Template\">\n");
      out.write("    <meta itemprop=\"description\" content=\"Material Dashboard PRO is a Premium Material Bootstrap Admin with a fresh, new design inspired by Google's Material Design.\">\n");
      out.write("    <meta itemprop=\"image\" content=\"http://s3.amazonaws.com/creativetim_bucket/products/51/opt_mdp_thumbnail.jpg\">\n");
      out.write("    <!-- Twitter Card data -->\n");
      out.write("    <meta name=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("    <meta name=\"twitter:site\" content=\"@creativetim\">\n");
      out.write("    <meta name=\"twitter:title\" content=\"Material Dashboard PRO by Creative Tim | Premium Bootstrap Admin Template\">\n");
      out.write("    <meta name=\"twitter:description\" content=\"Material Dashboard PRO is a Premium Material Bootstrap Admin with a fresh, new design inspired by Google's Material Design.\">\n");
      out.write("    <meta name=\"twitter:creator\" content=\"@creativetim\">\n");
      out.write("    <meta name=\"twitter:image\" content=\"http://s3.amazonaws.com/creativetim_bucket/products/51/opt_mdp_thumbnail.jpg\">\n");
      out.write("    <!-- Open Graph data -->\n");
      out.write("    <meta property=\"fb:app_id\" content=\"655968634437471\">\n");
      out.write("    <meta property=\"og:title\" content=\"Material Dashboard PRO by Creative Tim | Premium Bootstrap Admin Template\" />\n");
      out.write("    <meta property=\"og:type\" content=\"article\" />\n");
      out.write("    <meta property=\"og:url\" content=\"http://www.creative-tim.com/product/material-dashboard-pro\" />\n");
      out.write("    <meta property=\"og:image\" content=\"http://s3.amazonaws.com/creativetim_bucket/products/51/opt_mdp_thumbnail.jpg\" />\n");
      out.write("    <meta property=\"og:description\" content=\"Material Dashboard PRO is a Premium Material Bootstrap Admin with a fresh, new design inspired by Google's Material Design.\" />\n");
      out.write("    <meta property=\"og:site_name\" content=\"Creative Tim\" />\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"../../assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--  Material Dashboard CSS    -->\n");
      out.write("    <link href=\"../../assets/css/material-dashboard.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"../../assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons\" />");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            ");
      out.write("<!-- Notifications area -->\n");
      out.write("<section class=\"NotificationAreaP\">\n");
      out.write("    <div class=\"text-center NotificationArea-titleP\">\n");
      out.write("        <h5 class=\"title\">Notificaciones</h5>\n");
      out.write("        <i class=\"material-icons btn-Notification\">clear</i>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"notificacionesContenedor\" style=\"overflow-y: auto; overflow-x: hidden;height: 600px;\">\n");
      out.write("        <!-- NOTIFICACION OKKKKK!!!! -->\n");
      out.write("        <!--<a href=\"#\" class=\"NotificationP\">\n");
      out.write("            <div class=\"Notification-iconP\">\n");
      out.write("                <i class=\"material-icons\" style=\"background-color: #05ae0e; font-size: 25px;\">people</i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Notification-textP\" style=\"margin-left: 90px;\">\n");
      out.write("                <p style=\"padding-top: 15px;\">\n");
      out.write("                    <strong class=\"description\">PEPEPEPEPE ha cambiado la informacion del equipo.</strong><br>\n");
      out.write("                    <small>Justo ahora</small>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </a>-->\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
  
    Jugador objJugador = (Jugador) request.getSession().getAttribute("JugadorIngresado");
    Persona objPersona = (Persona) request.getSession().getAttribute("UsuarioIngresado");
    
    response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
    response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
    response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
    response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
    try{      
        if(session.getAttribute("JugadorIngresado").equals(null)){
            response.sendRedirect("/FutPlayFinal/index.html");
        }else{
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            ");

                System.out.println("EEEEEEEEESTA CONTINUANDO 000000000000000000000000000000000");
                
            
      out.write("\r\n");
      out.write("            <div class=\"sidebar\" data-active-color=\"red\" data-background-color=\"black\" data-image=\"../../assets/img/sidebar-1.jpg\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"/FutPlayFinal/material-dashboard/pages/jugador/indexJugador.jsp\" class=\"simple-text\">\r\n");
      out.write("                        FutPlay\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"logo logo-mini\">\r\n");
      out.write("                    <a href=\"/FutPlayFinal/material-dashboard/pages/jugador/indexJugador.jsp\" class=\"simple-text\">\r\n");
      out.write("                        <img src=\"../../assets/img/favicon.png\" style=\"width:35px;height: 35px;\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"sidebar-wrapper\">\r\n");
      out.write("                    <div class=\"user\">\r\n");
      out.write("                        <div class=\"photo\">\r\n");
      out.write("                            <img src=\"/FutPlayFinal/material-dashboard/assets/img/avatares/");
      out.print(objPersona.getAvatar());
      out.write("\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapseExample\" class=\"collapsed\">\r\n");
      out.write("                                ");
      out.print( objJugador.getAlias());
      out.write("\r\n");
      out.write("                                <b class=\"caret\"></b>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapseExample\">\r\n");
      out.write("                                <ul class=\"nav\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"../jugador/verPerfilJugador.jsp\">Ver perfil</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"../jugador/editarPerfilJugador.jsp\">Editar perfil</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">Ajustes</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nav\">\r\n");
      out.write("                        <li id=\"iniciojugador\">\r\n");
      out.write("                            <a href=\"../jugador/indexJugador.jsp\">\r\n");
      out.write("                                <i class=\"material-icons\">dashboard</i>\r\n");
      out.write("                                <p>Inicio</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li id=\"equipo\">\r\n");
      out.write("                            <a href=\"../equipo/verEquipo.jsp\">\r\n");
      out.write("                                <i class=\"material-icons\">people</i>\r\n");
      out.write("                                <p>Mi equipo</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li id=\"jugadores\">\r\n");
      out.write("                            <a href=\"../jugador/verJugadores.jsp\">\r\n");
      out.write("                                <i class=\"material-icons\">person</i>\r\n");
      out.write("                                <p>Jugadores</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li id=\"charla\">\r\n");
      out.write("                            <a href=\"../mensaje/charlaSockets.jsp\">\r\n");
      out.write("                                <i class=\"material-icons\">message</i>\r\n");
      out.write("                                <p>Charla tecnica</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li id=\"encuentro\">\r\n");
      out.write("                            <a href=\"../encuentro/verEncuentros.jsp\">\r\n");
      out.write("                                <i class=\"material-icons\">flash_on</i>\r\n");
      out.write("                                <p>Encuentros</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        ");
}     
    }  
    catch(Exception ex){
        response.sendRedirect("/FutPlayFinal/index.html");
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
if(objJugador != null & objPersona != null){
      out.write("\r\n");
      out.write("            <div class=\"main-panel\">\r\n");
      out.write("                ");
      out.write("<nav class=\"navbar navbar-transparent navbar-absolute\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-minimize\">\r\n");
      out.write("            <button id=\"minimizeSidebar\" class=\"btn btn-round btn-white btn-fill btn-just-icon\">\r\n");
      out.write("                <i class=\"material-icons visible-on-sidebar-regular\">more_vert</i>\r\n");
      out.write("                <i class=\"material-icons visible-on-sidebar-mini\">view_list</i>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\">\r\n");
      out.write("                <span class=\"sr-only\">Menu</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" id=\"nombrepagina\"> Inicio </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><!-- AGREGAR A LAS NOTIFICACIONES ETIQUETE A.class: verNotificaciones,actualizarNotificaciones-->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle btn-Notification verNotificaciones actualizarNotificaciones\" data-toggle=\"dropdown\" rel=\"tooltip\" data-placement=\"bottom\" data-original-title=\"Notificaciones\">\r\n");
      out.write("                        <i class=\"material-icons\">notifications</i>\r\n");
      out.write("                        <div id=\"numeroNotificacionesContainer\"></div>\r\n");
      out.write("                        <p class=\"hidden-lg hidden-md\">\r\n");
      out.write("                            Notificaciones\r\n");
      out.write("                            <!--<b class=\"caret\"></b>-->\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#pablo\" class=\"dropdown-toggle btn-ExitSystem\" data-toggle=\"dropdown\" rel=\"tooltip\" data-placement=\"bottom\" title=\"\" data-original-title=\"Cerrar Sesión\">\r\n");
      out.write("                        <i class=\"material-icons\" style=\"font-size: 25px;\">power_settings_new</i>\r\n");
      out.write("                        <p class=\"hidden-lg hidden-md\">Cerrar Sesión</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"separator hidden-lg hidden-md\"></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-header card-header-icon\" data-background-color=\"rose\">\r\n");
      out.write("                                    <i class=\"material-icons\">perm_identity</i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-content\">\r\n");
      out.write("                                    <h4 class=\"card-title\">Editar perfil -\r\n");
      out.write("                                        <small class=\"category\">Complete su perfil</small>\r\n");
      out.write("                                    </h4>\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                        <div class=\"col-sm-4 col-sm-offset-1\">\r\n");
      out.write("                                            <div class=\"picture-container\">\r\n");
      out.write("                                                <div class=\"picture\">\r\n");
      out.write("                                                    <img src=\"../../assets/img/avatares/av.jpg\" class=\"picture-src\" id=\"wizardPicturePreview\" title=\"\">\r\n");
      out.write("                                                    <input type=\"file\" id=\"avatarJugador\">\r\n");
      out.write("                                                    <input type=\"text\" hidden id=\"avatarJugadorNombre\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h6>Selecciona tu avatar</h6>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-lg-6\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"control-label active\">Alias</label>\r\n");
      out.write("                                                        <input type=\"text\" value=\"");
      out.print(objJugador.getAlias());
      out.write("\" class=\"form-control\" id=\"txtAliasEditarJugador\">\r\n");
      out.write("                                                    <span class=\"material-input\"></span></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"control-label\">Posicion</label>\r\n");
      out.write("                                                        <select class=\"form-control\" id=\"cmbPosicionEditarJugador\">\r\n");
      out.write("                                                            ");
if (objJugador.getPosicion().equals("Portero")) {
      out.write("\r\n");
      out.write("                                                                <option value=\"Portero\">Portero</option>\r\n");
      out.write("                                                                <option value=\"Defensor\">Defensa</option>\r\n");
      out.write("                                                                <option value=\"Mediocampista\">Mediocampista</option>\r\n");
      out.write("                                                                <option value=\"Delantero\">Delantero</option>\r\n");
      out.write("                                                            ");
}else if(objJugador.getPosicion().equals("Defensor")) {
      out.write("\r\n");
      out.write("                                                                <option value=\"Defensor\">Defensa</option>\r\n");
      out.write("                                                                <option value=\"Portero\">Portero</option>\r\n");
      out.write("                                                                <option value=\"Mediocampista\">Mediocampista</option>\r\n");
      out.write("                                                                <option value=\"Delantero\">Delantero</option>\r\n");
      out.write("                                                            ");
}else if (objJugador.getPosicion().equals("Mediocampista")){
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                                <option value=\"Mediocampista\">Mediocampista</option>\r\n");
      out.write("                                                                <option value=\"Defensor\">Defensa</option>\r\n");
      out.write("                                                                <option value=\"Portero\">Portero</option>\r\n");
      out.write("                                                                <option value=\"Delantero\">Delantero</option>\r\n");
      out.write("                                                            ");
}else if (objJugador.getPosicion().equals("Delantero")) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                                <option value=\"Delantero\">Delantero</option>\r\n");
      out.write("                                                                <option value=\"Mediocampista\">Mediocampista</option>\r\n");
      out.write("                                                                <option value=\"Defensor\">Defensa</option>\r\n");
      out.write("                                                                <option value=\"Portero\">Portero</option>\r\n");
      out.write("                                                            ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    <span class=\"material-input\"></span></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"control-label\">Pierna hábil</label>\r\n");
      out.write("                                                        <select class=\"form-control\" id=\"cmbPiernaEditarJugador\">\r\n");
      out.write("                                                            ");
if(objJugador.getPierna().equals("Derecha")){
      out.write("\r\n");
      out.write("                                                                <option value=\"Derecha\">Derecha</option>\r\n");
      out.write("                                                                <option value=\"Izquierda\">Izquierda</option>\r\n");
      out.write("                                                                <option value=\"Ambas\">Ambas</option>\r\n");
      out.write("                                                            ");
}else if(objJugador.getPierna().equals("Izquierda")){
      out.write("\r\n");
      out.write("                                                                <option value=\"Izquierda\">Izquierda</option>\r\n");
      out.write("                                                                <option value=\"Derecha\">Derecha</option>\r\n");
      out.write("                                                                <option value=\"Ambas\">Ambas</option>\r\n");
      out.write("                                                            ");
}else if(objJugador.getPierna().equals("Ambas")){
      out.write("\r\n");
      out.write("                                                                <option value=\"Ambas\">Ambas</option>\r\n");
      out.write("                                                                <option value=\"Derecha\">Derecha</option>\r\n");
      out.write("                                                                <option value=\"Izquierda\">Izquierda</option>\r\n");
      out.write("                                                            ");
}
      out.write("\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    <span class=\"material-input\"></span></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <label class=\"control-label\">Descripcion</label>\r\n");
      out.write("                                                        <textarea class=\"form-control\" id=\"txtDescripcionEditarJugador\">");
      out.print(objJugador.getDescripcion());
      out.write("</textarea>\r\n");
      out.write("                                                    <span class=\"material-input\"></span></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-rose pull-right editarJugador\">Actualizar Perfil</button>\r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("<!--   Core JS Files   -->\r\n");
      out.write("<script src=\"../../assets/js/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../assets/js/jquery-ui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../assets/js/material.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../assets/js/perfect-scrollbar.jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- Forms Validations Plugin -->\r\n");
      out.write("<script src=\"../../assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<!--  Plugin for Date Time Picker and Full Calendar Plugin-->\r\n");
      out.write("<script src=\"../../assets/js/moment.min.js\"></script>\r\n");
      out.write("<script src=\"../../assets/js/es.js\"></script>\r\n");
      out.write("<!--  Charts Plugin -->\r\n");
      out.write("<script src=\"../../assets/js/chartist.min.js\"></script>\r\n");
      out.write("<!--  Plugin for the Wizard -->\r\n");
      out.write("<script src=\"../../assets/js/jquery.bootstrap-wizard.js\"></script>\r\n");
      out.write("<!--  Notifications Plugin    -->\r\n");
      out.write("<script src=\"../../assets/js/bootstrap-notify.js\"></script>\r\n");
      out.write("<!--   Sharrre Library    -->\r\n");
      out.write("<script src=\"../../assets/js/jquery.sharrre.js\"></script>\r\n");
      out.write("<!-- DateTimePicker Plugin -->\r\n");
      out.write("<script src=\"../../assets/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<!-- Vector Map plugin -->\r\n");
      out.write("<script src=\"../../assets/js/jquey-jvectormap.js\"></script>\r\n");
      out.write("<!-- Sliders Plugin -->\r\n");
      out.write("<script src=\"../../assets/js/nouislider.min.js\"></script>\r\n");
      out.write("<!-- Select Plugin -->\r\n");
      out.write("<script src=\"../../assets/js/jquery.select-bootstrap.js\"></script>\r\n");
      out.write("<!--  DataTables.net Plugin    -->\r\n");
      out.write("<script src=\"../../assets/js/jquery.datatables.js\"></script>\r\n");
      out.write("<!-- Sweet Alert 2 plugin -->\r\n");
      out.write("<script src=\"../../assets/js/sweetalert2.js\"></script>\r\n");
      out.write("<!--\tPlugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->\r\n");
      out.write("<script src=\"../../assets/js/jasny-bootstrap.min.js\"></script>\r\n");
      out.write("<!--  Full Calendar Plugin    -->\r\n");
      out.write("<script src=\"../../assets/js/fullcalendar.min.js\"></script>\r\n");
      out.write("<!-- TagsInput Plugin -->\r\n");
      out.write("<script src=\"../../assets/js/jquery.tagsinput.js\"></script>\r\n");
      out.write("<!-- Material Dashboard javascript methods -->\r\n");
      out.write("<script src=\"../../assets/js/material-dashboard.js\"></script>\r\n");
      out.write("<!-- Material Dashboard DEMO methods, don't include it in your project! -->\r\n");
      out.write("<script src=\"../../assets/js/demo.js\"></script>\r\n");
      out.write("<!--Gmaps API-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAAZnaZBXLqNBRXjd-82km_NO7GUItyKek\"></script>  \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $().ready(function() {\r\n");
      out.write("        demo.initMaterialWizard();\r\n");
      out.write("        demo.checkFullPageBackgroundImage();\r\n");
      out.write("        demo.initFormExtendedDatetimepickers();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- Scripts Personalizados -->\r\n");
      out.write("<script src=\"../../assets/js/base.js\"></script>\r\n");
      out.write("<script src=\"../../assets/js/basePropietario.js\"></script>\r\n");
      out.write("<script src=\"../../assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"#nombrepagina\").text(\"Editar perfil\");\r\n");
      out.write("            window.onload = function (){\r\n");
      out.write("                \r\n");
      out.write("                CargarNotificaciones();\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
