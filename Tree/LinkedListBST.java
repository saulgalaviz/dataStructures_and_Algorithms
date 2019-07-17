package Tree;

public class LinkedListBST extends AbstractBST
{
	private Node root;
	
	public void insert(int data) {
		if(root == null)
			root = new Node(data);
		
		else
		{
			Node tempNode = root;
			Node newNode = new Node(data);
			
			while(true)
			{
				if(data < tempNode.getData())
				{
					if(tempNode.getLeftChild() == null)
					{
						tempNode.setLeftChild(newNode);
						return;
					}
					tempNode = tempNode.getLeftChild();
				}
				
				else
				{
					if(tempNode.getRightChild() == null)
					{
						tempNode.setRightChild(newNode);
						return;
					}
					tempNode = tempNode.getRightChild();
				}
			}
		}
	}

	public Node search(int data) 
	{
		Node returnedNode = root;
		
		while(data != root.getData())
		{
			if(returnedNode != null)
			{
				if (returnedNode.getData() == data)
					return returnedNode;
				
				else if(returnedNode == null)
					return null;
				
				if(returnedNode.getData() > data)
					returnedNode = returnedNode.getLeftChild();
				
				else
					returnedNode = returnedNode.getRightChild();	
			}
		}
		return returnedNode;
	}

	@Override
	public void preorderTraversal() 
	{
		
		
	}

	@Override
	public void inorderTravseral() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postorderTraversal() {
		// TODO Auto-generated method stub
		
	}
	
	private class Node
	{
		private int data;
		private Node leftChild;
		private Node rightChild;
		
		public Node(int data)
	      {
	         this(data, null, null);
	      }
	      //-------------------------------------------------------------------
	      public Node(int data, Node leftChild, Node rightChild)
	      {
	         this.data = data;
	         this.leftChild = leftChild;
	         this.rightChild = rightChild;
	      }
	      //-------------------------------------------------------------------
	      public Node getLeftChild()
	      {
	    	 return leftChild;
	      }
	      public Node getRightChild()
	      {
	    	 return rightChild;
	      }
	      //-------------------------------------------------------------------
	      public void setLeftChild(Node leftChild) 
	      {
	    	 this.leftChild = leftChild;
	      }
	      public void setRightChild(Node rightChild) 
	      {
	    	 this.rightChild = rightChild;
	      }
	      //-------------------------------------------------------------------
	      public int getData()
	      {
	         return data;
	      }
	}

}
