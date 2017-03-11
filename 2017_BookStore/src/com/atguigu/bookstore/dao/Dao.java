package com.atguigu.bookstore.dao;

import java.util.List;

/*
 * Dao接口：定义Dao的基本操作，由BaseDao提供实现
 * 
 */
public interface Dao<T> {

	/*
	 * 执行insert操作，返回插入后的记录的id
	 * @param sql:待执行的SQL语句
	 * @param args:填充占位符的可变参数
	 * @return:插入新记录的id
	 */
	long insert(String sql,Object...args);
	/*
	 * 执行update操作，包括insert(但是没有返回值),update,delete
	 * @param sql:待执行的SQL语句
	 * @param args: 填充占位符的可变参数
	 */
	void update(String sql,Object...args);
	/*
	 * 执行单条记录的查询操作，返回与记录对应的类的一个对象
	 */
	
	T query(String sql,Object...args);
	/*
	 * 执行多条记录的查询操作，返回与记录对应的类的一个List
	 * 
	 */
	List<T> queryForList(String sql,Object...args);
	/*
	 * 执行一个属性或值的查询操作，例如查询某一条记录的一个字段，或者查询某个统计信息，返回要查询的值
	 * 
	 */
	<V> V getSingleVal(String sql,Object...args);
	/*
	 * 执行批量更新操作
	 */
	void batch(String sql,Object[]...params);
}
