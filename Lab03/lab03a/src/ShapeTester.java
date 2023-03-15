import java.util.*;

/**
 * This is tester class for all shape lab assignment
 * @author boran
 * @version 02.07.2021
 */ 
public class ShapeTester 
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // constants
        
        // variables
        ShapeContainer container;
        boolean again;
        int option;
        boolean addShapes;
        
        // program code
        container = new ShapeContainer();
        again = true;
        addShapes = true;
        
        while(again)
        {
            System.out.println("1. Create a new shape container");
            System.out.println("2. Add a new shape to the container");
            System.out.println("3. Get total area of shape container");
            System.out.println("4. Get total perimeter of shape container");
            System.out.println("5. Observe each shapes' features");
            System.out.println("6. Search a coordinate's shape");
            System.out.println("7. Remove selected shapes");
            System.out.println("8. Exit the program");
            System.out.println("Please enter the option you want: ");
            option = scan.nextInt();
            System.out.println();
            
            if( option == 1)
            {
                container = new ShapeContainer();
                System.out.println("New container created");
                System.out.println();
            }
            
            else if( option == 2)
            {
                String addOption = "";
                while( addShapes)
                {
                    System.out.println("If you want to add rectangle please enter 'R'");
                    System.out.println("If you want to add circle please enter 'C'");
                    System.out.println("If you want to add square please enter 'S'");
                    System.out.println("If you want to add triangle please enter 'T'");
                    System.out.println("If you want to go to main menu please enter 'X'");
                    System.out.println("Enter the option you want: ");
                    addOption = scan.next();
                    if( addOption.equalsIgnoreCase("R"))
                    {
                        int width = 0;
                        int height = 0;
                        int x = 0;
                        int y = 0;
                        System.out.println("Please enter the width of the rectangle: ");
                        width = scan.nextInt();
                        System.out.println("Please enter the height of the rectangle: ");
                        height = scan.nextInt();
                        System.out.println("Please enter the x and y coordinates(First x then y): ");
                        x = scan.nextInt();
                        y = scan.nextInt();
                        Rectangle rectangle = new Rectangle( height, width, x, y);
                        container.add(rectangle);
                        System.out.println("Rectangle is added to container");
                        System.out.println();
                    }
                    else if( addOption.equalsIgnoreCase("C"))
                    {
                        int radius = 0;
                        int x = 0;
                        int y = 0;
                        System.out.println("Please enter the radius of the circle: ");
                        radius = scan.nextInt();
                        System.out.println("Please enter the x and y coordinates(First x then y): ");
                        x = scan.nextInt();
                        y = scan.nextInt();
                        Circle circle = new Circle(radius, x, y);
                        container.add(circle);
                        System.out.println("Circle is added to container");
                        System.out.println();
                    }
                    else if( addOption.equalsIgnoreCase("S"))
                    {
                        int side = 0;
                        int width = 0;
                        int height = 0;
                        int x = 0;
                        int y = 0;
                        System.out.println("Please enter the side of the square: ");
                        side = scan.nextInt();
                        System.out.println("Please enter the x and y coordinates(First x then y): ");
                        x = scan.nextInt();
                        y = scan.nextInt();
                        width = side;
                        height = side;
                        Square square = new Square( height, width, side, x, y);
                        container.add(square);
                        System.out.println("Square is added to container");
                        System.out.println();
                    }
                    else if( addOption.equalsIgnoreCase("T"))
                    {
                        int sideA = 0;
                        int sideB = 0;
                        int sideC = 0;
                        int x = 0;
                        int y = 0;
                        System.out.println("Please enter the side A of the triangle");
                        sideA = scan.nextInt();
                        System.out.println("Please enter the side B of the triangle");
                        sideB = scan.nextInt();
                        System.out.println("Please enter the side C of the triangle");
                        sideC = scan.nextInt();
                        System.out.println("Please enter the x and y coordinates(First x then y): ");
                        x = scan.nextInt();
                        y = scan.nextInt();
                        Triangle triangle = new Triangle( sideA, sideB, sideC, x, y);
                        container.add(triangle);
                        System.out.println("Triangle is added to container");
                        System.out.println();
                    }
                    else if( addOption.equalsIgnoreCase("X"))
                    {
                        addShapes = false;
                        System.out.println();
                    }
                }
            }
            
            else if(option == 3)
            {
                System.out.println("Total area of the container is " + container.getArea());
                System.out.println();
            }
            
            else if( option == 4)
            {
                System.out.println("Total perimeter of the container is " + container.getPerimeter());
                System.out.println();
            }
            
            else if( option == 5)
            {
                System.out.println(container.toString());
                System.out.println();
            }
            
            else if( option == 6)
            {
                int x = 0;
                int y = 0;
                System.out.println("Please enter x: ");
                x = scan.nextInt();
                System.out.println("Please enter y: ");
                y = scan.nextInt();
                if( container.findingContains(x,y) != null)
                {
                    System.out.println(container.findingContains( x,y).toString());
                }
                
                else if( container.findingContains(x,y) == null)
                {
                    System.out.println("There is no shape that contains this point");
                }    
                System.out.println();    
            }
            
            else if( option == 7)
            {
                container.remove();
            }
            
            else if( option == 8)
            {
                again = false;
            }
        }
        
        System.out.println("See youuuuu");
        
        scan.close();
    }
}
