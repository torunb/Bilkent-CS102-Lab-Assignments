/**
 * Node class that holds next node and value
 * @author boran
 * @version 30.07.2021
 */ 

public class Node 
{
    // properties
    private String data;
    private Node next;
    
    // constructors
    public Node(String data)
    {
        this.data = data;
        next = null;
    }
    
    // methods
    public String getData()
    {
        return data;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public void setData(String datas)
    {
        data = datas;
    }
    
    public void setNext(Node otherNext)
    {
        next = otherNext;
    }
}
