package PartF;


import cs102.Hangman;
import javax.swing.JPanel;
// ConsoleHangmanView
// David, 6/4/2013

public class ConsoleHangmanView extends JPanel implements IHangmanView
{
	@Override
	public void updateView( Hangman hangman)
	{
		System.out.println( "[" + hangman.getNumOfIncorrectTries() + "] "
								+ hangman.getKnownSoFar() );

		if ( hangman.isGameOver() )
			if ( hangman.hasLost() )
				System.out.println( "Sorry, you lost!");
			else
				System.out.println( "Congratulations, you won.");
	}
}