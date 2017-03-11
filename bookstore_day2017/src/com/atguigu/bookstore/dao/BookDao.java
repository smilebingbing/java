package com.atguigu.bookstore.dao;

import java.util.Collection;
import java.util.List;

import com.atguigu.bookstore.domain.Book;
import com.atguigu.bookstore.domain.ShoppingCartItem;
import com.atguigu.bookstore.web.CriteriaBook;
import com.atguigu.bookstore.web.Page;

public interface BookDao {

	//根据id获取指定的Book对象
	public abstract Book getBook(int id);
	
	//根据传入的CriteriaBook对象返回对应的Page对象
	public abstract Page<Book> getPage(CriteriaBook cb);
	
	//根据传入的CriteriaBook对象返回其对应的记录数
	public abstract long getTotalBookNumber(CriteriaBook cb);
	
	//根据传入的CriteriaBook和pageSize返回当前对应的List
	public abstract List<Book> getPageList(CriteriaBook cb,int pageSize);
	
	//返回指定id的book的storeNumber字段的值
	public abstract int getStoreNumber(Integer id);
	
	//根据传入的ShoppingCartItem的集合，
	//批量更新books数据表的storenumber和salenumber字段的值
	public abstract void batchUpdateStoreNumberAndSalesAmount(Collection<ShoppingCartItem> items);
}
