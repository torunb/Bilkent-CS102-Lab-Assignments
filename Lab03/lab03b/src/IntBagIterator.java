import java.util.*;

/**
 * IntBagIterator class
 * @author boran
 * @version 02.07.2021
 */ 
public class IntBagIterator implements IntIterator
    {
        // properties
        private IntBag bag;
        private int index;
        
        
        // constructor
        public IntBagIterator(IntBag newBag)
        {
            index = 0;
            this.bag = newBag;
        }
        
        public int nextInt()
        {
            if( index < bag.size())
            {
                index++;
                return bag.getTheValue( index - 1);
            }    
            else
                return -10;    
        }
        
        public boolean hasNext()
        {
            if( index < bag.size())
            {
                return true;
            }
            else
            {
                return false;
            }    
        }
        
        public Integer next()
        {
            return (Integer) nextInt();
        }
        
    }
