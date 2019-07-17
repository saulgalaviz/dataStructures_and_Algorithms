package Graph;

public abstract class AbstractBreadthFirst<E> 
{
	public abstract void addVertex(E vertex);
	//-------------------------------------------------------------------
	public abstract void addEdge(E[] edge);
	//-------------------------------------------------------------------
	public abstract E displayVertex();
}
