package PartF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.*;

public class TextFieldControlPanel extends JPanel
{
    // properties
    private JTextField txtField;
    private Hangman hangman;
    
    // constructors
    public TextFieldControlPanel(Hangman hangman)
    {
        txtField = new JTextField(20);
        this.hangman = hangman;
        txtField.addActionListener(new TxtListener());
        add( txtField);
    }
    
    // methods
    private class TxtListener implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            hangman.tryThis(txtField.getText().charAt(0));
            txtField.setText("");
        }
    }
}
