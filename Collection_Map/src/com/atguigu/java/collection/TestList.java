package com.atguigu.java.collection;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestList {

	//ArrayList:List的主要实现类
	/*
	 * List中相对于Collection,新增加的方法
	 * void add(int index,Object ele):在制定的索引位置index添加元素lel
	 * boolean addAll
	 * Object get(int index)获取指定索引的元素
	 * int indexOf(Object obj)：返回obj对象在集合中首次出现的位置，没有话，返回-1
	 * int lastIndexOf(Object obj):返回最后一次出现的位置，没有的话，返回-1
	 * Object remove(int index):删除指定索引位置的元素
	 * Object set(int index,Object ele):设置指定索引位置的元素为ele
	 * List subList(int fromIndex,int toIndex):返回从fromindex到toindex结束的子list
	 *              ----------返回左闭右开的List
	 * List常用的方法：增(add(Object obj)) 删((remove)  改(set(int index,Object ele))
	 * 查(get(int index))   插(add(int index,Object obj))
	 * 长度(size())
	 * 
	 * 
	 */
	
	@Test
	public void testList2(){
		List list=new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("GG"));
		System.out.println(list);
		list.add(456);
		System.out.println(list.indexOf(123));
		System.out.println(list.lastIndexOf(456));
		System.out.println(list.indexOf(123)==list.lastIndexOf(123));
		System.out.println(list.indexOf(444));
		
		List list1=list.subList(0,3);
		System.out.println(list1);
	}
	
	
	
	@Test
	public void testList1(){
		List list=new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("GG"));
		System.out.println(list);
		list.add(0,555);
		System.out.println(list);
		Object obj=list.get(1);
		System.out.println(obj);
		list.remove(0);
		System.out.println(list.get(0));
		list.set(0, 111);
		System.out.println(list.get(0));
		
		
		
		
	}
}
