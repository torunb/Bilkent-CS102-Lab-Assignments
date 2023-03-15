package PartF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class LabelHangmansView extends JPanel implements IHangmanView
{
    // properties
    private Hangman hangman;
    private JLabel numOfIncorrectTries;
    private JLabel knownSoFar;
    private JLabel usedLetters;
    private JLabel lost;
    
    public LabelHangmansView(Hangman hangman)
    {
        setPreferredSize(new Dimension(400, 600));
        this.hangman = hangman;
        setLayout( new BoxLayout(this, BoxLayout.PAGE_AXIS) );
        numOfIncorrectTries = new JLabel("Incorrect tries: " + hangman.getNumOfIncorrectTries());
        knownSoFar = new JLabel("Known so far: "+ hangman.getKnownSoFar());
        usedLetters = new JLabel("Letters that you used so far: " + hangman.getUsedLetters());
        lost = new JLabel("Have you lost the game: " + hangman.hasLost());

        add(numOfIncorrectTries);
        add(knownSoFar);
        add(usedLetters);
        add(lost);
    }
    
    
	@Override
    public void updateView(Hangman hangmanModel) 
    {
		numOfIncorrectTries.setText("Incorrect tries: " + hangmanModel.getNumOfIncorrectTries());
        knownSoFar.setText("Known so far: "+ hangmanModel.getKnownSoFar());
        usedLetters.setText("Letters that you used so far: " + hangmanModel.getUsedLetters());
        lost.setText("Have you lost the game: " + hangmanModel.hasLost());
	}
    
}
