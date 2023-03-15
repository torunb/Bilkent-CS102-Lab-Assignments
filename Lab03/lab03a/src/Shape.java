/**
 * Abstract and super classes for other shapes
 * @author boran
 * @version 02.07.2021
 */

public abstract class Shape implements Locatable, Selectable
{   
    // properties
    private int x;
    private int y;
    private boolean selected;
    
    // abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // methdos
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setLocation( int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public boolean getSelected()
    {
        return selected;
    }
    
    public void setSelected( boolean a)
    {
        selected = a;
    }
    
    
    
}
