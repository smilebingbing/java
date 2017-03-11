package com.atguigu.bookstore.dao;

public interface AccountDao {

	//根据accountId获取对应的Account对象
	public abstract Account get(Integer accountId);
	
	//根据传入的accountId,amount更新指定账户的余额：扣除amount指定的钱数
	
	public abstract void updateBalance(Integer accountId,float amount);
	
}
