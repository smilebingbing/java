package com.atguigu.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

public class TestCollection {
	
	@Test
	public void testCollection3(){
		Collection coll=new ArrayList();
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM",23));
		
		Collection coll1=new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		//11.equals(Object obj):判断两个集合中的元素是否完全相同
		Collection coll2=new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		System.out.println(coll1.equals(coll2));
		//12.hashCode():
		System.out.println(coll.hashCode());
		System.out.println();
		//13.toArray():将集合转化为数组
		Object[] obj=coll.toArray();
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}
		System.out.println();
		//14. iterator():返回一个Iterator接口实现类的对象,进而实现集合的遍历
		Iterator iterator=coll.iterator();
		//方式一：不用
		//System.out.println(iterator.next());
		//方式二：不用
		//for(int i=0;i<coll.size();i++){
			//System.out.println(iterator.next());
		//}
		//方式三：使用
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
	
	
	
	@Test
	public void testCollection2(){
		Collection coll=new ArrayList();
		System.out.println(coll.size());
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		Person p=new Person("kelly",24);
		coll.add(p);
		coll.add(new Person("MM",23));
		System.out.println(coll);
		//6.contains(Object obj):判断集合中是否包含指定的obj元素，如果包含，返回true,不包含，返回false
		//判断的依据：根据元素所在的类的equals()方法进行判断
		//明确：如果存入集合中的元素是自定义的对象，要求：自定义类要重写equals()方法
		boolean b1=coll.contains(123);
		b1=coll.contains("AA");
		System.out.println(b1);
		boolean b2=coll.contains(p);
		System.out.println(b2);
		//7. containsAll(Collection coll):判断当前集合中是否包含coll中所有的元素
		Collection coll1=new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		
		boolean b3=coll.containsAll(coll1);
		System.out.println("#"+b3);
		coll1.add(456);
		//8. retainAll(Collection coll):求当前集合与coll的共有的元素，返回给当前集合
		coll.retainAll(coll1);
		//9. remove(Object obj):删除集合中的obj元素，若删除成功，返回true,否则，返回false
		boolean b4=coll.remove("BB");
		System.out.println(b4);
		//10. removeAll(Collection coll):从当前集合中删除包含在coll中的元素
		coll.removeAll(coll1);
	}
	@Test
	public void testCollection1(){
		Collection coll=new ArrayList();
		//1. size(): 返回集合中元素的个数
		System.out.println(coll.size());
		//2. add(Object obj):向集合中添加一个元素
		coll.add(123);
		coll.add("AA");
		coll.add(new Date());
		coll.add("BB");
		System.out.println(coll.size());
		//3. addAll(Collection coll):将形参coll中包含的所有元素添加到当前集合中
		Collection coll1=Arrays.asList(1,2,3);
		coll.addAll(coll1);
		System.out.println(coll.size());
		//查看集合元素
		System.out.println(coll);
		//4. isEmpty():判断集合是否为空
		System.out.println(coll.isEmpty());
		//5. clear():清空集合元素
		coll.clear();
		System.out.println(coll.isEmpty());
		
		
		
		
		
		
		
		
		
	}
}
