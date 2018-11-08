package Stack;

public abstract class AbstractStack<E> 
{
	protected int size;
	
	public AbstractStack() 
	{
		this.size = 0;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public int getSize()
	{
		return size;
	}
	
//	public String toString()
//	{
//		String result = "";
//		for(E element: this)
//		{
//			result += str(element) + "\n";
//		}
//		return result;
//	}
	
	public abstract E peek();
	
	public abstract E pop();
	
	public abstract void push(E element);
}
