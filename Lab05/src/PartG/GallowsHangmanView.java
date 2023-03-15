package PartG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class GallowsHangmanView extends JPanel implements IHangmanView
{
    // properties
    private HangmanModel model;
    
    // constructors
    public GallowsHangmanView(HangmanModel model)
    {
        setPreferredSize(new Dimension(400,600));
        //model = new HangmanModel(new BasicSetup());
        this.model = model;
        setVisible(true);
    }
    
    // methods
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(20, 400, 300, 30);
        g.fillRect(30, 100, 10, 300);
        g.fillRect(40, 100, 150, 10);
        g.fillRect(170, 110, 6, 30);
        
        if(model.getNumOfIncorrectTries() == 1)
        {
            g.drawOval(143, 140, 60, 60);
        }
        if(model.getNumOfIncorrectTries() == 2)
        {
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
        }
        if(model.getNumOfIncorrectTries() == 3)
        {
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
        }
        if(model.getNumOfIncorrectTries() == 4)
        {
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
            g.drawLine(173, 200, 133, 240);
        }
        if(model.getNumOfIncorrectTries() == 5)
        {
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
            g.drawLine(173, 200, 133, 240);
            g.drawLine(173, 280, 213, 320);
        }
        if(model.getNumOfIncorrectTries() == 6)
        {
            g.drawOval(143, 140, 60, 60);
            g.drawLine(173, 200, 173, 280);
            g.drawLine(173, 200, 213, 240);
            g.drawLine(173, 200, 133, 240);
            g.drawLine(173, 280, 213, 320);
            g.drawLine(173, 280, 133, 320);
        }
    }
    
    @Override
    public void updateView(Hangman hangmanModel) 
    {
		repaint();
    }
    
}
