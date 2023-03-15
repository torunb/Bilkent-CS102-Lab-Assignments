package lab04a;

import javax.swing.*;

/**
 * Game and test class for potluck
 * @author boran
 * @version 09.07.2021
 */
public class PotLuckGame 
{
    public static void main( String[] args)
    {
        PotLuck potluck = new PotLuck();
        potluck.setTitle("Boran's Potluck Game");
        potluck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        potluck.setSize(600,600);
        potluck.setVisible(true);
    }
}
