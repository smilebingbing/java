package com.atguigu.bookstore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.bookstore.domain.Book;
import com.atguigu.bookstore.service.BookService;
import com.atguigu.bookstore.web.CriteriaBook;
import com.atguigu.bookstore.web.Page;

public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookService bookService=new BookService();
		
		String pageNoStr=request.getParameter("pageNo");
		String minPriceStr=request.getParameter("minPrice");
		String maxPriceStr=request.getParameter("maxPrice");
		
		int pageNo=1;
		int minPrice=0;
		int maxPrice=Integer.MAX_VALUE;
		
		try {
			pageNo=Integer.parseInt(pageNoStr);
		} catch (NumberFormatException e) {

		
		}
		
		try {
			minPrice=Integer.parseInt(minPriceStr);
		} catch (NumberFormatException e) {

		}
		
		try {
			maxPrice=Integer.parseInt(maxPriceStr);
		} catch (NumberFormatException e) {

		}
		
		CriteriaBook criteriaBook=new CriteriaBook(minPrice,maxPrice,pageNo);
		Page<Book> page=bookService.getPage(criteriaBook);
		
		request.setAttribute("bookpage",page);
		
		request.getRequestDispatcher("/WEB-INF/pages/books.jsp").forward(request, response);;
	}

}
