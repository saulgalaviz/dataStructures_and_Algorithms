package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/////////////////////////////////////////////////////////////////////
public class ArrayQueue<E> extends AbstractQueue<E>
{
	private List<E> queue;
	//-------------------------------------------------------------------
	public ArrayQueue()
	{
		super();
		queue = new ArrayList<E>();
	}
	//-------------------------------------------------------------------
	public E dequeue() 
	{
		if(this.isEmpty())
			throw new NoSuchElementException();
		
		this.size--;
		queue.remove(0);
		return queue.get(0);
	}
	//-------------------------------------------------------------------
	public void enqueue(E element) 
	{
		queue.add(element);
		this.size++;
	}
	//-------------------------------------------------------------------
	public E peek() 
	{
		if(this.isEmpty())
			throw new NoSuchElementException();

		return queue.get(0);
	}
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////