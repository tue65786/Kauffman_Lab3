package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"./js/datetimepicker_css.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SCUBA - Contact Us</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"setSelectedTab('Contact');\">\n");
      out.write("        ");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <h1>SCUBA Diver Log</h1>\r\n");
      out.write("        <div class=\"newLine\"></div>\r\n");
      out.write("        <div id=\"Home\" class=\"tab\"><a href=\"index.jsp\">Home</a></div>\r\n");
      out.write("        <div id=\"Locations\" class=\"tab\"><a href=\"locations.jsp\">Tab 2</a></div>\r\n");
      out.write("        <div id=\"Log\"  class=\"tab\"><a href=\"log.jsp\">Tab 3</a></div>\r\n");
      out.write("        <div id=\"Diver\"  class=\"tab\"><a href=\"diver.jsp\">Diver Services</a></div>\r\n");
      out.write("        <!--                TODO re: css challenge move log tab under divers -->\r\n");
      out.write("        <div class=\"newLine\"></div>\r\n");
      out.write("    </div>  <!-- finishes off the title div -->\r\n");
      out.write("    <div class=\"content selected\">\r\n");
      out.write("        <div id=\"crumbs\"></div>");
      out.write(" \n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <fieldset>          \n");
      out.write("                <legend>Please take a moment to let us know how were doing!</legend>\n");
      out.write("                \n");
      out.write("                <p><label class=\"field\" for=\"subject\">Subject:</label><select  name=\"subject\" size=\"1\" class=\"field-300\">\n");
      out.write("                        <option value=\"General Inquiry\" selected=\"selected\">General Inquiry</option>\n");
      out.write("                        <option value=\"Your_Account\">Your Account</option>\n");
      out.write("                        <option value=\"Looking for a Dive Buddy\">Looking for a Dive Buddy</option>\n");
      out.write("                        <option value=\"Something Else\">Something Else</option>\n");
      out.write("                    </select>\n");
      out.write("                </p>\n");
      out.write("                <p><label class=\"field\" for=\"name\">Your Name</label><input type=\"text\" class=\"field-300\" name=\"name\"/></p>\n");
      out.write("                <p><label class=\"field\" for=\"email\">Your Email</label><input type=\"text\" class=\"field-300\" name=\"email\"/></p>\n");
      out.write("                <p><label class=\"field\" for=\"\"></label><input type=\"text\" class=\"field-300\" name=\"\"/></p>\n");
      out.write("                <p><label class=\"field\" for=\"US-SoEa\">Where do you do most of your diving?</label>\n");
      out.write("                    <span class=\"clickfields\"><input type=\"checkbox\" name=\"US-SoEa\" value=\"\"/> South Eastern US</span>\n");
      out.write("                    <span class=\"clickfields\"><input type=\"checkbox\" name=\"US-West\" value=\"US-West\"/>West Coast US</span>\n");
      out.write("                    <span class=\"clickfields\"><input type=\"checkbox\" name=\"US-Inland\" value=\"US-Inlind\"/>Inlandt US</span>\n");
      out.write("                 </p>\n");
      out.write("                 <p>\n");
      out.write("                     <label for=\"InsertRecordInternal_Comments\">How often do you dive?</label>\n");
      out.write("<input type=\"radio\" name=\"InsertRecordInternal_Comments\" id=\"InsertRecordInternal_Comments0\" value=\"Never been\" /><label for=\"InsertRecordInternal_Comments0\">Never \n");
      out.write("been</label>\n");
      out.write("<input type=\"radio\" name=\"Never\" id=\"InsertRecordInternal_Comments1\" value=\"Less than once a year\" /><label for=\"InsertRecordInternal_Comments1\">Less \n");
      out.write("than once a year</label>\n");
      out.write("<input type=\"radio\" name=\"Yearly\" id=\"InsertRecordInternal_Comments2\" value=\"Atleast Once A Year\" /><label for=\"InsertRecordInternal_Comments2\">Atleast \n");
      out.write("Once A Year</label>\n");
      out.write("<input type=\"radio\" name=\"Often\" id=\"InsertRecordInternal_Comments3\" value=\"Couple times a year\" /><label for=\"InsertRecordInternal_Comments3\">Couple \n");
      out.write("times a year</label>\n");
      out.write("<input type=\"radio\" name=\"Regularly\" id=\"InsertRecordInternal_Comments4\" value=\"Couple times a month\" /><label for=\"InsertRecordInternal_Comments4\">Couple \n");
      out.write("times a month</label>\n");
      out.write("                 </p>\n");
      out.write("                 <p><label for=\"comments\">Comments</label>\n");
      out.write("<input type=\"text\" class=\"cbFormTextField\" size=\"25\" maxlength=\"64000\" name=\"comments\" value />\n");
      out.write("                <input type=\"checkbox\" name=\"InsertRecordNewsletter\" value=\"PADI\" />PADI</span></td>\n");
      out.write("                <td colspan=\"2\" class=\"cbFormFieldCell\">\n");
      out.write("                    <span class=\"cbFormData\">\n");
      out.write("                        <input type=\"checkbox\" name=\"InsertRecordLast_Name\" id=\"InsertRecordLast_Name\" value=\"NAUI\" /> \n");
      out.write("                        NAUI</span></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"go\" id=\"go\" onsubmit=\"converturl();location.href=fullurl.value;return false\">\n");
      out.write("            <fieldset id=\"personal\">\n");
      out.write("                <legend>Canvasser Results</legend>\n");
      out.write("                <i>How?</i><ol>\n");
      out.write("                    <li><u>Login to votebuilder</u>: In a separate tab, login to votebuilder and click \n");
      out.write("                    on the <b>my campaign tab</b> </li>\n");
      out.write("                    <li><u>Canvasser</u>: Select name from dropdown list.</li>\n");
      out.write("                    <li><u>Date</u>: Click calendar icon to choose date.</li>\n");
      out.write("                    <li><u>Done</u>! Click GO! </li>\n");
      out.write("                </ol>\n");
      out.write("                <input name=\"url\" type=\"hidden\" value=\"votebuilder.com/CanvassResultsDailyLogList.aspx\" title=\"read only\" />\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"canvasser\" style=\"width:90%\" id=\"canvasser\" onchange=\"updateTB()\">\n");
      out.write("                                <option selected=\"selected\" value>&lt;select a canvasser&gt;</option>\n");
      out.write("                                <option value=\"\">Jim R</option>\n");
      out.write("                                <option value=\"\">Jed G</option>\n");
      out.write("                                <option value=\"\">Harriet K</option>\n");
      out.write("                                <option value=\"\">Carol M</option>\n");
      out.write("                                <option value=\"\">Craig O</option>\n");
      out.write("                                <option value=\"\">Dan K</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"lname\">Last name : </label>\n");
      out.write("                            <input name=\"lname\" type=\"text\" id=\"lname\" onfocus=\"getValue(this)\" onblur=\"setValue(this)\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"fname\">First name : </label>\n");
      out.write("                            <input name=\"fname\" type=\"text\" onfocus=\"getValue(this)\" onblur=\"setValue(this)\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"cid\">CvID : </label>\n");
      out.write("                            <input name=\"cid\" id=\"cid\" type=\"text\" onfocus=\"getValue(this)\" onblur=\"setValue(this)\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <!--                                <label for=\"demo2\">Date: (click_icon) </label>\n");
      out.write("                                                            <input id=\"demo2\" name=\"demo2\" readonly=\"readonly\" type=\"text\" size=\"25\" /><a href=\"javascript:NewCal('demo2','mmddyyyy')\"><img src=\"cal.gif\" width=\"22\" align=\"texttop\" height=\"22\" border=\"0\" alt=\"Pick a date\" />-->\n");
      out.write("\n");
      out.write("                            <label for=\"demo1\">Please enter a date here &gt;&gt; </label>\n");
      out.write("                            <input type=\"Text\" id=\"demo1\" maxlength=\"25\" size=\"25\" onfocus=\"NewCssCal('demo1','yyyyMMdd','','','','','past');blur()\"/>\n");
      out.write("                            <img src=\"images/images2/cal.gif\" onclick=\"NewCssCal('demo1','yyyyMMdd','','','','','past')\" style=\"cursor:pointer\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <input name=\"fullurl\" type=\"hidden\" />\n");
      out.write("                <div style=\"float:right; padding-right:50px;\">\n");
      out.write("                    <input type=\"submit\" id=\"go\" value=\" Go \" /> </div>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("    </div> <!-- content -->\r\n");
      out.write("    <div class=\"footer\">Daniel Kauffman - copyright &copy;2011</div>\r\n");
      out.write("  </div> <!-- finishes off the container div -->\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
      out.write(" \n");
      out.write("    <!-- Master page contains div tags: JUST ENTER CONTENT!-->");
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
