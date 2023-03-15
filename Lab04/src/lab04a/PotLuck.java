package lab04a;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * This class creates potluck frame for potluck game
 * @author boran
 * @version 09.07.2021
 */ 
public class PotLuck extends JFrame
{

    /**
	 *I don't know what it is. When I extended JFrame it automatically came
	 */
    private static final long serialVersionUID = 1L;
    
	// constants
    private final int ROW = 4;
    private final int COL = 4;
    
    // properties
    private JButton prizeButton;
    private JButton bomb1Button;
    private JButton bomb2Button;
    private JLabel label;
    private JPanel panel;
    private JPanel buttonPanel;
    private int prize;
    private int bomb1;
    private int bomb2;
    private int counter;
    
    
    // constructors
    public PotLuck()
    {
        buttonPanel = new JPanel();
        buttonPanel.setBorder(new EmptyBorder(ROW, ROW, COL, COL));
        buttonPanel.setLayout( new BorderLayout(0,0));
        setContentPane(buttonPanel);
        
        prize = (int) (Math.random() * 16) + 1;
        bomb1 = (int) (Math.random() * 16) + 1;
        bomb2 = (int) (Math.random() * 16) + 1;
        counter = 0;
        
        // making new indexes for both prize and bombs until they are not same
        do {
            prize = (int) (Math.random() * 16) + 1;
            bomb1 = (int) (Math.random() * 16) + 1;
            bomb2 = (int) (Math.random() * 16) + 1;
        } while (prize == bomb1 || bomb1 == bomb2 || prize == bomb2);
        
        panel = new JPanel();
        buttonPanel.add(panel, BorderLayout.CENTER);
        panel.setLayout( new GridLayout(4,4));
        label = new JLabel("You guessed " + counter + " times");
        buttonPanel.add(label, BorderLayout.NORTH);
        PotLuckListener listener = new PotLuckListener();
        
        for( int i = 1; i <= 16; i++)
        {
            if( prize == i) 
            {
                prizeButton = new JButton("" + i); // create prize button
                prizeButton.addActionListener(listener);
                panel.add(prizeButton);
            }
            
            else if( bomb1 == i)
            {
                bomb1Button = new JButton("" + i); // create first bomb button
                bomb1Button.addActionListener(listener);
                panel.add(bomb1Button);
            }
            
            else if( bomb2 == i)
            {
                bomb2Button = new JButton("" + i); // create second bomb button
                bomb2Button.addActionListener(listener);
                panel.add(bomb2Button);
            }
            
            else
            {
                JButton straight = new JButton("" + i); // create straight (normal) buttons
                straight.addActionListener(listener);
                panel.add(straight);
            }
        }
        
        // delete these !!!!!!!!!!!!!!!!
        System.out.println("Prize is at the "+ prize + "th button");
        System.out.println("Bomb is at the "+ bomb1 + "th button");
        System.out.println("Bomb is at the "+ bomb2 + "th button");
    }
    
    private class PotLuckListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if( e.getSource() == prizeButton || e.getSource() == bomb1Button || e.getSource() == bomb2Button)
            {
                counter++;
                if(e.getSource() == prizeButton)
                {
                    label.setText("You got it in " + counter + " attempt(s)!");
                    prizeButton.setText(null);
                    bomb1Button.setText(null);
                    bomb2Button.setText(null);
                    ImageIcon prizeImage = new ImageIcon("realprize.png");
                    ImageIcon bombImage = new ImageIcon("realbomb.png");
                    prizeButton.setIcon(prizeImage);
                    bomb1Button.setIcon(bombImage);
                    bomb2Button.setIcon(bombImage);
                }
                else
                {
                    label.setText("Sorry! You are blown up at attempt " + counter + "!");
                    prizeButton.setText(null);
                    bomb1Button.setText(null);
                    bomb2Button.setText(null);
                    ImageIcon prizeImage = new ImageIcon("realprize.png");
                    ImageIcon bombImage = new ImageIcon("realbomb.png");
                    prizeButton.setIcon(prizeImage);
                    bomb1Button.setIcon(bombImage);
                    bomb2Button.setIcon(bombImage);
                }
                
                for( int i = 0; i < 16; i++)
                {
                    ((JButton) panel.getComponent(i)).setEnabled(false); // when prize or bomb is pressed make all button unable to press
                }
            }
            else
            {
                counter++;
                label.setText("You guessed " + counter + " time(s)");
                ((JButton) e.getSource()).setEnabled(false); // when straight button pressed just enable pressing button that just pressed
            }
            
        }
        
    }
}
