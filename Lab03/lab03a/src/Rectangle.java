/**
 * Simple rectangle class!
 * @author boran
 * @version 02.07.2021
 */

public class Rectangle extends Shape
{
    // properties
    private int height;
    private int width;
    
    // constructor
    public Rectangle( int height, int width, int x, int y)
    {
        this.height = height;
        this.width = width;
        setLocation( x,y);
    }
    
    // methods
    
    /**
     * Area of the rectangle
     * @return width * height
     */ 
    public double getArea()
    {
        return width * height; 
    }
    
    /**
     * Circumference of the rectangle
     * @return 2 * (width + height)
     */ 
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
    
    /**
     * Method that looks given point contains this shape
     * @param x
     * @param y
     */ 
    public Shape contains( int x, int y)
    {
        if( x>=this.getX() - width/2 && x<=this.getX() + width/2 && y>=this.getY() - height/2 && y<=this.getY() + height/2 )
            setSelected( true);
            return this;
    }
    
    /**
     * Representation
     */ 
    public String toString()
    {
        return "Rectangle's area = " + getArea() + " perimeter = " + getPerimeter() + " coordinates: (" + getX() + "," + getY() + ")" + "\n" + "Is it selected? " + getSelected();
    }
}
