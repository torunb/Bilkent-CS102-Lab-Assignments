/**
 * Filtering HTML from content
 * @author boran
 * @version 25.06.2021
 */ 
public class HTMLFilteredReader extends MySimpleURLReader
{
    // properties
    
    // constructors
    public HTMLFilteredReader( String url)
    {
        super(url);
    }
    
    // methods
    @Override
    public String getPageContents()
    {
        String onlyText = getUnfilteredContents();
        for ( int i = 0; i < getUnfilteredContents().length(); i++)
        {
            if( getUnfilteredContents().lastIndexOf("<link", i) == i)
            {
                for( int j = i; j < getUnfilteredContents().indexOf('>', i); j++)
                {
                    onlyText = onlyText.replaceAll("\\<.*?\\>", "");
                    onlyText = onlyText.replaceAll("[\\t ]", "");
                }
            }
        }
        return onlyText;
    }
    
    public String getUnfilteredContents()
    {
        return super.getPageContents();
    }
}
