package LinkedList;

public class Main 
{
	public static void main(String[] args) 
	{
		String data[] = {"Party", "Hardy", "Large"};
		
		singlyLinkedList(data);
		
		System.out.println("\nSingly Linked List Implementation Ends\n");
	}
	//-------------------------------------------------------------------
	public static void singlyLinkedList(String[] data)
	{
		SingleLinkedList sin = new SingleLinkedList();
		
		for(int counter = 0; counter < data.length; counter++)
			sin.add(data[counter]);
		
		sin.printLinkedList();
		
		sin.insert(55, 2);
		
		sin.printLinkedList();
		
		sin.remove("Hardy");
		
		sin.printLinkedList();
		
		sin.remove("Party");
		
		sin.printLinkedList();
	}
}
