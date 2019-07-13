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
      public E getData()
      {
         return data;
      }
      //-------------------------------------------------------------------
   }
   /////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////