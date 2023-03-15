import java.util.*;

/**
 * IntBagStepIterator class
 * @author boran
 * @version 02.07.2021
 */ 
public class IntBagStepIterator implements Iterator
{
    private IntBag bag;
    private int stepValue;
    private int index;
    
    public IntBagStepIterator( int stepValue)
    {
        this.stepValue = stepValue;
        index = 0;
        bag = new IntBag();
    }
    
    
    public boolean hasNext()
    {
        return index < bag.size();
    }
    
    public int nextInt()
    {
        int nextIntAtBag;
        nextIntAtBag = bag.getTheValue(index);
        index++;
        
        while(bag.getTheValue(index) % bag.getTheValue(index) != 0)
        {
            nextIntAtBag = bag.getTheValue(index);
            index++;
        }
        return nextIntAtBag;  
    }
    
    public Integer next()
    {
        return (Integer) nextInt();
    }
}
