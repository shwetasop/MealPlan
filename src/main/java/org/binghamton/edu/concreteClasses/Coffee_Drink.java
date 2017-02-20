package org.binghamton.edu.concreteClasses;

import org.binghamton.edu.util.Drink;

public class Coffee_Drink extends Drink {

	@Override
	public void orderDrink() {
		System.out.print("Coffee");
		
	}

	@Override
	public String MealItemname() {
		
		return "Coffee";
	}

}
