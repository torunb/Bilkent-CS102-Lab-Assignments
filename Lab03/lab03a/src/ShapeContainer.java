import java.util.*;

/**
 * Container class for shapes
 * @author boran
 * @version 02.07.2021
 */
public class ShapeContainer
{
    Scanner scan = new Scanner( System.in);
    
    // properties
    ArrayList<Shape> shapes;
    
    // constructor
    public ShapeContainer()
    {
        shapes = new ArrayList<Shape>();
    }

    // methods
    public void add( Shape s)
    {
        shapes.add( s);
    }
    
    /**
     * Sum of all areas in container
     */ 
    public double getArea()
    {
        double area = 0;
        for( int i = 0; i < shapes.size(); i++)
        {
            area = area + shapes.get(i).getArea();
        }
        return area;
    }
    
    /**
     * Sum of all perimeters in container
     */ 
    public double getPerimeter()
    {
        double perimeter = 0;
        for( int i = 0; i < shapes.size(); i++)
        {
            perimeter = perimeter + shapes.get(i).getPerimeter();
        }
        return perimeter;
    }
    
    /**
     * Looks which shapes contains given points
     * @param x
     * @param y
     */ 
    public Shape findingContains( int x, int y)
    {
        boolean exist;
        boolean doesNotExist;
        int index;
        
        exist = false;
        doesNotExist = false;
        index = 0;
        
        if(shapes.size() != 0)
        {
            do 
            {
                if(shapes.get(index).contains(x, y) == shapes.get(index))
                {
                    exist = true;
                }
                else if( shapes.size() == (index + 1) )
                {
                    exist = true;
                    doesNotExist = true;
                }
                index++;
            } while (exist == false);
        }
        
        if( doesNotExist )
        {
            exist = false;
        }
        
        if(exist)
        {
            return shapes.get(index - 1);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Removes selected shapes
     */ 
    public void remove()
    {
        for ( int i = 0; i < shapes.size(); i++)
        {
            if( shapes.get(i).getSelected())
            {
                shapes.remove(shapes.get(i));
            }
        }
    }
    
    /**
     * Representation
     */ 
    public String toString()
    {
        StringBuffer all;
        
        all = new StringBuffer();
        if(shapes.size() == 0)
        {
            all.append("There is no shape" + "\n");
        }
        else
        {
            for( Shape s: shapes)
            {
                all.append( s.toString() + "\n" );
            }
        }
        return all.toString();
    }
    

    
}
