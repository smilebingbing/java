package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class TestObjectInputOutputStream {
	//反序列化过程：将硬盘中的文件通过ObjectInputStream转换为相应的对象
	@Test
	public void testObjectInputStream(){
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream("person.txt"));
			Person p1=(Person)ois.readObject();
			System.out.println(p1);
			Person p2=(Person)ois.readObject();
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

	//对象的序列化过程：将内存中的对象通过ObjectOutputStream转换成二进制流，存储在硬盘文件中
	@Test
	public void TestObjectOutputStream(){
		Person p1=new Person("小米",23);
		Person p2=new Person("红米",21);
		
		ObjectOutputStream oos=null;
		try {
			 oos=new ObjectOutputStream(new FileOutputStream("person.txt"));
			
			oos.writeObject(p1);
			oos.flush();
			oos.writeObject(p2);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
/*
 * 要实现序列化：1.要求此类是可序列化的：实现Serializable接口
 * 2.要求类的属性同样的要实现Serializable接口
 */
class Person implements Serializable{
	String name;
	Integer age;
	
	public Person(String name,Integer age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
