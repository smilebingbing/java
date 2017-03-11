package com.atguigu.java;
//模拟火车站售票窗口，开启三个窗口售票，总票数为100张
class subThread11 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class subThread22 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class subThread3 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}




public class TestWindow {

	public static void main(String[] args) {
		subThread11 st1=new subThread11();
		subThread22 st2=new subThread22();
		subThread3 st3=new subThread3();
		
		st1.start();
		st2.start();
		st3.start();
	}
}
