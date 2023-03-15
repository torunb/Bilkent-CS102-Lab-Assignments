package PartB;

import cs102.*;
/**
 * ConsoleHangmanView
 * @author boran
 * @version 1.00 16/07/2021
 */
public class ConsoleHangmanView implements IHangmanView
{
    public void updateView(Hangman hangman)
    {
        System.out.println("Word that known so far: " + hangman.getKnownSoFar());
        System.out.println("Letters that you can use: " + hangman.getAllLetters());
        System.out.println("Letters that you tried so far: " + hangman.getUsedLetters());
        System.out.println("You have " + (hangman.getMaxAllowedIncorrectTries() - hangman.getNumOfIncorrectTries()) + " wrong predictions left" );
    }
}
