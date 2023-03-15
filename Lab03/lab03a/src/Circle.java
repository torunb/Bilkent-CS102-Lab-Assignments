/**
 * Simple circle class!
 * @author boran
 * @version 02.07.2021
 */

public class Circle extends Shape
{
    // properties
    private int radius;

    // constructor
    public Circle( int radius, int x, int y)
    {
        this.radius = radius;
        setLocation( x,y);
    }
    
    // methods
    
    /**
     * Area of the circle
     * @return area
     */ 
    public double getArea()
    {
        return Math.PI * Math.pow( radius, 2);
    }
    
    /**
     * Perimeter of the circle
     * @return 2 * Math.PI * radius
     */ 
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Method that looks given point contains this shape
     * @param x
     * @param y
     */ 
    public Shape contains( int x, int y)
    {
        if( Math.pow((this.getX()-x),2) + Math.pow((this.getY()-y),2) <= Math.pow(this.radius,2) )
            setSelected( true);
            return this;
    }
    
    /**
     * Representation
     */ 
    public String toString()
    {
        return "Circle's area = " + getArea() + " perimeter = " + getPerimeter() + " coordinates: (" + getX() + "," + getY() + ")" + "\n" + "Is it selected? " + getSelected();
    }
    
}
