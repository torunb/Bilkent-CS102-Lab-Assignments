package PartG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class HangmanLetterButtonsController implements ActionListener
{
    // properties
    private Hangman hangman;
    
    public HangmanLetterButtonsController(Hangman hangman)
    {
        this.hangman = hangman;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        hangman.tryThis(((JButton) e.getSource()).getText().charAt(0));
        ((JButton) e.getSource()).setEnabled(false);
    }
}
