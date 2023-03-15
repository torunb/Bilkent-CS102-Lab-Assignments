import java.util.Scanner;
import java.util.Arrays;

/**
 * Creates properties, constructors and methdos for IntBagTester class
 * @author boran
 * @version 18.06.2021
 */ 
public class IntBag
{
    Scanner scan = new Scanner( System.in);
    
    // properties
    private int[] bag;
    
    // constructor
    public IntBag()
    {
        bag = new int[4];
        bag[0] = -1;
    }
    
    /**
     * Adds value to last index
     * @param a (value)
     */ 
    public void add( int a)
    {
        if (bag[ bag.length - 1] == -1)
        {
            bag = Arrays.copyOf( bag, bag.length * 2);
            bag[ bag.length/2 -1] = a;
            bag[ bag.length/2 ] = -1;
        }
        
        else
        {
            int size = size();
            bag[ size] = a;
            bag[ size + 1] = -1;
        }

    }
    
    /**
     * Adss value to particular index
     * @param a (value)
     * @param i (index)
     */ 
    public void add( int a, int i)
    {
        if ( bag[bag.length -1] == -1)
        {
            bag = Arrays.copyOf( bag, bag.length * 2);
            bag [ bag.length/2 - 1] = a;
            bag [ bag.length/2] = -1;
        }    
        else
        {    
            if ( bag[i] == -1)
            {
                bag[i] = a;
                bag[i+1] = -1;
            }
            else
            {
                bag [i] = a;
            }
        }
    }    
    
    /**
     * Representation of array
     */ 
    public String toString()
    {
        String representation = "";
        
        for ( int i = 0; i < size(); i++)
        {
            representation = representation + "\n" + "Index at " + i + " = " + bag[i];
        }
        return representation;
    }
    
    /**
     * Returns size of the array
     */ 
    public int size()
    {
        int size = 0;
        
        for (int i = 0; i < bag.length; i++)
        {
            if ( bag[ i] == -1)
            {
                size = i;
            }
        }
        return size;
    }
    
    /**
     * Returns particular index's value
     */ 
    public int getTheValue( int index)
    {
        return bag[index];
    }
    
    /**
     * Removes particular index's value
     */ 
    public void remove( int index)
    {
        bag[index] = bag[ size() - 1];
        bag[ size() - 1] = -1;
    }
    
    /**
     * Looks whether array is containing the given value or not
     * @param value
     * @return exist
     */ 
    public boolean isContaining( int value)
    {
        boolean exist = false;
        for( int i=0; i < bag.length; i++)
        {
            if ( bag[i] == value)
            {
                exist = true;
            }
        }
        return exist;
    }
    
    /**
     * Remoces particular value from whole array
     * @param a (value)
     */ 
    public void removeAll( int a)
    {
        while( isContaining(a))
        {
            for ( int i = 0; i < size(); i++)
            {
                if ( bag[i] == a)
                {
                    remove(i);
                    i = 0;
                }
            }
        }
    }    
}
