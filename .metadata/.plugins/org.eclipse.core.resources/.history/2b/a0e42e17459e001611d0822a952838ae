package com.zb.javase.bank5;

public class Account {
          
	protected double balance;//在子类中可以直接对这个属性进行访问
	
	public Account(double init_balance){
		balance=init_balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public boolean deposit(double amt){
		balance+=amt;
		return true;
	}
	
	public boolean withdraw(double amt){
		
		if(amt<=balance){
			balance-=amt;
			return true;
		}else{
			return false;
			
		}
		
	}
}
