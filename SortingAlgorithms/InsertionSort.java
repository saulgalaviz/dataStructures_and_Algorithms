package SortingAlgorithms;

public class InsertionSort 
{
	private int[] sortedList;
	
	public int[] InsertionSort(int[] list)
	{
		sortedList = list;
		
		int valueToInsert;
		int holePosition;
		
		for(int counter = 1; counter < list.length; counter++)
		{
			valueToInsert = sortedList[counter];
			holePosition = counter;
			
			while(holePosition > 0 && sortedList[holePosition - 1] > valueToInsert)
			{
				sortedList[holePosition] = sortedList[holePosition - 1];
				holePosition = holePosition - 1;
			}
			
			sortedList[holePosition] = valueToInsert;
		}
		
		return sortedList;
	}
}
