/**
 * Word search in html file
 * @author boran
 * @version 25.06.2021
 */ 
public class WordSearch extends HTMLFilteredReader
{
    // properties
    
    // cosntructor
    public WordSearch( String url)
    {
        super( url);
    }
    
    // methods
    public int wordSearch( String location)
    {
        String specifiedContent;
        specifiedContent = this.getPageContents();
        return specifiedContent.indexOf(location);
    }
}
