package com.atguigu.bookstore.dao;

public interface TradeDAO {

	//向数据表中插入Trade对象
	public abstract void insert(Trade trade);
	
	//根据userId获取和其关联的Trade的集合
	public abstract Set<Trade> getTradesWithUserId(Integer userId);
	
}
