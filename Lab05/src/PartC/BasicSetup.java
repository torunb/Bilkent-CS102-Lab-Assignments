package PartC;
import cs102.*;

// BasicSetup
// Boran, 16/07/2021

public class BasicSetup implements IHangmanSetup
{
	private static String[] words = { "Broken", "Magical", "I",
									"JRobo is the best", "amazing",
									"cool", "David", "Incredible" };

	public int getMaxAllowedIncorrectTries()
	{
		return 6;
	}

	public char	getBlankChar()
	{
		return '*';
	}

	public String getCharsToPreserve()
	{
		return " ";
	}

	public String getAllLetters()
	{
		return "abcdefghijklmnopqrstuvwxyz";
	}

	public String chooseSecretWord()
	{
		int random = (int) (Math.random() * words.length );
		return words[ random];
	}
}