package PartF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class NewGameButtonControl extends JButton
{
    // properties
    private HangmanModel hangman;
    
    // constructors
    public NewGameButtonControl(HangmanModel hangman)
    {
        this.hangman = hangman;
        this.setText("New Game");
        this.addActionListener(new ButtonListener());
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            hangman.initNewGame();
        }
    }
}
