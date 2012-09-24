package org.apache.jsp.WEB_002dINF.view.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class realUserCreationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
 request.setCharacterEncoding("euc-kr"); 
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel='stylesheet' type='text/css' media='screen' href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("'/>\n");
      out.write("\t<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("'></script>\n");
      out.write("\n");
      out.write("\t<title>User Records</title>\n");
      out.write("\t\n");
      out.write("\t<script type='text/javascript'>\n");
      out.write("\t\n");
      out.write("\tfunction submitNewRecord() {\n");
      out.write("\t\t$.post(urlHolder.add, {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tuserId : $('#newUserId').val(),\n");
      out.write("\t\t\t\tuserName: $('#newUserName').val(),\n");
      out.write("\t\t\t\tpasswd: $('#newPassword').val(),\n");
      out.write("\t\t\t\temail: $('#newEmail').val(),\n");
      out.write("\t\t\t\tintroduction: $('#newIntroduction').val(),\n");
      out.write("\t\t\t\timage: $('#newImage').val(),\n");
      out.write("\t\t\t\tgroup: $('#newGroup').val(),\n");
      out.write("\t\t\t\trole: $('#newRole').val()\n");
      out.write("\t\t\t}, \n");
      out.write("\t\t\tfunction(response) {\n");
      out.write("\t\t\t\tif (response != null) {\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\talert('Success! Record has been added.');\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\talert('Failure! An error has occurred!');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t);\t\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<h1 id='banner'>Counselment Analysis Management System</h1>\n");
      out.write("\t<hr/>\n");
      out.write("\t\n");
      out.write("\t<div id='newForm'>\n");
      out.write("\t\t<form action=\"./userCreate\" method=\"post\">\n");
      out.write("  \t\t\t<fieldset>\n");
      out.write("\t\t\t\t<legend>Create New Record / indivisual </legend>\n");
      out.write("\t\t\t\t<label for='newUserId'>UserID</label><input type='text' id='newUserId'/><br/>\n");
      out.write("\t\t\t\t<label for='newUserName'>Username</label><input type='text' id='newUserName'/><br/>\n");
      out.write("\t\t\t\t<label for='newPassword'>Password</label><input type='password' id='newPassword'/><br/>\n");
      out.write("\t\t\t\t<label for='newEmail'>Email</label><input type='text' id='newEmail'/><br/>\n");
      out.write("\t\t\t\t<label for='newIntroduction'>Introduction</label><input type='text' id='newIntroduction'/><br/>\n");
      out.write("\t\t\t\t<label for='newImage'>Image</label><input type='text' id='newImage'/><br/>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<label for='newGroup'>Group</label>\n");
      out.write("\t\t\t\t\t<select id='newGroup'>\n");
      out.write("\t\t\t\t\t\t<option value='1' selected='selected'>Seoul</option>\n");
      out.write("\t\t\t\t\t\t<option value='2' >Chuncheon</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t<label for='newRole'>Role</label>\n");
      out.write("\t\t\t\t\t<select id='newRole'>\n");
      out.write("\t\t\t\t\t\t<option value='1'>Admin</option>\n");
      out.write("\t\t\t\t\t\t<option value='2' selected='selected'>Regular</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("  \t\t\t</fieldset>\n");
      out.write("\t\t\t<input type='button' value='Close' id='closeNewForm' />\n");
      out.write("\t\t\t<input type='submit' onclick='javascript:submitNewRecord()'/>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/view/account/realUserCreationForm.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/account/userCreate");
    // /WEB-INF/view/account/realUserCreationForm.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("addUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/view/account/realUserCreationForm.jsp(9,61) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/css/style.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/view/account/realUserCreationForm.jsp(10,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/js/jquery-1.6.4.min.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/view/account/realUserCreationForm.jsp(11,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/js/mycustom.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }
}
