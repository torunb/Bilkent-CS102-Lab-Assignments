import java.util.Scanner;
/**
 * Tester class for IntBag
 * @author boran
 * @version 18.06.2021
 */ 
public class IntBagTester 
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // constants
        
        // variables
        int input;
        IntBag intBag;
        boolean again;
        boolean addValues;
        
        // program code
        input = 0;
        again = true;
        intBag = new IntBag();
        addValues = true;
        
        System.out.println( "Welcome to IntBag tester.");
        while(again)
        {
            System.out.println();
            System.out.println( "1. Create a new empty collection " + "\n" + "2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)" + "\n" + "3. Print the collection of values." 
                                + "\n" + "4. Add a value to the collection of values at a specified location" + "\n" + "5. Remove the value at a specified location from the collection of values"
                                + "\n" + "6. Remove all instances of a value within the collection" + "\n" + "7. Quit the program.");
            System.out.println("Please enter the number of the option that you want to do:");
            input = scan.nextInt();
        
            // If user selects 1 create a bag
            if( input == 1)
            {
                intBag = new IntBag();
                System.out.println("Bag is created");
            }
        
            // If user selects 2 ask & get for values
            else if( input == 2)
            {
                int enter = 0;
                while ( addValues)
                {
                    System.out.println("Please enter the values you want to put in the integer bag (use zero to indicate all the values have been entered.):");
                    enter = scan.nextInt();
                    if ( 0 < enter)
                    {
                        intBag.add( enter);
                    }
                    else if ( enter == 0)
                    {
                        addValues = false;
                    }
                }
            }
            
            // If user selects 3 show the bag
            else if( input == 3)
            {
                System.out.println(intBag.toString());
            }
            
            // If user selects 4 add value to particular index
            else if( input == 4)
            {
                int value = 0;
                int index = 0;
                System.out.println("Please enter the value you want to add:");
                value = scan.nextInt();
                System.out.println("Please enter the index that you want:");
                index = scan.nextInt();
                intBag.add( value, index);
            }
            
            // If user selects 5 remove the particular index's value
            else if( input == 5)
            {
                int index = 0;
                System.out.println("Please enter the index you want to remove it's value:");
                index = scan.nextInt();
                intBag.remove(index);
            }
            
            // If user selects 6 remove particular value in whole array
            else if( input == 6)
            {
                int value = 0;
                System.out.println("Please enter the value you want to remove:");
                value = scan.nextInt();
                intBag.removeAll(value);
            }
            
            // If user selects 7 end the program
            else if( input == 7)
            {
                again = false;
            }
        }
        
        // Print goodbye message
        System.out.println("See you. Byeee");
        
        scan.close();
    }
}       
