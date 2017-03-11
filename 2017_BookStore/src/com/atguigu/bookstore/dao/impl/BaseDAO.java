package com.atguigu.bookstore.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.atguigu.bookstore.dao.Dao;

public class BaseDAO<T> implements Dao {

	private QueryRunner queryRunner=new QueryRunner();
	
	@Override
	public long insert(String sql, Object... args) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(String sql, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object query(String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List queryForList(String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getSingleVal(String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void batch(String sql, Object[]... params) {
		// TODO Auto-generated method stub
		
	}

	
}
