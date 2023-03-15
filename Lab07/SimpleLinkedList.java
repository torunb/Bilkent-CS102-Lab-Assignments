/**
 * SimpleLinkedList class that creates linked nodes which holds data
 * @author boran
 * @version 30.07.2021
 */ 

public class SimpleLinkedList 
{
    // properties
    private Node head;
    
    // constructors
    public SimpleLinkedList()
    {
        head = null;
    }
    
    // methods
    
    /**
     * This method adds data to tail of the list
     * @param  data
     */ 
    public void addToTail(String data)
    {
        Node newNode = new Node(data);
        newNode.setNext(null);
        if(head == null)
        {
            head = newNode;
        }
        
        Node temp = head;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setNext(null);
    }
    
    /**
     * This method removes from head returns the data which is removed
     * @return removedData
     */ 
    public String removeFromHead()
    {
        Node newHead;
        String removedData;
        
        if(head == null)
        {
            return null;
        }
        else
        {
            removedData = head.getData();
        }
        newHead = head.getNext();
        head.setNext(null);
        head = newHead;
        return removedData;
        
    }
    
    /**
     * This method checks whether list is empty or not
     * @return head == nul
     */ 
    public boolean isEmpty()
    {
		return (head == null);
    }
    
    /**
     * This method returns node that holds data given in parameter
     * @param data
     * @return temp (Node)
     */ 
    public Node get( String data)
    {
        Node temp = head;
        
        if( temp.getData().equals(data))
        {
            return temp;
        }
        else
        {
            while (!(temp.getData() == (data)) && temp != null) 
            {
                temp = temp.getNext();
            }
            return temp;
        }
    }
    
    /**
     * String representation of linked list
     * @return representation
     */
    @Override 
    public String toString()
    {
        String represantation = "";
        Node temp = head;
        if( temp == null)
        {
            return "Your list is empty";
        }
        while( temp != null)
        {
            represantation = represantation + "\n" + temp.getData();
            temp = temp.getNext();
        }
        return represantation;
    }
    
    
    
    
}
