package lab04b;

import cs101.sosgame.SOS;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * This class creates gui panel for sos game
 * @author boran
 * @version 09.07.2021
 */ 
public class SOSGUIPanel extends JPanel
{
    Scanner scan = new Scanner(System.in);
    
    // constants
    /**
	 *I don't know what it is. When I extended JFrame it automatically came
	 */
	private static final long serialVersionUID = 1L;
    
    // properties
    private JPanel scorePanel1;
    private JPanel comboboxPanel;
    private SOS game;
    private SOSCanvas canvas;
    private JLabel label1;
    private JLabel label2;
    private JLabel gameOver;
    private JComboBox<String> choice;
    private String[] letters;
    private String player1;
    private String player2;
    private int score1;
    private int score2;
    private int row;
    private int col;
    
    // constructor
    public SOSGUIPanel(SOS game, String player1, String player2)
    {
        setLayout(new BorderLayout());
        
        this.player1 = player1;
        this.player2 = player2;
        this.game = game;
        
        scorePanel1 = new JPanel(); // panel for scores
        comboboxPanel = new JPanel(); // panel for combobox
        
        letters = new String[2]; // creating letters for combobox
        letters[0] = "S";
        letters[1] = "O";
        
        // set scores to 0
        score1 = 0;
        score2= 0;
        
        // create the labels
        label1 = new JLabel();
        label2 = new JLabel();
        gameOver = new JLabel();
        
        // set text for labels
        label1.setText(player1 + " " + score1 + " - ");
        label2.setText(score2 + " " + player2);
        
        // add labels to panel
        scorePanel1.add(label1);
        scorePanel1.add(label2);
        
        // create combobox with strings
        choice = new JComboBox<String>(letters);
        comboboxPanel.add(choice); // add to the combobox panel
        
        // initialize the canvas
        canvas = new SOSCanvas( game);
        
        // add panels to SOSGUIPanel
        this.add(scorePanel1, BorderLayout.NORTH);
        this.add(comboboxPanel, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
        
        // create the listener
        SOSListener listener = new SOSListener();
        
        // add listeners to the class
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }
    
    /**
     * This class creates listener for sos game by using mouseClicked method
     */ 
    private class SOSListener extends MouseAdapter
    {
        @Override
        public void mouseClicked( MouseEvent e)
        {
            int x = e.getPoint().x;
            int y = e.getPoint().y;
            
            col = y / ((400 / game.getDimension()) + 1);
            row = x / ((400 / game.getDimension()) + 1);

            
            // if user selects the S play the S
            if( choice.getSelectedItem().toString().charAt(0) == 'S')
            {
                game.play('s', row , col);
                score1 = game.getPlayerScore1();
                score2 = game.getPlayerScore2();
                label1.setText( player1 + " " + score1 + " - ");
                label2.setText(score2 + " " + player2);
                    
                if( game.getTurn() == 1)
                {
                    label1.setForeground(new Color( 255, 192, 203)); // light pink rgb
                    label2.setForeground(Color.BLACK);
                }
                else
                {
                    label2.setForeground(new Color( 255, 192, 203)); // light pink rgb
                    label1.setForeground(Color.BLACK);
                }
            }
            // if user selects the O play O
            else if( choice.getSelectedItem().toString().charAt(0) == 'O')
            {
                game.play('o', row, col);
                score1 = game.getPlayerScore1();
                score2 = game.getPlayerScore2();
                label1.setText( player1 + " " + score1 + " - ");
                label2.setText(score2 + " " + player2);
                    
                if( game.getTurn() == 1)
                {
                    label1.setForeground(new Color( 255, 192, 203)); // light pink rgb
                    label2.setForeground(Color.BLACK);
                }
                else
                {
                    label2.setForeground(new Color( 255, 192, 203)); // light pink rgb
                    label1.setForeground(Color.BLACK);
                }
            }
                
            repaint(); // repaint when mouse is clicked every time
            
            // if game is over show optionpane
            if(game.isGameOver() )
            {
                if( score1 > score2) // if player 1 scores more than player 2 
                {
                    JOptionPane.showMessageDialog( gameOver , player1 + " won the game!");
                }
                else if( score2 > score1) // if player 2 scores more than player 1 
                {
                    JOptionPane.showMessageDialog( gameOver , player2 + " won the game!");
                }
                else
                {
                    JOptionPane.showMessageDialog( gameOver , "TIE!"); // if it is tie
                }
            }
            else
            {
                
            }
        }
    }
    
}
