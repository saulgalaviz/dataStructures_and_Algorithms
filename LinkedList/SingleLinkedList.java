package LinkedList;

/////////////////////////////////////////////////////////////////////
public class SingleLinkedList<E>
{
   private Node lastNode;
   private int numbOfNodes;
   //-------------------------------------------------------------------
   public SingleLinkedList()
   {
      lastNode = null;
      numbOfNodes = 0;
   }
   //-------------------------------------------------------------------
   public void add(E data)
   {
      Node newNode = new Node(data, lastNode);
      lastNode = newNode;
      numbOfNodes++;
   }
 //-------------------------------------------------------------------
   public void insert(E data, int nodeIndex)
   {
	   Node newNode = new Node(data);
	   
	   boolean breakLoop = false;
	   Node tempNode = lastNode;
	   
	   for(int counter = 0; counter < numbOfNodes && !breakLoop; counter++)
	   {
		   if(counter == 0 && counter == nodeIndex)
		   {
			   newNode.setNext(lastNode);
			   lastNode = newNode;
			   numbOfNodes++;
			   breakLoop = true;
		   }
		   
		   else if(counter + 1 == nodeIndex)
		   {
			   Node nodeReference = tempNode.getNext();
			   tempNode.setNext(newNode);
			   newNode.setNext(nodeReference);
			   numbOfNodes++;
			   breakLoop = true;
		   }
		   
		   else
			   tempNode = tempNode.getNext();
	   }
   }
   //-------------------------------------------------------------------
   public E remove()
   {
      if (lastNode != null)
      {
         lastNode = lastNode.getNext();
         numbOfNodes--;
      }
      
      return (E) lastNode.getData();
   }
   //-------------------------------------------------------------------
   public boolean remove(E data)
   {
	   boolean removed = false;
	   
	   if(lastNode != null)
	   {
		   Node tempNode = lastNode;
		   for(int counter = 0; counter < numbOfNodes && !removed; counter++)
		   {
			   if(lastNode.getData() == data && numbOfNodes == 1)
			   {
				   lastNode = null;
				   removed = true;
				   numbOfNodes--;
			   }
			   
			   else if(tempNode.getNext() != null && tempNode.getNext().getData() == data)
			   {
				   tempNode.setNext(tempNode.getNext().getNext());
				   removed = true;
				   numbOfNodes--;
			   }
			   
			   else
				   tempNode = tempNode.getNext();
		   }
	   }
	   
	   return removed;
   }
   //-------------------------------------------------------------------
   public void printLinkedList()
   {
	   Node tempNode = lastNode;
	   
	   for(int counter = 0; counter < numbOfNodes; counter++)
	   {
		   System.out.print(tempNode.getData() + " ");
		   tempNode = tempNode.getNext();
	   }
	   
	   System.out.println();
   }
   //-------------------------------------------------------------------
   /////////////////////////////////////////////////////////////////////
   private class Node<E>
   {
      private E data;
      private Node next;
      //-------------------------------------------------------------------
      public Node(E data)
      {
         this(data, null);
      }
      //-------------------------------------------------------------------
      public Node(E data, Node next)
      {
         this.data = data;
         this.next = next;
      }
      //-------------------------------------------------------------------
      public Node getNext()
      {
    	 return next;
      }
      //-------------------------------------------------------------------
      public void setNext(Node next) 
      {
    	 this.next = next;
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