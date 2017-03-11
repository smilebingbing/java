package com.atguigu.bookstore.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.atguigu.bookstore.dao.BookDao;
import com.atguigu.bookstore.dao.impl.BookDAOImpl;
import com.atguigu.bookstore.domain.Book;

public class BookDAOTest {

	private BookDao bookDAO=new BookDAOImpl();
	
	@Test
	public void testGetBook() {

	Book book=bookDAO.getBook(1);
	System.out.println(book);
	}

	@Test
	public void testGetPage() {
		
	}

	@Test
	public void testGetTotalBookNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPageList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStoreNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatchUpdateStoreNumberAndSalesAmount() {
		fail("Not yet implemented");
	}

}
