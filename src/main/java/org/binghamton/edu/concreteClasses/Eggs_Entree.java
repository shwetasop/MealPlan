package org.binghamton.edu.concreteClasses;

import org.binghamton.edu.util.Entree;

public class Eggs_Entree extends Entree{
	
	public void orderEntree() {
		System.out.print("Eggs");
		
	}

	@Override
	public String MealItemname() {
		
		return "Eggs";
	}

}
