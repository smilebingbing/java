package com.atguigu.bookstore.test;

import static org.junit.Assert.fail;

import java.sql.Date;

import org.junit.Test;

import com.atguigu.bookstore.dao.impl.BaseDAO;
import com.atguigu.bookstore.dao.impl.BookDAOImpl;

public class BaseDAOTest {

	private BookDAOImpl bookDAOImpl=new BookDAOImpl();
	
	@Test
	public void testInsert() {
		String sql="insert into trade_table (USER_ID,TRADE_TIME) values(? ,?)"; 
		long id=bookDAOImpl.insert(sql,1,new Date(new java.util.Date().getTime()));
		
		System.out.println(id);
	}

	@Test
	public void testUpdate() {

		
		String sql="update book_table set SALESAMOUNT=10 where id=? ";
		bookDAOImpl.update(sql, 10,4);
	}

	@Test
	public void testQuery() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryForList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSingleVal() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatch() {
		fail("Not yet implemented");
	}

}
