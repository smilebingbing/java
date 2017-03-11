package com.atguigu.java;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class TestConstructor {

	@Test
	public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		String className="com.atguigu.java.Person";
		Class clazz=Class.forName(className);
		//创建对应的运行时类的对象，实际上就是调用了运行时类的空参构造器
		//要想能够创建成功
		//1. 要求对应的运行时类要有空参的构造器
		//2. 构造器的权限修饰符的权限要足够
		Object obj=clazz.newInstance();
		Person p=(Person)obj;
		System.out.println(p);
	}
	
	//调用指定的构造器,创建运行时类的对象
	@Test
	public void test2() throws Exception{
		String className="com.atguigu.java.Person";
		Class clazz=Class.forName(className);
		
		Constructor cons=clazz.getDeclaredConstructor(String.class,int.class);
		cons.setAccessible(true);
		Person p=(Person)cons.newInstance("kelly",25);
		System.out.println(p);
		
		 
	}
}
