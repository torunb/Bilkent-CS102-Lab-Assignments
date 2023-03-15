import cs1.SimpleURLReader;

/**
 * Tester class for SimpleURLReader
 * @author boran
 * @version 23.06.2021
 */ 

public class SimpleURLReaderTester 
{
    public static void main( String[] args)
    {
        // variables
        SimpleURLReader reader;
        reader = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
                
        // program code
        System.out.println( "The content of the webpage: " + reader.getPageContents() );
        System.out.println( "The line count of the webpage: " + reader.getLineCount());
    }
}
