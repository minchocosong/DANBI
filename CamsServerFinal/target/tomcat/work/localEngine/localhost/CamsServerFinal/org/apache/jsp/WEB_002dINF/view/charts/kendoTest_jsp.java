package org.apache.jsp.WEB_002dINF.view.charts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kendoTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<div id=\"example\" class=\"k-content\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"chart-wrapper\">\n");
      out.write("\t\t\t<div id=\"chart\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t var stocksDataSource = new kendo.data.DataSource({\n");
      out.write("                    transport: {\n");
      out.write("                        read: {\n");
      out.write("                            url: function() {\n");
      out.write("                                return \"resources/content/dataviz/dashboards/simpletest.json\";\n");
      out.write("                            },\n");
      out.write("                            dataType: \"json\"\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    group: {\n");
      out.write("                        field: \"type\"\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    sort: {\n");
      out.write("                        field: \"date\",\n");
      out.write("                        dir: \"asc\"\n");
      out.write("                    },\n");
      out.write("                });\n");
      out.write("                function createChart() {\n");
      out.write("                    $(\"#chart\").kendoChart({\n");
      out.write("                        theme: $(document).data(\"kendoSkin\") || \"default\",\n");
      out.write("                        title: { text: \"Test Prices\" },\n");
      out.write("                        dataSource: stocksDataSource,\n");
      out.write("                        series: [{\n");
      out.write("                            type: \"line\",\n");
      out.write("                            field: \"value\",\n");
      out.write("                            name: \"value\",\n");
      out.write("                            groupNameTemplate: \"#= group.value # \"\n");
      out.write("                        }],\n");
      out.write("                        legend: {\n");
      out.write("                            position: \"bottom\"\n");
      out.write("                        },\n");
      out.write("                        valueAxis: {\n");
      out.write("                            labels: {\n");
      out.write("                                format: \"{0}\",\n");
      out.write("                                skip: 2,\n");
      out.write("                                step: 2\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        categoryAxis: {\n");
      out.write("                            field: \"date\",\n");
      out.write("                            labels: {\n");
      out.write("                                template : \"#=value# Month\"\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        tooltip: {\n");
      out.write("                            visible: true,\n");
      out.write("                            format: \"{0}\"\n");
      out.write("                        },\n");
      out.write("                        chartArea:{\n");
      out.write("                        \twidth : 1200,\n");
      out.write("                        \theight :400\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    setTimeout(function() {\n");
      out.write("                        // Initialize the chart with a delay to make sure\n");
      out.write("                        // the initial animation is visible\n");
      out.write("                        createChart();\n");
      out.write("\n");
      out.write("                        $(\"#example\").bind(\"kendo:skinChange\", function(e) {\n");
      out.write("                            createChart();\n");
      out.write("                        });\n");
      out.write("                    }, 400);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("            </script>\n");
      out.write("             \n");
      out.write("\t</div>\n");
      out.write("\n");
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
