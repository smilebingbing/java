package zz.firstprag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out=response.getWriter();
    	String userName=request.getParameter("userName");
    	String password=request.getParameter("password");
    	out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
    	out.println("<HTML>");
    	out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
    	out.println("<BODY>");
    	if("caterpillar".equals(userName)&&"123456".equals(password)){
    		out.println("��½�ɹ�");
    	}else{
    		out.println("��¼ʧ�ܣ�<br/>");
    		out.println("<a href='../index.jsp'>����</a>");
    	}
    	out.println("</BODY>");
    	out.println("</HTML>");
    	out.flush();
    	out.close();
    }

	

}