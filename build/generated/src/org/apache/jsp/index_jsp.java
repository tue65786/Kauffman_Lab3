package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/pre-content.html");
    _jspx_dependants.add("/post-content.html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\n");
      out.write("        <script src=\"js/myscript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SCUBA</title>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"setSelectedTab('log')\">\n");
      out.write("       ");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <h1>SCUBA Diver Log</h1>\r\n");
      out.write("        <div class=\"newLine\"></div>\r\n");
      out.write("        <div id=\"home\" class=\"tab selected \"><a href=\"index.jsp\">Home</a></div>\r\n");
      out.write("        <div id=\"sites\" class=\"tab\"><a href=\"tab2page.html\">Tab 2</a></div>\r\n");
      out.write("        <div id=\"divers\"  class=\"tab\"><a href=\"tab3page.html\">Tab 3</a></div>\r\n");
      out.write("        <div id=\"log\"  class=\"tab\"><a href=\"tab4page.html\">Tab 4</a></div>\r\n");
      out.write("        <!--                TODO re: css challenge move log tab under divers -->\r\n");
      out.write("        <div class=\"newLine\"></div>\r\n");
      out.write("    </div>  <!-- finishes off the title div -->\r\n");
      out.write("    <div class=\"content selected\">");
      out.write(" \n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                <h2>Welcome to the SCUBA Dive Log web site!</h2>\n");
      out.write("                </p>\n");
      out.write("                Here you can:\n");
      out.write("                <ul>\n");
      out.write("                    <li>keep track of your dives</li>\n");
      out.write("                    <li>Check out the dive buddy finder: Browse the list of our members upcoming dives. Looking for a dive buddy?  upcoming trips</li>\n");
      out.write("                    \n");
      out.write("                    <li>keep track of your dives</li>\n");
      out.write("                    <li>view others diving history</li>\n");
      out.write("                    <li>browse dive spots (near you and around the world!)</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--                <div class=\"outterContainerDiv\"> This text is in the outside container.\n");
      out.write("                                    <div class=\"clear\"> </div>\n");
      out.write("                                    <div class=\"innerContainerDiv\"> This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container. </div>\n");
      out.write("                                    <div class=\"innerContainerDiv\"> This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container. </div>\n");
      out.write("                                    <div class=\"innerContainerDiv\"> This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container. </div>\n");
      out.write("                                    <div class=\"innerContainerDiv\"> This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container. </div>\n");
      out.write("                                    <div class=\"innerContainerDiv\"> This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container.\n");
      out.write("                                        This text is in the first inner container. </div>\n");
      out.write("                                    <div class=\"clear\"> </div>\n");
      out.write("                                    This text is in the outside container. \n");
      out.write("                                    <div class=\"clear\"> </div>\n");
      out.write("                                                    <div class=\"newLine\"></div>\n");
      out.write("                                    <div class=\"centerText\">\n");
      out.write("                                        <div class=\"center\">\n");
      out.write("                                            <img  src=\"images/padi.jpg\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        Check out <a href=\"http://www.padi.com\">PADI</a>'s web site for more info on SCUBA Diving\n");
      out.write("                \n");
      out.write("                                    </div> \n");
      out.write("                                   \n");
      out.write("                                </div>  ends the columns  -->\n");
      out.write("  ");
      out.write("    </div> <!-- content -->\r\n");
      out.write("    <div class=\"footer\">Daniel Kauffman - copyright &copy;2011</div>\r\n");
      out.write("  </div> <!-- finishes off the container div -->\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
      out.write("         \n");
      out.write("<!-- http://localhost:8080/Kauffman_Lab3/index.jsp \n");
      out.write("  cis-linux2.temple.edu       \n");
      out.write("/var/lib/tomcat6/webapps/SP13_2308_tue65786\n");
      out.write("\n");
      out.write("-->\n");
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
