package com.zb.javase.bank53;

public class Customer {
 
	private String firstName;
	private String lastName;
	
	private Account [] accounts;
	private int numberOfAccounts;
	
	public Customer(String f,String l){
		firstName=f;
		lastName=l;
		
		accounts =new Account[5];
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}
	
	public void addAccount(Account account){
		accounts[numberOfAccounts]=account;
	}
 
	public Account getAccount(int index){
		return accounts[index];
	}
	
	public int getNumberOfAccounts(){
		return numberOfAccounts;
	}
}