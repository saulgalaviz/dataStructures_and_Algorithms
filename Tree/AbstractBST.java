package Tree;

public abstract class AbstractBST
{
	public abstract void insert(int data);
	
	public abstract Object search(int data);
	
	public abstract void preorderTraversal();
	
	public abstract void inorderTravseral();
	
	public abstract void postorderTraversal();
	
	private class Node{}
}
