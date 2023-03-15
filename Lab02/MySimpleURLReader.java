import cs1.SimpleURLReader;

/**
 * Finding names and quantity of css links
 * @author boran
 * @version 23.06.2021
 */ 
public class MySimpleURLReader extends SimpleURLReader 
{
    // properties
    private String url;
    private String name;
    
    // cosntructor
    public MySimpleURLReader( String url)
    {
        super(url);
        this.url = url;
    }
    
    // methods
    public String getURL()
    {
        return url;
    }
    
    public String getName()
    {
        String empty = "";
        for ( int i = 0; i <= url.length() - 1; i++)
        {
            if( url.lastIndexOf( i) == '/') 
            {
                name = url.substring( i + 1, url.length() - 1);
                return name;
            }
        }
        return empty;
    }
    
    public int getNumberOfCSSLinks()
    {
        int occurrence = 0;
        for( int i = 0; i < getPageContents().lastIndexOf('>'); i++)
        {
            if( getPageContents().lastIndexOf("<link", i) == i)
            {
                for( int j = i; j < getPageContents().indexOf('>', i); j++)
                {
                    if( getPageContents().indexOf(".css", j) == j)
                    {
                        occurrence = occurrence + 1;
                    }
                }
            }
        }
        return occurrence;
    }
}
