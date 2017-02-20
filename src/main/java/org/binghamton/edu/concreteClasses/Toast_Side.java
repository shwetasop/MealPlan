package org.binghamton.edu.concreteClasses;

import org.binghamton.edu.util.Side;

public class Toast_Side extends Side {

	@Override
	public void orderSide() {
		System.out.print("Toast");
	}

	@Override
	public String MealItemname() {
		
		return "Toast";
	}

}
