package Graph;

import java.util.List;
import java.util.ArrayList;

public class ArrayBreadthFirst<E> extends AbstractBreadthFirst<E>
{
	private List<E> vertices;
	private List<List<E>> edges;
	private List<Boolean> visitedVertices;
	private Queue queue;

	public ArrayBreadthFirst()
	{
		vertices = new ArrayList<E>();
		edges = new ArrayList<List<E>>();
		visitedVertices = new ArrayList<Boolean>();
	}
	public void BreadthFirst()
	{
		queue = new Queue();
		
		queue.enqueue(vertices.get(0));
		visitedVertices.add(0, Boolean.TRUE);
		
		while(!queue.isEmpty())
		{
			Object nextVertex = queue.dequeue();
			System.out.println(nextVertex);
			
			for(int counter = 0; counter < edges.size(); counter++)
			{
				if(edges.get(counter).get(0) == nextVertex && !visitedVertices.contains(edges.get(counter).get(1xc)))
				{
					queue.enqueue(edges.get(counter).get(1));
					visitedVertices.add(edges.get(counter).get(1));
				}
				
				else if(edges.get(counter).get(1) == nextVertex && !visitedVertices.contains(edges.get(counter).get(0)))
				{
					queue.enqueue(edges.get(counter).get(0));
					visitedVertices.add(edges.get(counter).get(0));
				}
			}
		}
	}
	
	public void addVertex(E vertex) 
	{
		vertices.add(vertex);
	}

	public void addEdge(E[] edge) 
	{
		List<E> tempEdge = new ArrayList<E>();
		tempEdge.add(edge[0]);
		tempEdge.add(edge[1]);
		edges.add(tempEdge);
	}

	public E displayVertex() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public void printBreadthFirst()
	{
		for(int counter = 0; counter < visitedVertices.size(); counter++)
			System.out.println(visitedVertices.get(counter) + " ");
		
		System.out.println();
	}
	
	

}
