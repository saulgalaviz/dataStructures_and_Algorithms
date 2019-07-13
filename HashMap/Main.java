package HashMap;

//Possible operations:
//void clear(): It removes all the key and value pairs from the specified Map.
//Object clone(): It returns a copy of all the mappings of a map and used for cloning them into another map.
//boolean containsKey(Object key): It is a boolean function which returns true or false based on whether the specified key is found in the map.
//boolean containsValue(Object Value): Similar to containsKey() method, however it looks for the specified value instead of key.
//Value get(Object key): It returns the value for the specified key.
//boolean isEmpty(): It checks whether the map is empty. If there are no key-value mapping present in the map then this function returns true else false.
//Set keySet(): It returns the Set of the keys fetched from the map.
//value put(Key k, Value v): Inserts key value mapping into the map. Used in the above example.
//int size(): Returns the size of the map – Number of key-value mappings.
//Collection values(): It returns a collection of values of map.
//Value remove(Object key): It removes the key-value pair for the specified key. Used in the above example.
//void putAll(Map m): Copies all the elements of a map to the another specified map.

/////////////////////////////////////////////////////////////////////
public class Main 
{
   //-------------------------------------------------------------------
   public static void main(String[] args) 
   {
//      **Example One** 
//      Given an array of integers, return indices of the two numbers such that they add up to a specific target. We can't use same element twice
//      ----------------------------------------------------------------
//      ExampleOne one = new ExampleOne();
//      int numbers[] = {5, 6, 7, 8, 9};
//      int[] values = one.exampleOne(numbers, 13);
//      for(int counter = 0; counter < values.length; counter++)
//         System.out.print(values[counter] + " ");
      
//    **Example Two** 
//    Given an array of integers, return three values that add up to a specific target. Can't use the same index twice/thrice
//    ----------------------------------------------------------------
      ExampleTwo two = new ExampleTwo();
      int numbers[] = {1, 2, 3, 4, 5};
      int[] values = two.exampleTwo(numbers, 8);
      for(int counter = 0; counter < values.length; counter++)
         System.out.print(values[counter] + " ");
   }
   //-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////