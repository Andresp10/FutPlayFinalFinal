package org.apache.jsp.material_002ddashboard.pages.encuentro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Campos;
import Controlador.campos;
import Modelo.Equipo;
import java.util.List;
import Controlador.equipo;
import Modelo.Persona;
import Modelo.Jugador;

public final class registroEncuentro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/material-dashboard/pages/encuentro/../includes/importsCSS.jsp");
    _jspx_dependants.add("/material-dashboard/pages/encuentro/../includes/notificaciones.jsp");
    _jspx_dependants.add("/material-dashboard/pages/encuentro/../includes/sidebarJugador.jsp");
    _jspx_dependants.add("/material-dashboard/pages/encuentro/../includes/header.jsp");
    _jspx_dependants.add("/material-dashboard/pages/encuentro/../includes/importsJS.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>FutPlay - Ingresar Encuentro</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      out.write("<!-- Notifications area -->\r\n");
      out.write("<section class=\"NotificationAreaP\">\r\n");
      out.write("    <div class=\"text-center NotificationArea-titleP\">\r\n");
      out.write("        <h5 class=\"title\">Notificaciones</h5>\r\n");
      out.write("        <i class=\"material-icons btn-Notification\">clear</i>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"notificacionesContenedor\" style=\"overflow-y: auto; overflow-x: hidden;height: 600px;\">\r\n");
      out.write("        <!-- NOTIFICACION OKKKKK!!!! -->\r\n");
      out.write("        <!--<a href=\"#\" class=\"NotificationP\">\r\n");
      out.write("            <div class=\"Notification-iconP\">\r\n");
      out.write("                <i class=\"material-icons\" style=\"background-color: #05ae0e; font-size: 25px;\">people</i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"Notification-textP\" style=\"margin-left: 90px;\">\r\n");
      out.write("                <p style=\"padding-top: 15px;\">\r\n");
      out.write("                    <strong class=\"description\">PEPEPEPEPE ha cambiado la informacion del equipo.</strong><br>\r\n");
      out.write("                    <small>Justo ahora</small>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </a>-->\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\n");
      out.write("            ");
      out.write('\n');
      out.write('\n');
  
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
      out.write("\n");
      out.write("        \n");
      out.write("            ");

                System.out.println("EEEEEEEEESTA CONTINUANDO 000000000000000000000000000000000");
                
            
      out.write("\n");
      out.write("            <div class=\"sidebar\" data-active-color=\"red\" data-background-color=\"black\" data-image=\"/FutPlayFinal/material-dashboard/assets/img/jugadorimg/football-field-night.jpg\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"/FutPlayFinal/material-dashboard/pages/jugador/indexJugador.jsp\" class=\"simple-text\">\n");
      out.write("                        FutPlay\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo logo-mini\">\n");
      out.write("                    <a href=\"/FutPlayFinal/material-dashboard/pages/jugador/indexJugador.jsp\" class=\"simple-text\">\n");
      out.write("                        <img src=\"../../assets/img/favicon.png\" style=\"width:35px;height: 35px;\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-wrapper\">\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <div class=\"photo\">\n");
      out.write("                            <img src=\"/FutPlayFinal/material-dashboard/assets/img/avatares/");
      out.print(objPersona.getAvatar());
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapseExample\" class=\"collapsed\">\n");
      out.write("                                ");
      out.print( objJugador.getAlias());
      out.write("\n");
      out.write("                                <b class=\"caret\"></b>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapseExample\">\n");
      out.write("                                <ul class=\"nav\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"../jugador/verPerfilJugador.jsp\">Ver perfil</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"../jugador/editarPerfilJugador.jsp\">Editar perfil</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Ajustes</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li id=\"iniciojugador\">\n");
      out.write("                            <a href=\"../jugador/indexJugador.jsp\">\n");
      out.write("                                <i class=\"material-icons\">dashboard</i>\n");
      out.write("                                <p>Inicio</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"equipo\">\n");
      out.write("                            <a href=\"../equipo/verEquipo.jsp\">\n");
      out.write("                                <i class=\"material-icons\">people</i>\n");
      out.write("                                <p>Mi equipo</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"jugadores\">\n");
      out.write("                            <a href=\"../jugador/verJugadores.jsp\">\n");
      out.write("                                <i class=\"material-icons\">person</i>\n");
      out.write("                                <p>Jugadores</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"charla\">\n");
      out.write("                            <a href=\"../mensaje/charlaSockets.jsp\">\n");
      out.write("                                <i class=\"material-icons\">message</i>\n");
      out.write("                                <p>Charla tecnica</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"encuentro\">\n");
      out.write("                            <a href=\"../encuentro/verEncuentros.jsp\">\n");
      out.write("                                <i class=\"material-icons\">flash_on</i>\n");
      out.write("                                <p>Encuentros</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        ");
}     
    }  
    catch(Exception ex){
        response.sendRedirect("/FutPlayFinal/index.html");
    }

      out.write('\n');
      out.write("\n");
      out.write("            ");
