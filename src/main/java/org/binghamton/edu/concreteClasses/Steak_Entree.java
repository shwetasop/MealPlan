package org.binghamton.edu.concreteClasses;

import org.binghamton.edu.util.Entree;

public class Steak_Entree extends Entree{

	
	public void orderEntree() {
		System.out.print("Steak");
		
	}

	@Override
	public String MealItemname() {
		
		return "Steak";
	}

}
