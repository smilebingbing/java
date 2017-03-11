package com.atguigu.bookstore.service;

import com.atguigu.bookstore.dao.BookDao;
import com.atguigu.bookstore.dao.impl.BookDAOImpl;
import com.atguigu.bookstore.domain.Book;
import com.atguigu.bookstore.web.CriteriaBook;
import com.atguigu.bookstore.web.Page;

public class BookService {

	private BookDao bookDAO=new BookDAOImpl();
	
	
	public Page<Book> getPage(CriteriaBook criteriaBook){
		return bookDAO.getPage(criteriaBook);
	}
}
