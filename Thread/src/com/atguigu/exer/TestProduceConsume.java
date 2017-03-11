package com.atguigu.exer;
/*
 * 生产者/消费者问题
 * 
 * 
 * 分析：
 * 1. 是否涉及到多线程的问题？  是       生产者     消费者
 * 2. 是否涉及到共享数据？        是          考虑线程安全问题
 * 3. 此共享数据是谁？     即为产品的数量
 * 4. 是否涉及到线程通信问题？        存在着生产者和消费者的通信
 */


class Clerk{//店员
	int product;
	
	public synchronized void addProduct( ){//生产产品
		
		if(product>=20){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			product++;
			System.out.println(Thread.currentThread().getName()+"生产了第"+product+"个产品");
			notify();
		}
	}
	
	public synchronized void consumerProduct(){//消费产品
		if(product<=0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println(Thread.currentThread().getName()+"消费了第"+product+"个产品");
			product--;
			notify();
		}
	}
	
}


class Producer implements Runnable{
	Clerk clerk;
	public Producer( Clerk clerk){
		this.clerk=clerk;
	}
	
	public void run(){
		System.out.println("生产者生产产品");
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			clerk.addProduct();
		}
	}
}


class Consumer implements Runnable{
	Clerk clerk;
	public Consumer(Clerk clerk){
		this.clerk=clerk;
	}
	
	public void run(){
		System.out.println("消费者消费产品");
		while(true){
			clerk.consumerProduct();
		}
	}
	
}

public class TestProduceConsume {

	public static void main(String[] args) {
		Clerk c=new Clerk();
		Consumer c1=new Consumer(c);
		Producer p1=new Producer(c);
		Thread t1=new Thread(c1);
		Thread t2=new Thread(p1);
		
		t1.setName("消费者");
		t2.setName("生产者");
		
		t1.start();
		t2.start();
	}
}
