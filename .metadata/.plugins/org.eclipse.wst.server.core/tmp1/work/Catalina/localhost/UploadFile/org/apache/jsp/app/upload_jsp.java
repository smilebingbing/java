/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-01-09 01:32:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/scripts/jquery-1.7.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tvar i=2;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#addFile\").click(function(){\r\n");
      out.write("\t\t//1.获取#addFile,并为其添加click响应函数\r\n");
      out.write("\t\t\t$(\"this\").parent().parent().before(\"<tr class='file'><td>File\"\r\n");
      out.write("\t\t\t\t\t+i+\":</td><td><input type='file' name='file\"\r\n");
      out.write("\t\t\t\t\t+i+\"'/></td></tr>\"\r\n");
      out.write("\t\t\t\t\t+\"<tr class'desc'><td>Desc\"\r\n");
      out.write("\t\t\t\t\t+i+\":</td><td><input type='text' name='desc\"\r\n");
      out.write("\t\t\t\t\t+i+\"'/><button id='delete+i+'>删除</button></td></tr>\");\r\n");
      out.write("\t\ti++;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//获取新添加的删除按钮\r\n");
      out.write("\t\t$(\"#delete\"+(i-1)).click(function(){\r\n");
      out.write("\t\t\tvar $tr=$(this).parent().parent();\r\n");
      out.write("\t\t\t$tr.prev(\"tr\").remove();\r\n");
      out.write("\t\t\t$tr.remove();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 对i重写排序\r\n");
      out.write("\t\t\t$(\".file\").each(function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\t\t\r\n");
      out.write("\t\t//2. 利用jQuery 生成以下节点，注意数字的变化，并把它们都加到#br的前面\r\n");
      out.write("\t\t//其中“删除”可以删除当前的file和desc相关节点\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\tFile: <input type=\"file\" name=\"file\"/>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\tDesc: <input type=\"text\" name=\"desc\"/>\r\n");
      out.write("\t\t\t<button>删除</button>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"UploadServlet\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"fileNum\" name=\"fileNum\" value=\"1\"/>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr class=\"file\">\r\n");
      out.write("\t\t\t\t<td >File1:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"file\" name=\"file1\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"desc\">\r\n");
      out.write("\t\t\t\t<td >Desc1:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"desc1\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"提交\" /></td>\r\n");
      out.write("\t\t\t\t<td><button id=\"addFile\">新增一个附件</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}