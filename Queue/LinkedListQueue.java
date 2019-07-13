package Queue;

import java.util.NoSuchElementException;
/////////////////////////////////////////////////////////////////////
public class LinkedListQueue<E> extends AbstractQueue<E>
{
	private Node lastNode;
	private Node firstNode;
	//-------------------------------------------------------------------
	public LinkedListQueue()
	{
		super();
		lastNode = null;
	}
	//-------------------------------------------------------------------
	public E dequeue() {
		if(this.isEmpty())
			throw new NoSuchElementException();
		
		this.size--;
		
		firstNode.getPrev().setNext(null);
		firstNode = firstNode.getPrev();
		firstNode.setNext(null);
		
		return (E) firstNode.getData();
	}
	//-------------------------------------------------------------------
	public void enqueue(E element) {
		this.size++;
		
		Node newNode = new Node(element, lastNode, null);
		
		if(lastNode == null)
			firstNode = newNode;
	
		if(lastNode != null)
			lastNode.setPrev(newNode);
		
		lastNode = newNode;
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
