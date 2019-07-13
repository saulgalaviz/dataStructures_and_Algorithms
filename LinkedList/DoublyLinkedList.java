package LinkedList;
/////////////////////////////////////////////////////////////////////
public class DoublyLinkedList<E>
{
	private Node lastNode;
	private Node firstNode;
	private int numOfNodes;
	//-------------------------------------------------------------------
	public DoublyLinkedList()
	{
		lastNode = null;
		numOfNodes = 0;
	}
	//-------------------------------------------------------------------
	public void addToBack(E data)
	{
		numOfNodes++;
		
		Node newNode = new Node(data, lastNode, null);
		
		if(lastNode == null)
			firstNode = newNode;
	
		else
			lastNode.setPrev(newNode);
		
		lastNode = newNode;
	}
	//-------------------------------------------------------------------
	public void addToFront(E data)
	{
		numOfNodes++;
		
		Node newNode = new Node(data, null, firstNode);
		
		if(lastNode == null)
			lastNode = newNode;
		
		else
			firstNode.setNext(newNode);
		
		firstNode = newNode;
	}
	//-------------------------------------------------------------------
	public E removeFromBack()
	{
		if(lastNode != null)
		{
			lastNode.getNext().setPrev(null);
			lastNode = lastNode.getNext();
			numOfNodes--;
		}
		
		return (E) lastNode.getData();
	}
	//-------------------------------------------------------------------
	public E removeFromFront()
	{
		if(firstNode != null)
		{
			firstNode.getPrev().setNext(null);
			firstNode = firstNode.getPrev();
			numOfNodes--;
		}
		
		return (E) lastNode.getData();
	}
	//-------------------------------------------------------------------
	/////////////////////////////////////////////////////////////////////
	private class Node<E>
	{
		private E data;
		private Node next;
		private Node prev;
		//-------------------------------------------------------------------
		public Node(E data)
		{
			this(data, null, null);
		}
		//-------------------------------------------------------------------
		public Node(E data, Node next, Node prev)
		{
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
		//-------------------------------------------------------------------
		public Node getNext()
		{
			return next;
		}
		//-------------------------------------------------------------------
		public Node getPrev()
		{
			return prev;
		}
		//-------------------------------------------------------------------
		public void setNext(Node next) 
		{
			this.next = next;
		}
		//-------------------------------------------------------------------
		public void setPrev(Node prev) 
		{
			this.prev = prev;
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
/////////////////////////////////////////////////////////////////////