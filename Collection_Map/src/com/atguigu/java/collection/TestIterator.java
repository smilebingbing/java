package com.atguigu.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;
/*
 * 集合：
 * 	Collection接口
 * 			----List接口:存储有序的，可以重复的元素
 * 					-----ArrayList(主要实现类)   LinkedList(频繁的插入和删除)   Vector(线程安全，古老实现类)
 * 			----Set接口:存储无序的，不可重复的元素
 * 					----HashSet   LinkedHashSet   TreeSet
 * Map接口：存储“键-值”对的数据
 *          -----HashMap  LinkedHashMap   HashTable(子类：Properties)  TreeMap
 */
public class TestIterator {

	//面试题：
	@Test
	public void testFor3(){
		String [] str=new String[] {"AA","BB","DD"};
		for(String i:str){
			i= "MM";//此处i是新定义的局部变量，其值的修改不会对str造成影响
			System.out.println(i);
		}
		
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
	
	
	@Test
	public void testFor2(){
		String [] str=new String[] {"AA","BB","DD"};
		for(int i=0;i<str.length;i++){
			str[i]=i+"";
		}
		
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
	
	
	
	
	
	
	
	//使用增强for循环实现数组的遍历
	@Test
	public void testFor1(){
		String [] str=new String[] {"AA","BB","DD"};
		for(String i:str){
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	//使用增强for循环实现集合的遍历
	@Test
	public void testFor(){
		Collection coll=new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM",23));
		
		for(Object i:coll){
			System.out.println(i);
		}
	}
	
	
	
	//使用迭代器实现集合的遍历
	@Test
	public void test1(){
		Collection coll=new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM",23));
		
		Iterator i=coll.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
