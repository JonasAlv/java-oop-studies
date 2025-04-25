package com.fastfood.service.kitchen;

public class Chef {
	
	public void cookFood() {
		wash();
		System.out.println("Cooking food");
	}
	
	private void wash() {
		System.out.println("wash items");
	}

}
