package org.binghamton.edu.concreteClasses;

import org.binghamton.edu.util.Drink;

public class Wine_Drink extends Drink{

	@Override
	public void orderDrink() {
		System.out.print("Wine");
		
	}

	@Override
	public String MealItemname() {
		
		return "Wine";
	}

}
