package SortingAlgorithms;

public class MergeSort 
{
	private int[] sortedList, secondList;
	
	public MergeSort(int[] list)
	{
		sortedList = list;
		secondList = new int[list.length - 1];
	}
	
	public void MergeSort(int low, int high)
	{
		if(low < high)
		{
			int mid = (low + high) / 2;
			MergeSort(low, mid);
			MergeSort(mid + 1, high);
			merge(low, mid, high);
		}
		else
			return;
	}
	
	public void merge(int low, int mid, int high)
	{
		int l1, l2, i;
		
		for(l1 = low, l2 = mid, i = low; l1 <= mid && l2 <= high; i++)
		{
			if(sortedList[l1] <= sortedList[l2])
				secondList[i] = sortedList[l1++];
			
			else
				secondList[i] = sortedList[l2++];
		}
		
		while(l1 <= mid)
			secondList[i++] = sortedList[l1++];
		
		while(l2 <= high)
			secondList[i++] = sortedList[l2++];
		
		for(i = low; i <= high; i++)
			sortedList[i] = secondList[i];
	}
	
	public int[] returnList()
	{
		return sortedList;
	}
}
