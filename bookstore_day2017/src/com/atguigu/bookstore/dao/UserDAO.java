package com.atguigu.bookstore.dao;

public interface UserDAO {

	//根据用户名获取User对象
	public abstract User getUser(String username);
}
