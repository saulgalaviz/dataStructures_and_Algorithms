package HashMap;
//Given an array of integers, return three values that add up to a specific target. Can't use the same index twice/thrice

import java.util.HashMap;
/////////////////////////////////////////////////////////////////////
public class ExampleTwo 
{
	//-------------------------------------------------------------------
	public int[] exampleTwo(int[] numbers, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
      
      	for(int counter = numbers.length; counter > 1; counter--)
      		map.put(counter, numbers[counter] + numbers[counter - 1]);
      
      	for(int counter = 0; counter < numbers.length; counter++)
      	{
      		int marker = target - numbers[counter];
         
      		if(map.containsValue(marker))
      			return new int[] {};
      	}
      
    throw new IllegalArgumentException("Coudln't find three values that added up to the specified target!");
	}
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////