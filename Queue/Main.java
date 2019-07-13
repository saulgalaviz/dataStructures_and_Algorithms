package Queue;

public class Main 
{
	//-------------------------------------------------------------------
	public static void main(String[] args) 
	{
		String data[] = {"Party", "Hardy", "Large"};
		
		arrayQueue(data);
		
		System.out.println("\nArray Implementation Ends, Linked List Begins\n");
		
		linkedListQueue(data);
	}
	//-------------------------------------------------------------------
	public static void arrayQueue(String[] data)
	{
		ArrayQueue arr = new ArrayQueue();
		
		for(int count = 0; count < data.length; count++)
		{
			arr.enqueue(data[count]);
		}
		
		System.out.println(arr.peek());
		System.out.println(arr.dequeue());
		arr.enqueue(2);
		System.out.println(arr.dequeue());
		System.out.println(arr.dequeue());
		arr.enqueue("hola");
		System.out.println(arr.dequeue());
	}
	//-------------------------------------------------------------------
	public static void linkedListQueue(String[] data)
	{
		LinkedListQueue ll = new LinkedListQueue();
		
		for(int count = 0; count < data.length; count++)
		{
			ll.enqueue(data[count]);
		}
		
		System.out.println(ll.peek());
		System.out.println(ll.dequeue());
		ll.enqueue(2);
		System.out.println(ll.dequeue());
		System.out.println(ll.dequeue());
		ll.enqueue("hola");
		System.out.println(ll.dequeue());
	}
	//-------------------------------------------------------------------
}
