/**
 * Simple square class!
 * @author boran
 * @version 02.07.2021
 */

public class Square extends Rectangle
{
    // properties
    private int side;
    
    // constructor
    public Square( int height, int width, int x, int y, int side)
    {
        super( height, width, x, y);
        this.side = side;
        width = side;
        height = side;
    }
    
    // methods
    
    /**
     * Area of the square
     * @return area
     */ 
    public double getArea()
    {
        return super.getArea();
    }
    
    /**
     * Circumference of the rectangle
     * @return 4 * side
     */
    public double getPerimeter()
    {
        return 4 * side;
    }
    
    /**
     * Method that looks given point contains this shape
     * @param x
     * @param y
     */ 
    public Shape contains( int x, int y)
    {
        if( x>=this.getX() - side/2 && x<=this.getX() + side/2 && y>=this.getY() - side/2 && y<=this.getY() + side/2 )
        setSelected( true);
            return this;
    }
    
    /**
     * Representation
     */
    public String toString()
    {
        return "Square's area = " + getArea() + " perimeter = " + getPerimeter() + " coordinates: (" + getX() + "," + getY() + ")" + "\n" + "Is it selected? " + getSelected();
    }
}
