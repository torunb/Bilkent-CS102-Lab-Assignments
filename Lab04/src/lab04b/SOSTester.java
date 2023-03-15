package lab04b;

import cs101.sosgame.SOS;
import javax.swing.*;

/**
 * Tester class for both SOSCanvas and SOSGUIPanel classes
 * @author boran
 * @version 09.07.2021
 */ 
public class SOSTester 
{
    public static void main(String[] args) 
    {   
        JFrame frameTest = new JFrame();
        SOS game = new SOS(5);
        String player1 = "Boran";
        String player2= "Torun";
        SOSGUIPanel guiPanel= new SOSGUIPanel(game, player1, player2);
        frameTest.setTitle("Boran's SOS Game");
        frameTest.add(guiPanel);
        frameTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTest.setSize(500,600);
        frameTest.setResizable(false);
        frameTest.setVisible(true);
    }
}
