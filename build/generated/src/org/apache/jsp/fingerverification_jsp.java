package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;
import java.util.Map;
import java.util.LinkedHashMap;
import DatabaseConnectivity.Dbconn;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class fingerverification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t<title>EFFECTIVE KEYWORD SEARCH</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name = \"format-detection\" content = \"telephone=no\" />\n");
      out.write("\t<link rel=\"icon\" href=\"b.jpg\" type=\"image/x-icon\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/grid.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/contact-form.css\">\n");
      out.write("\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/jquery-migrate-1.2.1.js\"></script>\n");
      out.write("\t<script src=\"js/script.js\"></script>\n");
      out.write("\t<script src=\"js/TMForm.js\"></script>\n");
      out.write("\t<script src=\"js/modal.js\"></script>\n");
      out.write("\t<script src='//maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false'></script>\n");
      out.write("\t<!--[if (gt IE 9)|!(IE)]><!-->\n");
      out.write("\t<script src=\"js/jquery.mobile.customized.min.js\"></script>\n");
      out.write("\t<script src=\"js/wow.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function () {\n");
      out.write("\t\t\tif ($('html').hasClass('desktop')) {\n");
      out.write("\t\t\t\tnew WOW().init();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"a.gif\");\n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("\t        background-attachment:fixed;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("<header >\n");
      out.write("\t<table border='0' width=\"80%\">\n");
      out.write("          <tr height=\"60px\">\n");
      out.write("          <td></td>\n");
      out.write("          </tr></table><br><br>\n");
      out.write("        <div class=\"aa\">\n");
      out.write("            <center>\n");
      out.write("            EFFECTIVE KEYWORD SEARCH OVER <br>\n");
      out.write("                  MULTIPLE OWNER USING CLOUD\n");
      out.write("                   </center></div>\n");
      out.write("          <br><br><br>\n");
      out.write("          \t<a href=\"f_download.jsp\">Log Out</a>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!--=======content================================-->\n");

try{
     HttpSession httpSession=request.getSession();
        String query = request.getQueryString();
        Map<String, String> query_pairs = new LinkedHashMap<String, String>();
        String[] pairs = query.split("&");
    for (String pair : pairs) {
        int idx = pair.indexOf("=");
        query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
    }
    String downloadFile= query_pairs.get("downloadFile");
    session.setAttribute("downloadFile", downloadFile);
    
    String fname = request.getParameter("downloadFile");
    String mail = request.getParameter("mail");
     Connection con;
                                        Statement st;
                                        ResultSet rs;
                                        con = Dbconn.getConnection();
                                        st = con.createStatement();
                                        rs = st.executeQuery("SELECT distinct * FROM `files`,`trustee` where request='"+mail+"' AND  files.file_name='"+fname+"' AND files.file_name = trustee.file_name ;");
        
               
                                        if (rs.next()) {
                                            String trust=rs.getString("trust");
                                             String key=rs.getString("skey");
                                             System.out.println(trust);
                                             
                                             System.out.println(key);
                                       
                                        
     
      out.write("\n");
      out.write("<section id=\"content\"  style=\"background-color:black\">\n");
      out.write("\t<div class=\"full-width-container block-2\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                   <div class=\"row\">\n");
      out.write("                       <center>\n");
      out.write("                                <header>\n");
      out.write("\t\t\t\t\t\t<h2 style=\"color:whitesmoke\"><span>Two Factor Access Control for File</span></h2>\n");
      out.write("\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                               </center>\n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t <div  style=\"height: 297px; width: 1000px; margin-left: 10px;margin-bottom: -10px;\">\n");
      out.write("                         <div style=\"width:500px;height: 300px;border-top-left-radius: 19px;border-bottom-left-radius: 19px;float: left;\">\n");
      out.write("\t\n");
      out.write("                             <fieldset style=\"background-color:cornflowerblue;border-radius: 9px;height: 350px;margin-top: 10px;\">\n");
      out.write("                                 <br>\n");
      out.write("          <center>\n");
      out.write("        <h1 style=\"font: monospace;font-size: 35px;font-weight: bold;color: darkslateblue\">Trustee File Security </h1><br><br><br>\n");
      out.write("          <form action=\"\" name=\"form1\" method=\"get\" > \n");
      out.write("<label style=\"font-size: 20px;margin-left:30px;\">Trustee Status :</label> <br><input type=\"text\" id=\"id\"  style=\"height: 40px; width:250px; \" name=\"key\" value=\"");
      out.print(trust);
      out.write("\" required style=\"margin-left: 45px;\" readonly=\"\"/><br><br>\n");
      out.write(" \n");
      out.write("     \n");
      out.write("  \n");
      out.write("      \n");
      out.write("            \n");
      out.write("\t\t</form>\n");
      out.write("          </center>\n");
      out.write("                             </fieldset>\n");
      out.write("                </div>\n");
      out.write("                                       <div style=\"height: 355px; width: 500px;margin-left:600px;\">\n");
      out.write("                                           <fieldset style=\"background-color:#ff33ff;border-radius: 9px;height: 350px;margin-top: 10px;\">\n");
      out.write("                                 <br>\n");
      out.write("          <center>\n");
      out.write("        <h1 style=\"font: monospace;font-size: 35px;font-weight: bold;color: darkslateblue\">File Secret Key </h1><br><br><br>\n");
      out.write("            <form action=\"loginaction.jsp\" name=\"form1\" method=\"post\" > \n");
      out.write("            <label style=\"font-size: 20px;margin-left:30px;\">Secret Key :</label> <br>\n");
      out.write("             <input type=\"password\" id=\"id\"  style=\"height: 40px; width:250px; \" name=\"key\"required style=\"margin-left: 45px;\" placeholder=\"Enter secret key \"/><br><br>\n");
      out.write("             <input type=\"hidden\" value=\"");
      out.print(trust);
      out.write("\" name=\"trust\" />\n");
      out.write("             <input type=\"hidden\" value=\"");
      out.print(fname);
      out.write("\" name=\"fname\" />\n");
      out.write("              <input type=\"hidden\" value=\"9\" name=\"status\" />\n");
      out.write("             <input type=\"hidden\" value=\"");
      out.print(mail);
      out.write("\" name=\"mail\" />\n");
      out.write("             <input type=\"submit\"  value=\"Download\" style=\"border-radius: 12px;height: 38px;width: 93px;background-color:silver\"/>\n");
      out.write("            </form>\n");
      out.write("          </center>\n");
      out.write("                             </fieldset>\n");
      out.write(" \n");
      out.write("                                       </div>\n");
      out.write("                         </div>\n");
      out.write("                       <br>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                              \n");
      out.write("                                ");

                                                               }
                                     else{
                                       response.sendRedirect("f_download.jsp?msg=get_Request_from_trustee_and_authority");      
                                      }
                                                                               
        } catch (Exception ex) {
            response.sendRedirect("f_download.jsp?msg=get_Request_from_trustee_and_authority");
                                    ex.printStackTrace();
                                }
      out.write("\n");
      out.write("         \n");
      out.write("\t\t\t\t</div>\n");
      out.write("                   \t</div>\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tgoogle_api_map_init();\n");
      out.write("\t\tfunction google_api_map_init(){\n");
      out.write("\t\t\tvar map;\n");
      out.write("\t\t\tvar coordData = new google.maps.LatLng(parseFloat(40.6894388), parseFloat(-73.9036233,10)); \n");
      out.write("\n");
      out.write("\t\t\tvar styleArray = [\n");
      out.write("\t\t\t\t{\"featureType\":\"water\",\"stylers\":[{\"color\":\"#021019\"}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"landscape\",\"stylers\":[{\"color\":\"#08304b\"}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"poi\",\"elementType\":\"geometry\",\"stylers\":[{\"color\":\"#0c4152\"},{\"lightness\":5}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"road.highway\",\"elementType\":\"geometry.fill\",\"stylers\":[{\"color\":\"#000000\"}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"road.highway\",\"elementType\":\"geometry.stroke\",\"stylers\":[{\"color\":\"#0b434f\"},{\"lightness\":25}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"road.arterial\",\"elementType\":\"geometry.fill\",\"stylers\":[{\"color\":\"#000000\"}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"road.arterial\",\"elementType\":\"geometry.stroke\",\"stylers\":[{\"color\":\"#0b3d51\"},{\"lightness\":16}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"road.local\",\"elementType\":\"geometry\",\"stylers\":[{\"color\":\"#000000\"}]},\n");
      out.write("\t\t\t\t{\"elementType\":\"labels.text.fill\",\"stylers\":[{\"color\":\"#ffffff\"}]},\n");
      out.write("\t\t\t\t{\"elementType\":\"labels.text.stroke\",\"stylers\":[{\"color\":\"#000000\"},{\"lightness\":13}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"transit\",\"stylers\":[{\"color\":\"#146474\"}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"administrative\",\"elementType\":\"geometry.fill\",\"stylers\":[{\"color\":\"#000000\"}]},\n");
      out.write("\t\t\t\t{\"featureType\":\"administrative\",\"elementType\":\"geometry.stroke\",\"stylers\":[{\"color\":\"#144b53\"},{\"lightness\":14},{\"weight\":1.4}]}\n");
      out.write("\t\t\t\t]\n");
      out.write("\t\t\t \n");
      out.write("\t\t\tfunction initialize() { \n");
      out.write("\t\t\t  var mapOptions = { \n");
      out.write("\t\t\t\tzoom: 12, \n");
      out.write("\t\t\t\tcenter: coordData, \n");
      out.write("\t\t\t\tscrollwheel: false, \n");
      out.write("\t\t\t\tstyles: styleArray \n");
      out.write("\t\t\t  } \n");
      out.write(" \n");
      out.write("\t\t\t  var contentString = \"<div></div>\"; \n");
      out.write("\t\t\t  var infowindow = new google.maps.InfoWindow({ \n");
      out.write("\t\t\t\tcontent: contentString, \n");
      out.write("\t\t\t\tmaxWidth: 200 \n");
      out.write("\t\t\t  }); \n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t  var map = new google.maps.Map(document.getElementById(\"map-canvas\"), mapOptions); \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\tgoogle.maps.event.addDomListener(window, 'resize', function() {\n");
      out.write("\n");
      out.write("\t\t\t  map.setCenter(coordData);\n");
      out.write("\n");
      out.write("\t\t\t  var center = map.getCenter();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t\tgoogle.maps.event.addDomListener(window, \"load\", initialize); \n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("</script>\n");
      out.write("<!-- coded by Fred -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
