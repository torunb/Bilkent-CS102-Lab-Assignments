package PartB;
import cs102.*;
/**
 * HangmanModel
 * @author boran
 * @version 1.00 16/07/2021
 */
public class HangmanModel extends Hangman
{
    // properties
    private IHangmanView view;
    
    // constructor
    public HangmanModel(BasicSetup bs)
    {
        super(bs);
    }
    
    // methods
    public void addView(IHangmanView hView)
    {
        view = hView;
    }
    
    public void update()
    {
        view.updateView(this);
    }
    
    @Override
    public int tryThis(char chr)
    {
        int i = super.tryThis(chr);
        update();
        return i;
    }
}
