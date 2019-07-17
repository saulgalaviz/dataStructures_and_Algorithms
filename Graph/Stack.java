package Graph;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
/////////////////////////////////////////////////////////////////////
public class Stack<E>
{
	private List<E> stack;
	private int size;
	//-------------------------------------------------------------------
	public Stack()
	{
		size = 0;
		stack = new ArrayList<E>();
	}
	//-------------------------------------------------------------------
	public boolean isEmpty()
	{
		return (size == 0);
	}
	//-------------------------------------------------------------------
	public int getSize()
	{
		return size;
	}
	//-------------------------------------------------------------------
	public E peek() 
	{
		if(this.isEmpty())
			throw new EmptyStackException();
		
		return stack.get(this.getSize() - 1);
	}
	//-------------------------------------------------------------------
	public E pop() 
	{
		if(this.isEmpty())
			throw new EmptyStackException();
		
		this.size--;
		return stack.remove(this.getSize());
	}
	//-------------------------------------------------------------------
	public void push(E element) 
	{
		this.size++;
		stack.add(element);
	}
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////