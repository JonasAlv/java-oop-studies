package com.fastfood.customer;

public class Customer {
	
	public void orderFood() {
		System.out.println("order food");
	}
	
	private void accountBalance() {
		System.out.println("see acc balance");
	}
	
	public void pay() {
		accountBalance();
		System.out.println("Pay the order");
	}
}
