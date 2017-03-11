package com.atguigu.bookstore.dao;

public interface TradeItemDAO {

	//批量保存TradeItem对象
	public abstract void batchSave(Collection<TradeItem> items);
	
	//根据tradeId获取和其关联的TradeItem的集合
	public abstract Set<TradeItem> getTradeItemsWithTradeId(Integer tradeId);
}
