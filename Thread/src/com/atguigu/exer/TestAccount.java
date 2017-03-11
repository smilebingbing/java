package com.atguigu.exer;
/*
 * 银行有一个账户，两个储户分别向同一个账户存3000，每次存1000，存3次，每次存完打印账户余额
 * 
 * 
 * 
 * 1. 是否涉及到多线程！   是，有两个储户（两种方式创建多线程）
 * 2. 是否有共享数据？ 有，同一个账户
 * 3. 得考虑线程的同步（两种方法处理线程的安全）
 * 
 */

class Account{
	double balance;
	
	public Account(){
		
	}
	
	public synchronized void deposit(double amt){
		balance+=amt;
		System.out.println(balance);
	}
}



class Customer extends Thread{
	Account account;
	
	public Customer(Account account){
		this.account=account;
	}
	public void run(){
		for(int i=0;i<3;i++){
			account.deposit(1000);
		}
	}
}



public class TestAccount {

	public static void main(String[] args) {
		
		Account a=new Account();
		Customer c1=new Customer(a);
		Customer c2=new Customer(a);
		
		c1.setName("甲");
		c2.setName("乙");
		
		c1.start();
		c2.start();
	}
	

}
