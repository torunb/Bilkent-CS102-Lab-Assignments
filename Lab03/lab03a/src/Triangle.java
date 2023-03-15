/**
 * Simple triangle class!
 * @author boran
 * @version 02.07.2021
 */

public class Triangle extends Shape
{
    // properties
    private int sideA;
    private int sideB;
    private int sideC;
    
    // constructor
    public Triangle ( int sideA, int sideB, int sideC, int x, int y)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        setLocation( x,y);
    }
    
    // methods
    /**
     * Area of the triangle by using u method in geometry
     * @return area
     */ 
    public double getArea()
    {
        double u = (sideA + sideB + sideC) / 2;
        double area = u * (u - sideA) * (u - sideB) * (u - sideC);
        return Math.sqrt( area);
    }
    
    /**
     * Circumference of the triangle
     * @return sideA + sideB + sideC
     */
    public double getPerimeter()
    {
        return sideA + sideB + sideC;
    }
    
    /**
     * Representation
     */
    public String toString()
    {
        return "Triangle's area = " + getArea() + " perimeter = " + getPerimeter() + " coordinates: (" + getX() + "," + getY() + ")" + "\n" + "Is it selected? " + getSelected();
    }
    
    /**
     * Method that looks given point contains this shape
     * @param x
     * @param y
     */ 
    public Shape contains( int x, int y)
    {
        double tangentCircleRadius = 0;
        tangentCircleRadius = getArea() / ((sideA + sideB + sideC)/2);
        if( Math.sqrt( ((x- this.getX()) * (x - this.getX())) + ((y- this.getY()) * (y - this.getY())) ) <= tangentCircleRadius ) 
        {
            setSelected(true);
            return this;
        }
        else
            return null;
    }
}
