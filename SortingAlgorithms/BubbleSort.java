package SortingAlgorithms;

public class BubbleSort
{
	private int[] sortedList;
	
	public int[] BubbleSort(int[] list)
	{
		sortedList = list;
		
		for(int counterX = 0; counterX < sortedList.length; counterX++)
		{
			boolean swapped = false;
			
			for(int counterY = 0; counterY < sortedList.length; counterY++)
				if(sortedList[counterY] > sortedList[counterY + 1])
				{
					swap(sortedList[counterY], sortedList[counterY + 1]);
					swapped = true;
				}
			
			if(!swapped)
				break;
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
