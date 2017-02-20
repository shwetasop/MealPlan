package org.binghamton.edu.builder;

import org.binghamton.edu.concreteClasses.Cake_Dessert;
import org.binghamton.edu.concreteClasses.Coffee_Drink;
import org.binghamton.edu.concreteClasses.DummyClass;
import org.binghamton.edu.concreteClasses.Eggs_Entree;
import org.binghamton.edu.concreteClasses.Potato_Side;
import org.binghamton.edu.concreteClasses.Steak_Entree;
import org.binghamton.edu.concreteClasses.Toast_Side;
import org.binghamton.edu.concreteClasses.Wine_Drink;
import org.binghamton.edu.constants.DinnerMenu;
import org.binghamton.edu.constants.MorningMenu;

public class MealBuilder implements MealBuilderInterface{

	
	@Override
	public Meal constructLunch(String inputString) {
		
		
		Meal meal= new Meal();
		meal.buildMeal(inputString);
	
		for(String s: meal.orderMap.keySet())
		{
			
			if(s.contains(String.valueOf(MorningMenu.EGGS.ordinal()+1)))
			{
				
				if(meal.orderMap.get(s)==1)
					meal.items.put(new Eggs_Entree(), 1);
				else 
					meal.items.put(new Eggs_Entree(), 0); 
			}
			else if(s.contains(String.valueOf(MorningMenu.TOAST.ordinal()+1)))
			{
				if(meal.orderMap.get(s)==1)
					meal.items.put(new Toast_Side(), 1); 
				else
					meal.items.put(new Toast_Side(), 0);
			}
			else if(s.contains(String.valueOf(MorningMenu.COFFEE.ordinal()+1)))
			{
				meal.items.put(new Coffee_Drink(), meal.orderMap.get(s)); 
			}
			else if(!s.contains("morning")) 
			{
				meal.items.put(new DummyClass(), -1); 
			}
		}
		return meal;
	}

	@Override
	public Meal constructDinner(String inputString) {
		
		Meal meal= new Meal();
		meal.buildMeal(inputString);
	
		for(String s: meal.orderMap.keySet())
		{
			//System.out.println(s);
			if(s.contains(String.valueOf(DinnerMenu.STEAK.ordinal()+1)))
			{
				if(meal.orderMap.get(s)==1)
					meal.items.put(new Steak_Entree(), 1);
				else
					meal.items.put(new Steak_Entree(), 0);
			}
			else if(s.contains(String.valueOf(DinnerMenu.POTATO.ordinal()+1)))
			{
				meal.items.put(new Potato_Side(), meal.orderMap.get(s)); 
			}
			else if(s.contains(String.valueOf(DinnerMenu.WINE.ordinal()+1)))
			{
				if(meal.orderMap.get(s)==1)
					meal.items.put(new Wine_Drink(), 1); 
				else
					meal.items.put(new Wine_Drink(), 0);
			}
			else if(s.contains(String.valueOf(DinnerMenu.CAKE.ordinal()+1)))
			{
				if(meal.orderMap.get(s)==1)
					meal.items.put(new Cake_Dessert(), 1);
				else
					meal.items.put(new Cake_Dessert(), 0);
			}
			else if(!s.contains("night"))
			{
				meal.items.put(new DummyClass(), -1); 
			}
			
		}
		return meal;		
	}

}
