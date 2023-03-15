package PartG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class NewGameButtonControl extends JButton implements IHangmanView
{
    // properties
    private HangmanModel hangman;
    
    // constructors
    public NewGameButtonControl(HangmanModel hangman)
    {
        this.hangman = hangman;
        this.setText("New Game");
        this.addActionListener(new ButtonListener());
        setEnabled(false);
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if( hangman.isGameOver())
            {
                hangman.initNewGame();
                setEnabled(false);
            }
            else
                setEnabled(false);    
        }
    }

	@Override
    public void updateView(Hangman hangmanModel) 
    {
        if( hangman.isGameOver())
        {
            setEnabled(true);
        }
	}
}
