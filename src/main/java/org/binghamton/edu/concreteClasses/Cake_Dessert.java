package org.binghamton.edu.concreteClasses;

import org.binghamton.edu.util.Dessert;

public class Cake_Dessert extends Dessert{

	@Override
	public void orderDessert() {
		System.out.print("Cake Ordered");
		
	}

	@Override
	public String MealItemname() {
		return "Cake";
	}

}
