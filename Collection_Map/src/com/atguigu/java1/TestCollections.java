package com.atguigu.java1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/*
 * 操作Collection以及Map的工具类：Collections
 * 
 * 面试题：区分Collection与Collections
 */
public class TestCollections {

	@Test
	public void testCollections(){
		List list=new ArrayList();
		list.add(123);
		list.add(456);
		list.add(12);
		list.add(456);
		list.add(78);
		
		//List list1=new ArrayList();//错误的实现方式
		List list1=Arrays.asList(new Object[list.size()]);
		Collections.copy(list1,list);
		System.out.println(list1);
		
		Object obj=Collections.max(list);
		System.out.println(obj);
		
		int count=Collections.frequency(list, 456);
		System.out.println(count);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.swap(list, 0,2);
		System.out.println(list);
		
		
	}
}
