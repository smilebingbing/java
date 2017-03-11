package com.atguigu.bookstore.dao;

import com.atguigu.bookstore.domain.Book;

public interface BookDao {

	/*
	 * 根据id获取指定Book对象
	 * @param id
	 * @return
	 */
	public abstract Book getBook(int id);
	
	/*
	 * 根据传入的CriteriaBook对象返回对应的Page对象
	 */
}
