package com.naidachang.week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4 {

	static Map <Integer, String> employeeMap = new HashMap <Integer, String>();
	public static void main(String[] args) {

//	Create an instance of an ArrayList of String called employeeNames
		
			List <String> employeeNames = new ArrayList <String>();
			
			employeeNames.add("Mary");
			employeeNames.add("Cindy");
			employeeNames.add("Naida");
			employeeNames.add("Joanna");
			employeeNames.add("Susan");
			
				System.out.println(employeeNames);

//	Create an instance of a HashSet of Integer called ids 
				
			Set <Integer> ids = new HashSet <Integer>();
				
			ids.add(123);
			ids.add(456);
			ids.add(789);
			ids.add(1011);
			ids.add(1213);
				
				System.out.println(ids);
				
//	Create an instance of a HashMap of Integer, String called employeeMap 			
//	Create a variable int i = 0; then iterate over ids using an enhanced for loop.
//	Inside the enhanced for loop use employeeMap.put() to add a new entry to the map.
//	The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList.
//	Increment i so that each iteration grabs the next element in the ArrayList. 	
							
			Map <Integer, String> employeeMap = new HashMap <Integer, String>();
					
			int i = 0;
					
			for (Integer id : ids){
			employeeMap.put(id, employeeNames.get(i));
			i++;
	}
				
				System.out.println(employeeMap.entrySet());
				
//	use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map. 

			Set <Integer> idKeys = employeeMap.keySet();
				
			for (Integer key : employeeMap.keySet()){
				
				System.out.println(key + ":" + employeeMap.get(key));
		}
			
//	Create a StringBuilder called idsBuilder
//	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder
					
			StringBuilder newStr = new StringBuilder();
			for (Integer id : ids){
				newStr.append(id + " - ");
		}
				
			String finishedString = newStr.toString();
				
				System.out.println(finishedString);
				
//	Create another StringBuilder called namesBuilder. 
//	Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder. 
						
			StringBuilder newerStr = new StringBuilder();
					
			for (String names : employeeNames) {
				newerStr.append(names + " ");
		}
					
			String finishedNewerString = newerStr.toString();
					
				System.out.println(finishedNewerString);
	}

}
