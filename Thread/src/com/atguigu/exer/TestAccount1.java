package com.atguigu.exer;


class accountx implements Runnable{
	public void run(){
		
	}
}






public class TestAccount1 {

	accountx a=new accountx();
	
	Thread t1=new Thread(a);
	Thread t2=new Thread(a);
	
	

}
