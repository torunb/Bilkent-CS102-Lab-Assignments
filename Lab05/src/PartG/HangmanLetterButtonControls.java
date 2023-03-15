package PartG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{
    // properties
    private Hangman hangman;
    
    // constructors
    public HangmanLetterButtonControls( Hangman hangman)
    {
        super(hangman.getAllLetters());
        this.hangman = hangman;
    }
    
    
	@Override
    public void updateView(Hangman hangmanModel) 
    {
		setEnabledAll(true);
        setDisabled(this.hangman.getUsedLetters());
	}
    
}
