import cs1.SimpleURLReader;

/**
 * Tester class for all classes
 * @author boran
 * @version 25.06.2021
 */ 
public class Test
{
    public static void main( String[] args) throws Exception
    {
        // constants
        
        // variables
        SimpleURLReader reader;
        MySimpleURLReader newReader;
        HTMLFilteredReader filtered;
        WordSearch search;
        
        // program code
        reader = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        newReader = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html"); 
        filtered = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        search = new WordSearch( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        
        // PART A. Testing SimpleURLReader class
        System.out.println( "The content of the webpage: " + reader.getPageContents() );
        System.out.println( "The line count of the webpage: " + reader.getLineCount());
        
        // PART B. Testing MySimpleURLReader
        System.out.println(newReader.getURL());
        
        // PART C. Testing MySimpleURLReader
        System.out.println( "Number of the css links: "+ newReader.getNumberOfCSSLinks());
        
        // PART D. Testing HTMLFilteredReader
        System.out.println(filtered.getPageContents());
        
        // PART E. Testing WordSearch
        System.out.println( "Search Turkey "+ search.wordSearch( "Turkey"));
        System.out.println( "Search Ankara "+ search.wordSearch( "Ankara"));
    }
    
}
