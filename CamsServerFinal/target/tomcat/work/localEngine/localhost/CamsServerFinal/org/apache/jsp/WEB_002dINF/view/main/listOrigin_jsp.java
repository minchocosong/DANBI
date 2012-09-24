package org.apache.jsp.WEB_002dINF.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listOrigin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script type='text/javascript' src=\"resources/js/jquery.min.js\"></script>\n");
      out.write("<script type='text/javascript' src=\"resources/js/kendo.web.min.js\"></script>\n");
      out.write("<link href=\"resources/css/kendo.common.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype='text/css' media='screen' />\n");
      out.write("<link href=\"resources/css/kendo.default.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype='text/css' media='screen' />\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"list\" class=\"k-content\">\n");
      out.write("            <div id=\"grid\"></div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                var products = [ {\n");
      out.write("                    \"ProductID\": 1,\n");
      out.write("                        \"ProductName\": \"Chai\",\n");
      out.write("                        \"CategoryID\": 1,\n");
      out.write("                        \"UnitPrice\": \"18.00\"\n");
      out.write("                }, {\n");
      out.write("                    \"ProductID\": 2,\n");
      out.write("                        \"ProductName\": \"Chang\",\n");
      out.write("                        \"CategoryID\": 1,\n");
      out.write("                        \"UnitPrice\": \"19.00\"\n");
      out.write("                }, {\n");
      out.write("                    \"ProductID\": 3,\n");
      out.write("                        \"ProductName\": \"Aniseed Syrup\",\n");
      out.write("                        \"CategoryID\": 2,\n");
      out.write("                        \"UnitPrice\": \"10.00\"\n");
      out.write("                }, {\n");
      out.write("                    \"ProductID\": 4,\n");
      out.write("                        \"ProductName\": \"Chef Anton's Cajun Seasoning\",\n");
      out.write("                        \"CategoryID\": 2,\n");
      out.write("                        \"UnitPrice\": \"22.00\"\n");
      out.write("                }, {\n");
      out.write("                    \"ProductID\": 5,\n");
      out.write("                        \"ProductName\": \"Chef Anton's Gumbo Mix\",\n");
      out.write("                        \"CategoryID\": 2,\n");
      out.write("                        \"UnitPrice\": \"21.35\"\n");
      out.write("                }, {\n");
      out.write("                    \"ProductID\": 6,\n");
      out.write("                        \"ProductName\": \"Grandma's Boysenberry Spread\",\n");
      out.write("                        \"CategoryID\": 2,\n");
      out.write("                        \"UnitPrice\": \"25.00\"\n");
      out.write("                }];\n");
      out.write("\n");
      out.write("                var categories = [{\n");
      out.write("                    \"value\": 1,\n");
      out.write("                    \"text\": \"Beverages\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 2,\n");
      out.write("                    \"text\": \"Condiments\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 3,\n");
      out.write("                    \"text\": \"Confections\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 4,\n");
      out.write("                    \"text\": \"Dairy Products\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 5,\n");
      out.write("                    \"text\": \"Grains/Cereals\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 6,\n");
      out.write("                    \"text\": \"Meat/Poultry\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 7,\n");
      out.write("                    \"text\": \"Produce\"\n");
      out.write("                },{\n");
      out.write("                    \"value\": 8,\n");
      out.write("                    \"text\": \"Seafood\"\n");
      out.write("                }];\n");
      out.write("\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    var dataSource = new kendo.data.DataSource({\n");
      out.write("                       pageSize: 30,\n");
      out.write("                       data: products,\n");
      out.write("                       autoSync: true,\n");
      out.write("                       schema: {\n");
      out.write("                           model: {\n");
      out.write("                             id: \"ProductID\",\n");
      out.write("                             fields: {\n");
      out.write("                                ProductID: { editable: false, nullable: true },\n");
      out.write("                                ProductName: { validation: { required: true } },\n");
      out.write("                                CategoryID: { field: \"CategoryID\" },\n");
      out.write("                                UnitPrice: { type: \"number\", validation: { required: true, min: 1} }\n");
      out.write("                             }\n");
      out.write("                           }\n");
      out.write("                       }\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $(\"#grid\").kendoGrid({\n");
      out.write("                        dataSource: dataSource,\n");
      out.write("                        filterable: true,\n");
      out.write("                        scrollable: false,\n");
      out.write("                        toolbar: [\"create\"],\n");
      out.write("                        columns: [\n");
      out.write("                            { field:\"ProductName\",title:\"Product Name\" },\n");
      out.write("                            { field: \"CategoryID\", width: \"150px\", values: categories, title: \"Category\" },\n");
      out.write("                            { field: \"UnitPrice\", title:\"Unit Price\", format: \"{0:c}\", width: \"150px\" },\n");
      out.write("                            { command: \"destroy\", title: \" \", width: \"110px\" }],\n");
      out.write("                        editable: true\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
