package com.zb.javase.bank.test;

import com.zb.javase.bank3.Account;
import com.zb.javase.bank3.Customer;

public class TestBanking3 {

  public static void main(String[] args) {
    Customer customer=null;
    Account  account=null;
    
    account=new Account(500);
    customer=new Customer("Jane","Smith");
    customer.setAccount(account);
    // Create an account that can has a 500.00 balance.
    System.out.println("Creating the customer Jane Smith.");
	//code 
    System.out.println("Creating her account with a 500.00 balance.");
    
	//code
    // Perform some account transactions
    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
    System.out.println("Deposit 22.50: " + account.deposit(22.50));
    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));

    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + account.getBalance());
  }
}