if(objJugador != null & objPersona != null){
      out.write("\n");
      out.write("            <div class=\"main-panel\">\n");
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
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        ");
if (objJugador.getEquipo().toString().equals("1")) {
      out.write("\n");
      out.write("                        <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                            <div class='card card-profile'>\n");
      out.write("                                <div class='card-header card-header-icon' data-background-color='red'>\n");
      out.write("                                    <i class=\"material-icons\">speaker_notes_off</i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-content\">\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    <h6 class=\"category text-gray\">¿No tienes encuentros?</h6>\n");
      out.write("                                    <h4 class=\"card-title\">FutPlay te informa</h4>\n");
      out.write("                                    <p class=\"description\">\n");
      out.write("                                        Hola, por el momento no haces parte de un equipo. Nos gustaria que crearass tu propio equipo con el que podras competir en los torneo, on en su defecto pidele a un amigo que te agregue su equipo :).\n");
      out.write("                                    </p>\n");
      out.write("                                    <a href=\"/FutPlayFinal/material-dashboard/pages/equipo/verEquipo.jsp\" class=\"btn btn-rose btn-round\">Ir a crear equipo</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p id=\"noEncuentros\">no</p>\n");
      out.write("                        ");
}else{
      out.write("\n");
      out.write("                        <div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("                            <!--      Wizard container        -->\n");
      out.write("                            <div class=\"wizard-container\">\n");
      out.write("                                <div class=\"card wizard-card\" data-color=\"red\" id=\"wizardProfile\">\n");
      out.write("                                    <form novalidate=\"novalidate\">\n");
      out.write("                                        <!--        You can switch \" data-color=\"purple\" \"  with one of the next bright colors: \"green\", \"orange\", \"red\", \"blue\"       -->\n");
      out.write("                                        <div class=\"wizard-header\">\n");
      out.write("                                            <h3 class=\"wizard-title\">\n");
      out.write("                                                Programar tu encuentro\n");
      out.write("                                            </h3>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"wizard-navigation\">\n");
      out.write("                                            <ul class=\"nav nav-pills\">\n");
      out.write("                                                <li style=\"width: 33.3333%;\" class=\"active\">\n");
      out.write("                                                    <a href=\"#about\" data-toggle=\"tab\" aria-expanded=\"true\">Tipo</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li style=\"width: 33.3333%;\">\n");
      out.write("                                                    <a href=\"#account\" data-toggle=\"tab\">Equipos</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li style=\"width: 33.3333%;\">\n");
      out.write("                                                    <a href=\"#address\" data-toggle=\"tab\">Campos</a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        <div class=\"moving-tab\" style=\"width: 142.49px; transform: translate3d(-8px, 0px, 0px); transition: transform 0s;\">About</div></div>\n");
      out.write("                                        <div class=\"tab-content\">\n");
      out.write("                                            <div class=\"tab-pane active\" id=\"about\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <h4 class=\"info-text\"> Selecciona el tipo de encuentro</h4>\n");
      out.write("                                                    <div class=\"col-sm-4\">\n");
      out.write("                                                        <div class=\"choice\" onclick=\"tipoSeleccionado(5)\" data-toggle=\"wizard-radio\">\n");
      out.write("                                                            <input type=\"radio\">\n");
      out.write("                                                            <div class=\"icon text-center\">\n");
      out.write("                                                                <h1>5</h1>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <h6>Futbol 5</h6>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-4\">\n");
      out.write("                                                        <div class=\"choice\" onclick=\"tipoSeleccionado(8)\" data-toggle=\"wizard-radio\">\n");
      out.write("                                                            <input type=\"radio\">\n");
      out.write("                                                            <div class=\"icon text-center\">\n");
      out.write("                                                                <h1>8</h1>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <h6>Futbol 8</h6>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-4\">\n");
      out.write("                                                        <div class=\"choice\" onclick=\"tipoSeleccionado(12)\" data-toggle=\"wizard-radio\">\n");
      out.write("                                                            <input type=\"radio\">\n");
      out.write("                                                            <div class=\"icon text-center\">\n");
      out.write("                                                                <h1>12</h1>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <h6>Futbol 12</h6>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                        \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"tab-pane\" id=\"account\">\n");
      out.write("                                                <h4 class=\"info-text\">Elige el equipo con el que deseas jugar</h4>\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-lg-10 col-lg-offset-1\">\n");
      out.write("                                                        \n");
      out.write("                                                        ");
  equipo equipos = new equipo();
                                                            List<Equipo> list = equipos.getAllE(request,response);
                                                            if (list.equals(null)) {
      out.write("\n");
      out.write("                                                                <h2> No hay Campos para Mostrar</h2>     \n");
      out.write("                                                        ");
  }else{ 
      out.write("\n");
      out.write("\n");
      out.write("                                                             ");
for (Equipo LEquipo : list) {
      out.write("   \n");
      out.write("\n");
      out.write("                                                                <div class=\"card-description\">\n");
      out.write("                                                                    <div class=\"col-lg-4\">\n");
      out.write("                                                                        <div class=\"card card-pricing card-raised\">\n");
      out.write("                                                                            <div class=\"content\">\n");
      out.write("                                                                                <h6 class=\"category\">");
      out.print(LEquipo.getNombre());
      out.write("</h6>\n");
      out.write("                                                                                <!--<div class=\"icon icon-rose\">\n");
      out.write("                                                                                    <img class=\"avatar\" src=\"../../assets/img/jugadorimg/Manchester-City-stats1.png\" style=\"width: 120px;height: 120px;\">\n");
      out.write("                                                                                </div>-->\n");
      out.write("                                                                                <h3 class=\"card-title\">");
      out.print(LEquipo.getCiudad());
      out.write("</h3>\n");
      out.write("                                                                                <div class=\"radio\">\n");
      out.write("                                                                                  <label>\n");
      out.write("                                                                                      <input id=\"equipoEncuentro\" name=\"equipo\" type=\"radio\" onclick=\"equipoSeleccionado(this)\" value=\"");
      out.print(LEquipo.getIdEquipo());
      out.write("\"/>\n");
      out.write("                                                                                      <span class=\"circle\"></span>\n");
      out.write("                                                                                      <span class=\"check\"></span> Selecionar\n");
      out.write("                                                                                  </label>\n");
      out.write("                                                                              </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                ");
}
                                                            }
      out.write(" \n");
      out.write("                                                \n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"tab-pane\" id=\"address\">\n");
      out.write("                                                <h4 class=\"info-text\">Selecciona el campo el el que deseas jugar</h4>\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-lg-10 col-lg-offset-1\">\n");
      out.write("                                                        \n");
      out.write("                                                        ");
  campos campo = new campos();
                                                            List<Campos> lista = campo.verCampos();
                                                            if (list==null) {
                                                        
      out.write("\n");
      out.write("                                                                     <h2> No hay Campos para Mostrar</h2>     \n");
      out.write("                                                               ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                           ");
for (Campos LCampo : lista) {

                                                           
      out.write("   \n");
      out.write("\n");
      out.write("                                                        <div class=\"card-description\">\n");
      out.write("                                                            <div class=\"col-lg-4\">\n");
      out.write("                                                                <div class=\"card card-pricing card-raised\">\n");
      out.write("                                                                    <div class=\"content\">\n");
      out.write("                                                                        <h6 class=\"category\">");
      out.print(LCampo.getNombre());
      out.write("</h6>\n");
      out.write("                                                                        <div class=\"icon icon-rose\">\n");
      out.write("                                                                            <img class=\"avatar\" src=\"/FutPlayFinal/Imagenes/");
      out.print(LCampo.getFoto());
      out.write("\" style=\"width: 120px;height: 120px;\">\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                            <a href=\"#mapModal\" class=\"btn btn-primary btn-simple \" rel=\"tooltip\" data-placement=\"bottom\" title=\"\" onclick=\"verUbicacionCampos('");
      out.print(LCampo.getUbicacion());
      out.write("')\" value=\"");
      out.print(LCampo.getUbicacion());
      out.write("\" data-original-title=\"Ubicacion en Google maps\">\n");
      out.write("                                                                            <i class=\"material-icons\" style=\"font-size: 25px;\">location_on</i>\n");
      out.write("                                                                            <div class=\"ripple-container\"></div>\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                        <p class=\"card-description\">");
      out.print(LCampo.getDireccion());
      out.write("</p>\n");
      out.write("                                                                        <div class=\"radio\">\n");
      out.write("                                                                            <label>\n");
      out.write("                                                                                <input id=\"campoEncuentro\" name=\"campo\" type=\"radio\" onclick=\"campoSeleccionado(this)\" value=\"");
      out.print(LCampo.getIdCampo());
      out.write("\">\n");
      out.write("                                                                                <span class=\"circle\"></span>\n");
      out.write("                                                                                <span class=\"check\"></span> Selecionar\n");
      out.write("                                                                            </label>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                         ");
}
      out.write("\n");
      out.write("                                                  \n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"wizard-footer\">\n");
      out.write("                                            <div class=\"pull-right\">\n");
      out.write("                                                <input type=\"button\" class=\"btnTipo btn btn-next btn-fill btn-danger btn-wd\" name=\"next\" value=\"Next\">\n");
      out.write("                                                <input type=\"button\" class=\"btn btn-finish btn-fill btn-danger btn-wd ingresarEncuentro\" name=\"finish\" value=\"Finish\" style=\"display: none;\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <input type=\"button\" class=\" btn btn-previous btn-fill btn-default btn-wd disabled\" name=\"previous\" value=\"Previous\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- wizard container -->\n");
      out.write("                        </div>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal fade\" id=\"mapModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">\n");
      out.write("                            <i class=\"material-icons\">clear</i>\n");
      out.write("                        </button>\n");
      out.write("                        <h4 class=\"modal-title\">Ubicación</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div style=\"width: 100%; height: 300px; position: relative; overflow: hidden;\" id=\"map-canvas\" class=\"loading\"><div style=\"height: 100%; width: 100%; position: absolute; top: 0px; left: 0px; background-color: rgb(229, 227, 223);\"><div class=\"gm-style\" style=\"position: absolute; z-index: 0; left: 0px; top: 0px; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px;\"><div tabindex=\"0\" style=\"position: absolute; z-index: 0; left: 0px; top: 0px; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; cursor: url(&quot;https://maps.gstatic.com/mapfiles/openhand_8_8.cur&quot;) 8 8, default;\"><div style=\"z-index: 1; position: absolute; top: 0px; left: 0px; width: 100%; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 0, 0);\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 100; width: 100%;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 0;\"><div aria-hidden=\"true\" style=\"position: absolute; left: 0px; top: 0px; z-index: 1; visibility: inherit;\"><div style=\"width: 256px; height: 256px; position: absolute; left: -75px; top: -176px;\"></div></div></div></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 101; width: 100%;\"></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 102; width: 100%;\"></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 103; width: 100%;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: -1;\"><div aria-hidden=\"true\" style=\"position: absolute; left: 0px; top: 0px; z-index: 1; visibility: inherit;\"><div style=\"width: 256px; height: 256px; overflow: hidden; position: absolute; left: -75px; top: -176px;\"><canvas draggable=\"false\" height=\"256\" width=\"256\" style=\"user-select: none; position: absolute; left: 0px; top: 0px; height: 256px; width: 256px;\"></canvas></div></div></div></div><div style=\"position: absolute; z-index: 0; left: 0px; top: 0px;\"><div style=\"overflow: hidden;\"></div></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 0;\"><div aria-hidden=\"true\" style=\"position: absolute; left: 0px; top: 0px; z-index: 1; visibility: inherit;\"></div></div></div><div class=\"gm-style-pbc\" style=\"z-index: 2; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px; opacity: 0;\"><p class=\"gm-style-pbt\"></p></div><div style=\"z-index: 3; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px;\"><div style=\"z-index: 1; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px;\"></div></div><div style=\"z-index: 4; position: absolute; top: 0px; left: 0px; width: 100%; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 0, 0);\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 104; width: 100%;\"></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 105; width: 100%;\"></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 106; width: 100%;\"></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 107; width: 100%;\"></div></div></div><div style=\"margin-left: 5px; margin-right: 5px; z-index: 1000000; position: absolute; left: 0px; bottom: 0px;\"><a target=\"_blank\" href=\"https://maps.google.com/maps?ll=5.716085,-72.931129&amp;z=16&amp;t=m&amp;hl=es-ES&amp;gl=US&amp;mapclient=apiv3\" title=\"Haz clic aquí para visualizar esta zona en Google Maps\" style=\"position: static; overflow: visible; float: none; display: inline;\"><div style=\"width: 66px; height: 26px; cursor: pointer;\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/google_white5.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: 0px; width: 66px; height: 26px; user-select: none; border: 0px; padding: 0px; margin: 0px;\"></div></a></div><div style=\"background-color: white; padding: 15px 21px; border: 1px solid rgb(171, 171, 171); font-family: Roboto, Arial, sans-serif; color: rgb(34, 34, 34); box-shadow: rgba(0, 0, 0, 0.2) 0px 4px 16px; z-index: 10000002; display: none; width: 0px; height: 0px; position: absolute; left: 5px; top: 5px;\"><div style=\"padding: 0px 0px 10px; font-size: 16px;\">Datos de mapas</div><div style=\"font-size: 13px;\"></div><div style=\"width: 13px; height: 13px; overflow: hidden; position: absolute; opacity: 0.7; right: 12px; top: 12px; z-index: 10000; cursor: pointer;\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/mapcnt6.png\" draggable=\"false\" style=\"position: absolute; left: -2px; top: -336px; width: 59px; height: 492px; user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div></div><div class=\"gmnoprint\" style=\"z-index: 1000001; position: absolute; right: 0px; bottom: 0px; width: 12px;\"><div draggable=\"false\" class=\"gm-style-cc\" style=\"user-select: none; height: 14px; line-height: 14px;\"><div style=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\"><div style=\"width: 1px;\"></div><div style=\"background-color: rgb(245, 245, 245); width: auto; height: 100%; margin-left: 1px;\"></div></div><div style=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; vertical-align: middle; display: inline-block;\"><a style=\"color: rgb(68, 68, 68); text-decoration: none; cursor: pointer; display: none;\">Datos de mapas</a><span style=\"display: none;\"></span></div></div></div><div class=\"gmnoscreen\" style=\"position: absolute; right: 0px; bottom: 0px;\"><div style=\"font-family: Roboto, Arial, sans-serif; font-size: 11px; color: rgb(68, 68, 68); direction: ltr; text-align: right; background-color: rgb(245, 245, 245);\"></div></div><div class=\"gmnoprint gm-style-cc\" draggable=\"false\" style=\"z-index: 1000001; user-select: none; height: 14px; line-height: 14px; position: absolute; right: 0px; bottom: 0px;\"><div style=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\"><div style=\"width: 1px;\"></div><div style=\"background-color: rgb(245, 245, 245); width: auto; height: 100%; margin-left: 1px;\"></div></div><div style=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; vertical-align: middle; display: inline-block;\"><a href=\"https://www.google.com/intl/es-ES_US/help/terms_maps.html\" target=\"_blank\" style=\"text-decoration: none; cursor: pointer; color: rgb(68, 68, 68);\">Términos de uso</a></div></div><div style=\"cursor: pointer; width: 25px; height: 25px; overflow: hidden; margin: 10px 14px; position: absolute; top: 0px; right: 0px;\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/sv9.png\" draggable=\"false\" class=\"gm-fullscreen-control\" style=\"position: absolute; left: -52px; top: -86px; width: 164px; height: 175px; user-select: none; border: 0px; padding: 0px; margin: 0px;\"></div><div draggable=\"false\" class=\"gm-style-cc\" style=\"user-select: none; height: 14px; line-height: 14px; display: none; position: absolute; right: 0px; bottom: 0px;\"><div style=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\"><div style=\"width: 1px;\"></div><div style=\"background-color: rgb(245, 245, 245); width: auto; height: 100%; margin-left: 1px;\"></div></div><div style=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; vertical-align: middle; display: inline-block;\"><a target=\"_new\" title=\"Informar a Google acerca de errores en las imágenes o en el mapa de carreteras\" href=\"https://www.google.com/maps/@5.7160848,-72.9311289,16z/data=!10m1!1e1!12b1?source=apiv3&amp;rapsrc=apiv3\" style=\"font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); text-decoration: none; position: relative;\">Informar de un error de Maps</a></div></div><div class=\"gmnoprint gm-bundled-control gm-bundled-control-on-bottom\" draggable=\"false\" controlwidth=\"0\" controlheight=\"0\" style=\"margin: 10px; user-select: none; position: absolute; display: none; bottom: 0px; right: 0px;\"><div class=\"gmnoprint\" style=\"display: none; position: absolute;\"><div draggable=\"false\" style=\"user-select: none; box-shadow: rgba(0, 0, 0, 0.3) 0px 1px 4px -1px; border-radius: 2px; cursor: pointer; background-color: rgb(255, 255, 255);\"><div title=\"Acerca la imagen\" aria-label=\"Acerca la imagen\" tabindex=\"0\" style=\"position: relative;\"><div style=\"overflow: hidden; position: absolute;\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/tmapctrl.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: 0px; user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none; width: 120px; height: 54px;\"></div></div><div style=\"position: relative; overflow: hidden; width: 67%; height: 1px; left: 16%; background-color: rgb(230, 230, 230);\"></div><div title=\"Aleja la imagen\" aria-label=\"Aleja la imagen\" tabindex=\"0\" style=\"position: relative;\"><div style=\"overflow: hidden; position: absolute;\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/tmapctrl.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: 0px; user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none; width: 120px; height: 54px;\"></div></div></div></div><div class=\"gm-svpc\" controlwidth=\"28\" controlheight=\"28\" style=\"background-color: rgb(255, 255, 255); box-shadow: rgba(0, 0, 0, 0.3) 0px 1px 4px -1px; border-radius: 2px; width: 28px; height: 28px; cursor: url(&quot;https://maps.gstatic.com/mapfiles/openhand_8_8.cur&quot;) 8 8, default; display: none; position: absolute;\"><div style=\"position: absolute; left: 1px; top: 1px;\"></div></div><div class=\"gmnoprint\" controlwidth=\"28\" controlheight=\"0\" style=\"display: none; position: absolute;\"><div title=\"Girar el mapa 90 grados\" style=\"width: 28px; height: 28px; overflow: hidden; position: absolute; border-radius: 2px; box-shadow: rgba(0, 0, 0, 0.3) 0px 1px 4px -1px; cursor: pointer; background-color: rgb(255, 255, 255); display: none;\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/tmapctrl4.png\" draggable=\"false\" style=\"position: absolute; left: -141px; top: 6px; width: 170px; height: 54px; user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div class=\"gm-tilt\" style=\"width: 0px; height: 0px; overflow: hidden; position: absolute; border-radius: 2px; box-shadow: rgba(0, 0, 0, 0.3) 0px 1px 4px -1px; top: 0px; cursor: pointer; background-color: rgb(255, 255, 255);\"><img src=\"https://maps.gstatic.com/mapfiles/api-3/images/tmapctrl4.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: 0px; width: 170px; height: 54px; user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div></div></div></div></div></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(\"#encuentro\").addClass('active');\n");
      out.write("            CargarNotificaciones();\n");
      out.write("            \n");
      out.write("            if($(\"#noEncuentros\").text() == \"no\"){\n");
      out.write("                \n");
      out.write("                $.notify({\n");
      out.write("                    icon: \"perm_identity\",\n");
      out.write("                    message: \"Podras administrar tus encuentros cuando hagas parte de un equipo.\"\n");
      out.write("\n");
      out.write("                },{\n");
      out.write("                    type: 'warning',\n");
      out.write("                    timer: 2500,\n");
      out.write("                    placement: {\n");
      out.write("                        from: 'bottom',\n");
      out.write("                        align: 'right'\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
