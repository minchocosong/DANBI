package org.apache.jsp.WEB_002dINF.view.charts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kendo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write("<script type='text/javascript' src=\"resources/js/jquery-1.6.4.min.js\"></script>\n");
      out.write("<script type='text/javascript' src=\"resources/js/kendo.all.min.js\"></script>\n");
      out.write("<link href=\"resources/css/kendo.common.css\" rel=\"stylesheet\"\n");
      out.write("\ttype='text/css' media='screen' />\n");
      out.write("<link href=\"resources/css/kendo.default.css\" rel=\"stylesheet\"\n");
      out.write("\ttype='text/css' media='screen' />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t \n");
      out.write("  \t\t <div id=\"window2\" class=\"k-content\" style=\"min-height: 300px\">\n");
      out.write("            <!-- Window HTML -->\n");
      out.write("            <div id=\"chart2\"></div>\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    var window = $(\"#chart2\");\n");
      out.write("\n");
      out.write("                    window.kendoWindow({\n");
      out.write("                        width: \"600px\",\n");
      out.write("                        height: \"420px\",\n");
      out.write("                        title: \"ìë³ ìë´ì í ì¶ì´\",\n");
      out.write("                        actions: [\"Refresh\", \"Maximize\", \"Close\"],\n");
      out.write("                        content: \"resources/content/innerHtml/pieChart.html\"\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
