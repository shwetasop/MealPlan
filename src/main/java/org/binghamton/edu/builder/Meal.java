package org.binghamton.edu.builder;

import java.util.LinkedHashMap;
import java.util.Map;

import org.binghamton.edu.util.Logger;
import org.binghamton.edu.util.MealItemsInterface;

public class Meal {
	
	public Map<String,Integer> orderMap = new LinkedHashMap<String,Integer>();
	public Map<MealItemsInterface,Integer> items= new LinkedHashMap<MealItemsInterface,Integer>();
	
	public void buildMeal(String inputString)
	{
		String[] parseString= inputString.trim().split(",");
		initializeMap(parseString);
	}
	
	public void initializeMap(String parseString[])
	{
		orderMap.put(parseString[0].toLowerCase(), 1);
		for(int i=1;i<parseString.length;i++)
		{
			if(!orderMap.containsKey(parseString[i]))
				orderMap.put(parseString[i], 1);
			else
				orderMap.put(parseString[i], orderMap.get(parseString[i])+1);
			
		}
		for(String s :orderMap.keySet())
		{
			Logger.writeOutput("Key: "+s + "Value: "+ orderMap.get(s), Logger.DebugLevel.CONTENTS_OF_DATASTRUCTURE);
			//System.out.println("Key: "+s + "Value: "+orderMap.get(s));
		}
	}
	
	public void printArray(String parseString[])
	{
		for(String s:parseString)
		{
			Logger.writeOutput(s+",", Logger.DebugLevel.CONTENTS_OF_DATASTRUCTURE);
			//System.out.println(s+",");
		}
	}
	public void showOrderedItems()
	{
		//if its -1 then its an error
		//if > 1 allowed item 
		//if ==1 allowed only one item
		//if ==0 then print at least once
		Logger.writeOutput("Output: ", Logger.DebugLevel.INPUT_OUTPUT);
		Logger.writeOutput("Output: ", Logger.DebugLevel.ONLY_OUTPUT);
		for(MealItemsInterface m : items.keySet())
		{
				
				if(items.get(m)==-1)
				{
					Logger.writeOutput(m.MealItemname()+",", Logger.DebugLevel.INPUT_OUTPUT);
					Logger.writeOutput(m.MealItemname()+",", Logger.DebugLevel.ONLY_OUTPUT);
					//System.out.print(m.MealItemname()+",");
					break;
				}
				else if(items.get(m)>1)
				{
					Logger.writeOutput(m.MealItemname()+"(x"+items.get(m)+")"+",", Logger.DebugLevel.INPUT_OUTPUT);
					Logger.writeOutput(m.MealItemname()+"(x"+items.get(m)+")"+",", Logger.DebugLevel.ONLY_OUTPUT);
					
				//System.out.print(m.MealItemname()+"(x"+items.get(m)+")"+",");	
				}
				else if(items.get(m)==0)
				{
					Logger.writeOutput(m.MealItemname()+","+"Error", Logger.DebugLevel.INPUT_OUTPUT);
					Logger.writeOutput(m.MealItemname()+","+"Error", Logger.DebugLevel.ONLY_OUTPUT);
					//System.out.print(m.MealItemname()+","+"Error");
					break;
				}
				else
				{
					Logger.writeOutput(m.MealItemname()+",", Logger.DebugLevel.INPUT_OUTPUT);
					Logger.writeOutput(m.MealItemname()+",", Logger.DebugLevel.ONLY_OUTPUT);
					//System.out.print(m.MealItemname()+",");
				}
		}
	}
	

}
