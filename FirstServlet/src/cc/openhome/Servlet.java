package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out=response.getWriter();
    	Calendar cal=Calendar.getInstance();
    	int hour=Calendar.HOUR;
    	int minute=Calendar.MINUTE;
    	String remoteIp=request.getRemoteAddr();
    	String select=request.getParameter("select");
    	out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
    	out.println("<HTML>");
    	out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
    	out.println("<BODY>");
    	out.println("�û���"+hour+"��"+minute+"�֣���"+remoteIp+"������������<br/>");
    	out.println("��ѯ�ַ���Ϊ��"+select);
    	out.println("</BODY>");
    	out.println("</HTML>");
    	out.flush();
    	out.close();
    	
    	
    }

	

}