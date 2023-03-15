/**
 * SimpleStackWithQueue class which creates queues and creates method for pushing and adding
 * @author boran
 * @version 30.07.2021
 */

public class SimpleStackWithQueue 
{
    // properties
    private SimpleQueue q1;
    private SimpleQueue q2;
    
    // constructors
    public SimpleStackWithQueue()
    {
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }
    
    // methods
    public void push(String x)
    {
        q1.enqueue(x);
    }
    
    public String pop()
    {
        SimpleQueue newQueue;
        String poppedData;
        poppedData = "";
        if(q1.isEmpty())
        {
            return "Nothing to be popped";
        }
        
        while(!q1.isEmpty())
        {
            poppedData = q1.dequeue();
            if(q1.isEmpty() == false)
            {
                q2.enqueue(poppedData);
            }
        }
        newQueue = q2;
        q2 = q1;
        q1 = newQueue;
        
        return poppedData;
    }
    
    public String toString()
    {
        return q1.toString();
    }
}
