/**
 * Fibonacci's Java class!
 * @author boran
 * @version 18.06.2021
 */ 
public class Fibonacci 
{
    public static void main( String[] args)
    {
        // constants
        final int FIRST_TERM = 0;
        final int SECOND_TERM = 1;
    
        // variables
        IntBag fibo;
        int followingTerm;
        
        // program code
        fibo = new IntBag(); // create the fibonacci
        
        // Add the first and second term
        fibo.add( FIRST_TERM, 0);
        fibo.add( SECOND_TERM, 1);
        
        // Calculate fibonacci's first 40 term
        for ( int i = 2; i < 41; i++)
        {
            followingTerm = fibo.getTheValue( i - 2) + fibo.getTheValue( i - 1);
            fibo.add( followingTerm, i);
        }
        
        // Print it
        System.out.println(fibo.toString());
        
    }
    
}
