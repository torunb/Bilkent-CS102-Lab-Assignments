package PartC;
import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 * @author boran
 * @version 1.00 16/07/2021
 */

public class ConsoleHangmanC
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		HangmanModel		hangman;
		String letter;
        String state;
        int letterOccurance;
        boolean playAgain;
        ConsoleHangmanView chv1;
        ConsoleHangmanView chv2;

		// PROGRAM CODE
		

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show hangman status, until hangmanover. Finally report win/lose.
        playAgain = true; 
        chv1 = new ConsoleHangmanView();
        chv2 = new ConsoleHangmanView();

        while (playAgain) 
        { 
            hangman = new HangmanModel( new BasicSetup() ); 
            hangman.addView(chv1);
            hangman.addView(chv2);
            System.out.println( hangman.getKnownSoFar() );
            System.out.println();
            System.out.println( "Welcome to the hangman hangman."); // Print welcome message
            System.out.println();

            // Do these things until hangman is over
            do
            {
                chv1.updateView(hangman);
                System.out.println( "Please enter a letter: "); // Ask & get for the letter
                letter = scan.next();
                letterOccurance = hangman.tryThis(letter.charAt(0)); // try the letter in tryThis method
                
                if ( letter.length() != 1)
                {
                    System.out.println();
                    System.out.println( "Please enter one letter!");
                }
                else 
                {
                    // If occurance of leter is -1 that means user didn't enter a valid character
                    if(letterOccurance == -1)
                    {
                        System.out.println("Please enter a valid character");
                    }
                    else
                    {
                        if ( letterOccurance == -3 )
                        {
                            System.out.println(  );
                            System.out.println( "hangman is over");
                        }
                        else if ( letterOccurance == -2 )
                        {
                            System.out.println(  );
                            System.out.println( "You entered this letter already! Can you enter a new one?");
                        }
                        else if ( letterOccurance == 0 ) 
                        {
                            System.out.println(  );
                            System.out.println( "Wrong guess. The letter you entered is not in the secret word");
                        }
                        else 
                        {
                            System.out.println(  );
                            System.out.println( "Correct guess. The letter you entered is in the secret word");
                        }   
                    }
                }

            } while (!hangman.isGameOver());

            if (hangman.hasLost())
            {
                System.out.println( "Sorry, but you lost the game."); // if user losts the hangman print sorry message
            }
            else if (!hangman.hasLost())
            {
                System.out.println( "Congrats, you won the game."); // if user wins the hangman print congrulation message
            }
            
            System.out.println( "Do you want to play again?" + "\n" + "If yes, enter \"y\"");
            state = scan.next();
            if( state.equalsIgnoreCase("y"))
            {
                playAgain = true;
                hangman.initNewGame();
            }
            else
            {
                playAgain = false;
                System.out.println( "Goodbye! We hope we can see you soon."); // Print goodbye message
            }
        }


		System.out.println( "\nEnd of ConsoleHangman\n" );
		scan.close();
	}

} // end of class ConsoleHangman
