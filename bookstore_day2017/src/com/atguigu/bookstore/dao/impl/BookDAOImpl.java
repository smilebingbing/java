package com.atguigu.bookstore.dao.impl;

import java.util.Collection;
import java.util.List;

import com.atguigu.bookstore.dao.BookDao;
import com.atguigu.bookstore.domain.Book;
import com.atguigu.bookstore.domain.ShoppingCartItem;
import com.atguigu.bookstore.web.CriteriaBook;
import com.atguigu.bookstore.web.Page;

public class BookDAOImpl extends BaseDAO<Book> implements BookDao {

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		String sql="select ID,AUTHOR,TITLE,PRICE,PUBLISHINGDATE,"+
		"SALES_AMOUNT,STORE_NUMBER,REMARK from book_table where id=?";
		return query(sql,id);
	}

	@Override
	public Page<Book> getPage(CriteriaBook cb) {
		// TODO Auto-generated method stub
		Page page=new Page<>(cb.getPageNo());
		
		page.setTotalItemNumber(getTotalBookNumber(cb));
		page.setList(getPageList(cb, 3));
		return page;
	}

	@Override
	public long getTotalBookNumber(CriteriaBook cb) {
		// TODO Auto-generat ed method stub
		String sql="select ID,AUTHOR,TITLE,PRICE,PUBLISHINGDATE,"+
				"SALES_AMOUNT,STORE_NUMBER,REMARK from book_table where price>=? and price<=?";
		return getSingleVal(sql, cb.getMinPrice(),cb.getMaxPrice());
	}

	@Override
	public List<Book> getPageList(CriteriaBook cb, int pageSize) {
		// TODO Auto-generated method stub
		String sql="select ID,AUTHOR,TITLE,PRICE,PUBLISHINGDATE,"+
				"SALES_AMOUNT,STORE_NUMBER,REMARK from book_table where id=?"+
				"limit ?,?";
		return queryForList(sql,cb.getMinPrice(),cb.getMaxPrice(),
				(cb.getPageNo()-1)*pageSize,pageSize);
	}

	@Override
	public int getStoreNumber(Integer id) {
		// TODO Auto-generated method stub
		String sql="select STORE_NUMBER from book_table where id=?";
		return getSingleVal(sql, id);
	}

	@Override
	public void batchUpdateStoreNumberAndSalesAmount(Collection<ShoppingCartItem> items) {
		// TODO Auto-generated method stub
		
	}



}
