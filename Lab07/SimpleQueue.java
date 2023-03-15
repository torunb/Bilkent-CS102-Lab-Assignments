/**
 * SimpleQueue class which creates queue with linked list
 * @author boran
 * @version 30.07.2021
 */ 

public class SimpleQueue 
{
    // properties
    private SimpleLinkedList myList;
    
    // constructors
    public SimpleQueue()
    {
        myList = new SimpleLinkedList();
    }
    
    // methods
    public void enqueue(String data)
    {
        myList.addToTail(data);
    }
    
    public String dequeue()
    {
        return myList.removeFromHead();
    }
    
    public boolean isEmpty()
    {
        return myList.isEmpty();
    }
    
    public String toString()
    {
        return myList.toString();
    }
}
