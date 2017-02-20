package org.binghamton.edu.driver;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.binghamton.edu.builder.Meal;
import org.binghamton.edu.builder.MealBuilder;
import org.binghamton.edu.builder.MealBuilderInterface;
import org.binghamton.edu.util.Logger;

public class Driver {
	
	public static void main(String args[])
	{
		String line=null;
		MealBuilderInterface mealW= new MealBuilder();
		Meal meal=null;
		
		Logger.setDebugValue(3);
		
		 try {
             FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/classes/Input.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            while((line = bufferedReader.readLine()) != null) {
	            	Logger.writeOutput("", Logger.DebugLevel.INPUT_OUTPUT);
	            	Logger.writeOutput("Input: "+line, Logger.DebugLevel.INPUT_OUTPUT);
	            	//System.out.println();
	                //System.out.println(line);
	               
	                if(line.toLowerCase().contains("morning"))
	                {
	                	meal=mealW.constructLunch(line);
	        			meal.showOrderedItems();
	                }
	        		else if(line.toLowerCase().contains("night"))
	        		{
	        			meal=mealW.constructDinner(line);
	        			meal.showOrderedItems();
	        		}
	        		else
	        			System.err.print("Input Error");
	            }  
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {System.err.print("Unable to open file '" + "Input.txt" + "'"); }
	        catch(IOException ex) {System.err.print("Error reading file '" + "Input.txt" + "'");}
	}

}
