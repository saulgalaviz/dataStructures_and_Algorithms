package LinkedList;

public class CircularLinkedList<E>
{   
	private Node headNode;
	private Node tailNode;
	private int numbOfNodes;
	//-------------------------------------------------------------------
	public CircularLinkedList()
	{
	   headNode = null;
	   tailNode = null;
	   numbOfNodes = 0;
	}
	//-------------------------------------------------------------------
	public void add(E data)
	{
		Node newNode = new Node(data, null);
		headNode = newNode;
		
		if(headNode == null) 
			newNode.setNext(newNode);
		
		else
			tailNode.setNext(headNode);
		

	    numbOfNodes++;
	}
	//-------------------------------------------------------------------
	public void insert(E data, int nodeIndex)
	{
		   Node newNode = new Node(data);
		   
		   boolean breakLoop = false;
		   Node tempNode = headNode;
		   
		   for(int counter = 0; counter < numbOfNodes && !breakLoop; counter++)
		   {
			   if(counter == 0 && counter == nodeIndex)
			   {
				   newNode.setNext(headNode);
				   headNode = newNode;
				   tailNode.setNext(newNode);
				   numbOfNodes++;
				   breakLoop = true;
			   }
			   
			   else if(counter + 1 == nodeIndex)
			   {
				   Node nodeReference = tempNode.getNext();
				   tempNode.setNext(newNode);
				   newNode.setNext(nodeReference);
				   tailNode.setNext(headNode);
				   numbOfNodes++;
				   breakLoop = true;
			   }
			   
			   else
				   tempNode = tempNode.getNext();
		   }
	}
	//-------------------------------------------------------------------
	public E remove()
	{
	   if (headNode != null)
	   {
	      headNode = headNode.getNext();
	      tailNode.setNext(headNode);
	      numbOfNodes--;
	   }
	   
	   return (E) headNode.getData();
	}
	//-------------------------------------------------------------------
	public boolean remove(E data)
	{
		   boolean removed = false;
		   
		   if(headNode != null)
		   {
			   Node tempNode = headNode;
			   for(int counter = 0; counter < numbOfNodes && !removed; counter++)
			   {
				   if(headNode.getData() == data && numbOfNodes == 1)
				   {
					   headNode = null;
					   removed = true;
					   numbOfNodes--;
				   }
				   
				   else if(tempNode.getNext() != null && tempNode.getNext().getData() == data)
				   {
					   tempNode.setNext(tempNode.getNext().getNext());
					   removed = true;
					   numbOfNodes--;
				   }
				   
				   else
					   tempNode = tempNode.getNext();
			   }
		   }
		   
		   return removed;
	}
	//-------------------------------------------------------------------
	public void printLinkedList()
	{
		   Node tempNode = headNode;
		   
		   for(int counter = 0; counter < numbOfNodes; counter++)
		   {
			   System.out.print(tempNode.getData() + " ");
			   tempNode = tempNode.getNext();
		   }
		   
		   System.out.println();
	}
//-------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////
	private class Node<E>
	{
	   private E data;
	   private Node next;
	   //-------------------------------------------------------------------
	   public Node(E data)
	   {
	      this(data, null);
	   }
	   //-------------------------------------------------------------------
	   public Node(E data, Node next)
	   {
	      this.data = data;
	      this.next = next;
	   }
	   //-------------------------------------------------------------------
	   public Node getNext()
	   {
	 	 return next;
	   }
	   //-------------------------------------------------------------------
	   public void setNext(Node next) 
	   {
	 	 this.next = next;
	   }
	   //-------------------------------------------------------------------
	   public E getData()
	   {
	      return data;
	   }
	   //-------------------------------------------------------------------
	}
/////////////////////////////////////////////////////////////////////

}
