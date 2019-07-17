package Graph;

import java.util.NoSuchElementException;
/////////////////////////////////////////////////////////////////////
public class Queue<E> 
{
	private Node lastNode;
	private Node firstNode;
	private int size;
	//-------------------------------------------------------------------
	public Queue()
	{
		size = 0;
		lastNode = null;
		firstNode = null;
	}
	//-------------------------------------------------------------------
	public boolean isEmpty()
	{
		return (getSize() == 0);
	}
	//-------------------------------------------------------------------
	public int getSize()
	{
		return size;
	}
	//-------------------------------------------------------------------
	public E dequeue() {
		E data = null;
		
		if(!isEmpty())
		{
			data = (E) firstNode.getData();
			
			if(getSize() != 1)
			{
				firstNode.getPrev().setNext(null);
				firstNode.setNext(null);
			}
			
			firstNode = firstNode.getPrev();
			
			size--;
		}
		
		return data;
	}
	//-------------------------------------------------------------------
	public void enqueue(E element) {
		size++;
		
		Node newNode = new Node(element, lastNode, null);
		
		if(lastNode == null)
			firstNode = newNode;
	
		if(lastNode != null)
			lastNode.setPrev(newNode);
		
		lastNode = newNode;
		
		System.out.println("from queue: " + lastNode.getData());
	}
	//-------------------------------------------------------------------
	public E peek() {
		if(this.isEmpty())
			throw new NoSuchElementException();
		
		return (E) firstNode.getData();
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
