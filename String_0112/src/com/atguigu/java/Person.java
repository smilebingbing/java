package com.atguigu.java;
@MyAnnotation(value="atguigu")
public class Person extends Creature<String> implements Comparable,MyInterface{

	public String name;
	private int age;
	int  id;
	//尽量创建一个空参构造器
	public Person() { 
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@MyAnnotation(value="abc123")
	public void show(){
		System.out.println("I am a person");
	}
	
	public void display(String nation){
		System.out.println("我的国籍是"+nation);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void info(){
		System.out.println("中国人");
	}
}
