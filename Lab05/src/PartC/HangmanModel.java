package PartC;

import cs102.*;
import java.util.*;

/**
 * HangmanModel
 * @author boran
 * @version 1.00 16/07/2021
 */

public class HangmanModel extends Hangman
{
    // properties
    private ArrayList<IHangmanView> views;
    
    // constructor
    public HangmanModel(BasicSetup bs)
    {
        super(bs);
        views = new ArrayList<IHangmanView>();
    }
    
    public void addView(IHangmanView hView)
    {
        views.add(hView);
    }
    
    public void update()
    {
        for( int i = 0; i < views.size(); i++)
        {
            views.get(i).updateView(this);
        }
    }
    
    @Override
    public int tryThis(char chr)
    {
        int i = super.tryThis(chr);
        update();
        return i;
    }
}
