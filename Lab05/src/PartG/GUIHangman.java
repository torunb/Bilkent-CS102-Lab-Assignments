package PartG;


import java.awt.*;
import cs102.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		HangmanModel		hangman;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView	consoleView;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);

		consoleView = new ConsoleHangmanView();
		hangman.addView( consoleView);

		// things that I've done
		TextFieldControlPanel txtPanel = new TextFieldControlPanel(hangman);
		NewGameButtonControl newGameButton = new NewGameButtonControl(hangman);	
		LabelHangmansView labelView = new LabelHangmansView(hangman);
		GallowsHangmanView gallowView = new GallowsHangmanView(hangman);
		LetterButtonControls controls = new LetterButtonControls(hangman.getAllLetters());
		HangmanLetterButtonsController controller = new HangmanLetterButtonsController(hangman);
		HangmanLetterButtonControls buttonControls = new HangmanLetterButtonControls(hangman);
		
		
		controls.addActionListener(controller);
		buttonControls.addActionListener(controller);
		hangman.addView(labelView);
		hangman.addView(gallowView);
		hangman.addView(newGameButton);
		hangman.addView(buttonControls);
		
		labelView.updateView(hangman);
		gallowView.updateView(hangman);
		newGameButton.updateView(hangman);	
		buttonControls.updateView(hangman);
		
		new SimpleJFrame( "GUIHangman", 	// title
							gallowView,			// center
							txtPanel, newGameButton,		// north, south
							buttonControls, labelView );	// east, west

		// this is an infinite loop reading from the console... not clever!
		ConsoleControl.controlFor( hangman);
	}

	public static void main( String[] args)
	{
		new GUIHangman();

//		// This is the approved way to initialise GUIs
//		// but won't work with the ConsoleControl as is!
//		// --------------------------------------------
//		SwingUtilities.invokeLater(
//			new Runnable() {
//			    public void run() {
//	        		new GUIHangman();
//	        		new GUIHangman();
//	    		}
//			});
	}

} // end of class GUIHangman
