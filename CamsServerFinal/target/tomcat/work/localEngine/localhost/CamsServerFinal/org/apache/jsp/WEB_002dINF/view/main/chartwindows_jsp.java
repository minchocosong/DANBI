package org.apache.jsp.WEB_002dINF.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chartwindows_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/main/./header.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write("<script type='text/javascript' src=\"resources/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type='text/javascript' src=\"resources/js/kendo.web.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/stickies.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/kendo.dataviz.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/kendo.dataviz.chart.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/basicstyle.css\" type=\"text/css\">\n");
      out.write("<link href=\"resources/css/kendo.common.min.css\" rel=\"stylesheet\" type='text/css' media='screen' />\n");
      out.write("<link href=\"resources/css/kendo.default.min.css\" rel=\"stylesheet\" type='text/css' media='screen' />\n");
      out.write("<link href=\"resources/css/kendo.dataviz.min.css\" rel=\"stylesheet\" type='text/css' media='screen' />\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"resources/css/stickies.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<script type=\"resources/content/data/people.js\"></script>\n");
      out.write("\t<header id=\"page_header\">\n");
      out.write("\t<div style=\"float: right;\">\n");
      out.write("\t\t<a href=\"#\">minchoco</a><input type=\"button\" value=\"logout\" onclick=\"location.href='/CamsServerFinal/index'\">\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\t\t<h1>\n");
      out.write("\t\t\t<img src=\"resources/content/images/sample_image.gif\" border=\"1\"\n");
      out.write("\t\t\t\twidth=\"70\" height=\"50\"> &nbsp;&nbsp;&nbsp; <a href=\"main\">The\n");
      out.write("\t\t\t\ttitle of organization</a> &nbsp;&nbsp;&nbsp; <input type=\"text\" size=\"5\">\n");
      out.write("\t\t\t<input type=\"button\" value=\"find\">\n");
      out.write("\t\t</h1>\n");
      out.write("\t</div>\n");
      out.write("\t<div style=\"float: right;\">\n");
      out.write("\t\t<button id=\"newNoteButton\" onClick=\"newNote()\" style=\"height: 40px\">New Note</button>\n");
      out.write("\t\t<script> \n");
      out.write("document.getElementById(\"newNoteButton\").disabled = !db;\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"Menu\" class=\"k-content\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"demo-section\">\n");
      out.write("\t\t\t<div id=\"menu-images\" style=\"width: 1200px\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t\t$(\"#menu-images\").kendoMenu({\n");
      out.write("\t\t\t\t\tdataSource : [ {\n");
      out.write("\t\t\t\t\t\ttext : \"상담 관리\",\n");
      out.write("\t\t\t\t\t\timageUrl : \"resources/content/menu/baseball.png\",url: \"/CamsServerFinal/list\",\n");
      out.write("\t\t\t\t\t\titems : [ {\n");
      out.write("\t\t\t\t\t\t\ttext : \"상담일지 검색\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/star.png\",url: \"/CamsServerFinal/list\",\n");
      out.write("\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\ttext : \"상담일지 추가\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/photo.png\"\n");
      out.write("\t\t\t\t\t\t},{\n");
      out.write("\t\t\t\t\t\t\ttext : \"상담일지 메모\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/photo.png\",url: \"/CamsServerFinal/record\",\n");
      out.write("\t\t\t\t\t\t} ]\n");
      out.write("\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\ttext : \"내담자 관리\",\n");
      out.write("\t\t\t\t\t\timageUrl : \"resources/content/menu/golf.png\",\n");
      out.write("\t\t\t\t\t\titems : [ {\n");
      out.write("\t\t\t\t\t\t\ttext : \"내담자 검색\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/star.png\"\n");
      out.write("\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\ttext : \"내담자 추가/관리\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/photo.png\"\n");
      out.write("\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\ttext : \"가해자 검색\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/video.png\"\n");
      out.write("\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\ttext : \"가해자 추가/관리\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/speaker.png\"\n");
      out.write("\t\t\t\t\t\t} ]\n");
      out.write("\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\ttext : \"분석\",\n");
      out.write("\t\t\t\t\t\timageUrl : \"resources/content/menu/swimming.png\", url: \"/CamsServerFinal/window\",\n");
      out.write("\t\t\t\t\t},  {\n");
      out.write("\t\t\t\t\t\ttext : \"통계\",\n");
      out.write("\t\t\t\t\t\timageUrl : \"resources/content/menu/swimming.png\", url: \"/CamsServerFinal/window\",\n");
      out.write("\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\ttext : \"Admin\",\n");
      out.write("\t\t\t\t\t\timageUrl : \"resources/content/menu/snowboarding.png\",url: \"/CamsServerFinal/admin\",\n");
      out.write("\t\t\t\t\t\titems : [ {\n");
      out.write("\t\t\t\t\t\t\ttext : \"사용자 관리\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/photo.png\"\n");
      out.write("\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\ttext : \"상담일지 설정\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/video.png\",\n");
      out.write("\t\t\t\t\t\t\turl : \"enrollPaper.html\"\n");
      out.write("\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\ttext : \"환경설정\",\n");
      out.write("\t\t\t\t\t\t\timageUrl : \"resources/content/menu/video.png\"\n");
      out.write("\t\t\t\t\t\t} ]\n");
      out.write("\t\t\t\t\t} ]\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<hr>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t<div id=container>\n");
      out.write("\t\t<div id=\"window1\" class=\"k-content\" style=\"min-height: 420px\">\n");
      out.write("\t\t\t<!-- Window HTML -->\n");
      out.write("\t\t\t<div id=\"chart1\"></div>\n");
      out.write("\t\t\t<script>\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    var window = $(\"#chart1\");\n");
      out.write("                    window.kendoWindow({\n");
      out.write("                        width: \"1200px\",\n");
      out.write("                        height: \"420px\",\n");
      out.write("                        title: \"월별 상담유형 추이\",\n");
      out.write("                        actions: [\"Refresh\", \"Maximize\", \"Close\"],\n");
      out.write("                        content: \"resources/content/innerHtml/lineChart.html\"\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div id=\"window2\" class=\"k-content\" style=\"min-height: 300px\">\n");
      out.write("\t\t\t<!-- Window HTML -->\n");
      out.write("\t\t\t<div id=\"chart2\"></div>\n");
      out.write("\t\t\t<script>\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    var window = $(\"#chart2\");\n");
      out.write("\n");
      out.write("                    window.kendoWindow({\n");
      out.write("                        width: \"600px\",\n");
      out.write("                        height: \"300px\",\n");
      out.write("                        title: \"연령대별 상담유형 추이\",\n");
      out.write("                        actions: [\"Refresh\", \"Maximize\", \"Close\"],\n");
      out.write("                        content: \"resources/content/innerHtml/pieChart.html\"\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"window3\" class=\"k-content\" style=\"min-height: 300px\">\n");
      out.write("\t\t\t<!-- Window HTML -->\n");
      out.write("\t\t\t<div id=\"chart3\"></div>\n");
      out.write("\t\t\t<script>\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    var window = $(\"#chart3\");\n");
      out.write("\n");
      out.write("                    window.kendoWindow({\n");
      out.write("                        width: \"600px\",\n");
      out.write("                        height: \"300px\",\n");
      out.write("                        title: \"어쩌고저쩌고 추이\",\n");
      out.write("                        actions: [\"Refresh\", \"Maximize\", \"Close\"],\n");
      out.write("                        content: \"resources/content/innerHtml/multiChart.html\"\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
