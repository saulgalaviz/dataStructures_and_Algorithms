package SortingAlgorithms;

public class SelectionSort 
{
	private int[] sortedList;
	
	public int[] SelectionSort(int[] list)
	{
		sortedList = list;
		
		for(int counter = 0; counter < sortedList.length - 1; counter++)
		{
			int minimum = counter;
			for(int counterY = counter + 1; counterY < sortedList.length; counterY++)
			{
				if(sortedList[counterY] < sortedList[minimum])
					minimum = counterY;
			}
			
			if(minimum != counter)
				swap(sortedList[minimum], sortedList[counter]);
		}
		
		return sortedList;
	}
	
	private void swap(int i, int j) 
	{
		int temp = sortedList[i];
		sortedList[i] = sortedList[j];
		sortedList[j] = temp;
	}
}
