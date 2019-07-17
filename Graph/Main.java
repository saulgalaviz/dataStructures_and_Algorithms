package Graph;

public class Main {
	//-------------------------------------------------------------------
		public static void main(String[] args) 
		{
			String data[] = {"Party", "Hardy", "Large"};
			
			arrayBreadthFirst(data);
			
			System.out.println("\nArray Breadth First Implementation Ends, Linked List Begins\n");
			
		}
		//-------------------------------------------------------------------
		public static void arrayBreadthFirst(String[] data)
		{
			ArrayBreadthFirst arr = new ArrayBreadthFirst();
			
			for(int count = 0; count < data.length; count++)
				arr.addVertex(data[count]);
			
			arr.addEdge(new String[] {"Party", "Hardy"});
			arr.addEdge(new String[] {"Hardy", "Large"});
			
			arr.BreadthFirst();
			
			arr.printBreadthFirst();
		}

}
