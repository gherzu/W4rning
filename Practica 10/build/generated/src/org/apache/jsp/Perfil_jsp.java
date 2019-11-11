package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mi Perfil</title>\n");
      out.write("        <style> \n");
      out.write("        body {\n");
      out.write("            background-color: black;\n");
      out.write("            left: 550px;\n");
      out.write("\t    top: 25px;\n");
      out.write("            color: blue;\n");
      out.write("            position:relative;\n");
      out.write("            width:800px;\n");
      out.write("            height:540px;\n");
      out.write("\n");
      out.write("            font-size: 30px;\n");
      out.write("            left: 400px;\n");
      out.write("            top: 80px;  \n");
      out.write("            font-family: \"Times New Roman\";\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <title>Mi Perfil</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Controlador\" id=\"form\" method=\"post\" > \n");
      out.write("            <fieldset>\n");
      out.write("                Que desea hacer?<br>\n");
      out.write("                <input size=\"50\" type=\"text\" name=\"name\">\n");
      out.write("                <br>\n");
      out.write("                <input size=\"50\" type=\"hidden\" name=\"varcontrol\" value=\"2\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Registrar\" > \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
