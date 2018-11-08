package Stack;

import java.util.*;

public class ArrayStack<E> extends AbstractStack<E>
{
	private List<E> stack;
	
	public ArrayStack()
	{
		super();
		stack = new ArrayList<E>();
	}
	
	public E peek() 
	{
		if(this.isEmpty())
			throw new EmptyStackException();
		
		return stack.get(this.getSize() - 1);
	}

	public E pop() 
	{
		if(this.isEmpty())
			throw new EmptyStackException();
		
		this.size--;
		return stack.remove(this.getSize());
	}

	public void push(E element) 
	{
		this.size++;
		stack.add(element);
	}

}
