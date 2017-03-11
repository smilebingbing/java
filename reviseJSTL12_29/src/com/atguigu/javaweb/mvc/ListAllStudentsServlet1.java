package com.atguigu.javaweb.mvc;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListAllStudentsServlet1
 */
public class ListAllStudentsServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		
		  StudentDao studentDao = new StudentDao();
		  List<Student> students =studentDao.getAll();
		  
		  request.setAttribute("students",students);
		  
		  request.getRequestDispatcher("/students.jsp").forward(request, response);
		  
		  
	}

}
