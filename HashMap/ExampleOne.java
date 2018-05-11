package HashMap;

import java.util.HashMap;

public class ExampleOne //Given an array of integers, return indices of the two numbers such that they add up to a specific target. We can't use same element twice
{
   public int[] exampleOne(int[] numbers, int target)
   {
      HashMap<Integer, Integer> map = new HashMap<>();
      
      for(int counter = 0; counter < numbers.length; counter++)  
      {
         map.put(numbers[counter], counter);
      }
      
      for(int counter = 0; counter < numbers.length; counter++)
      {
         int value = target - numbers[counter];
         
         if(map.containsKey(value) && map.get(value) != counter)
         {
            return new int[] {counter, map.get(value)};
         }
      }
      
      throw new IllegalArgumentException("There were no two values adding up to the target value!");
   }
}
