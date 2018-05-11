package LinkedList;

public class SingleLinkedList 
{
   private Node lastNode;
   private int numbOfNodes;
   
   public SingleLinkedList()
   {
      lastNode = null;
      numbOfNodes = 0;
   }
   
   public void add(int data)
   {
      Node newNode = new Node(data, lastNode);
      lastNode = newNode;
      numbOfNodes++;
   }
   
   public void remove()
   {
      if (lastNode != null)
      {
         lastNode = lastNode.getNext();
         numbOfNodes--;
      }
   }
   
   private class Node
   {
      private int data;
      private Node next;
      
      public Node(int data)
      {
         this(data, null);
      }
      
      public Node(int data, Node next)
      {
         this.data = data;
         this.next = next;
      }
      
      public Node getNext()
      {
         return next;
      }
      
      public int getData()
      {
         return data;
      }
   }
}
