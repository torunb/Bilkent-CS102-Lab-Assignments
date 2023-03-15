package lab04b;

import cs101.sosgame.SOS;
import java.awt.*;
import javax.swing.*;

/**
 * This class creates paintComponent which draws canvas for sos game
 * @author boran
 * @version 09.07.2021
 */ 
public class SOSCanvas extends JPanel
{
	// constants
	/**
	 *I don't know what it is. When I extended JFrame it automatically came
	 */
	private static final long serialVersionUID = 1L;
	
	// properties
	private SOS sos;
	private int sizeOfSOS;
	private String[] letters;
	
	// constructor
	public SOSCanvas( SOS sos)
	{
		this.sos = sos;
		sizeOfSOS = sos.getDimension();
		letters = new String[(int) Math.pow(sizeOfSOS, 2)];
	}
	
	// methods
	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		
    	int a = 0;
    	int b = 0;
    	char chars;

    	for ( int i = 0; i < sizeOfSOS; i++ )
    	{
      		for ( int j = 0; j < sizeOfSOS; j++ )
      		{
        		chars =  sos.getCellContents( i, j);
        		letters[a] = String.valueOf( chars);
        		a = a + 1;
      		}
    	}    
    
		for ( int i = 50; i <= 400; i = i + (400 / sizeOfSOS) )
    	{
      		for ( int j = 50; j <= 400; j = j + (400 / sizeOfSOS) )
      		{
        		g.drawRect( i, j, (400 / sizeOfSOS), (400 / sizeOfSOS));
        		g.drawString( letters[b], i + ((400 / sizeOfSOS) / 2), j + ((400 / sizeOfSOS) / 2));
        		b = b + 1;
      		}
		} 
  	}
		
	
}
