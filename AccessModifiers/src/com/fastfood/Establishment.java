package com.fastfood;

import com.fastfood.customer.Customer;
import com.fastfood.service.kitchen.Chef;
import com.fastfood.service.kitchen.Warehouse;

public class Establishment {

	public static void main(String[] args) {
		
		Chef chef = new Chef();
		chef.cookFood(); //using wash() inside of cookFood
		//chef.wash();
		
		Warehouse warehouse = new Warehouse();
		warehouse.storeItems();
		
		Customer customer = new Customer();
		customer.orderFood();
		//wrong action because of public access of method
		//only customer should know the "account balance" should use private modifier
		//customer.accountBalance();
		
		customer.pay();//using accountBalance() inside of pay()
		
	}
}
