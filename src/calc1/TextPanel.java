/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Piotr
 */
public class TextPanel extends JPanel {
    private final JTextArea textArea;
    private Dimension dimension;
    
    public TextPanel(){
        //super();
        setLayout(new BorderLayout());
        //SETTING BORDERS OF PANEL
        setBorder(BorderFactory.createLineBorder(Color.black));

        
        
        textArea = new JTextArea();
        textArea.setEditable(true);
       
        //SETTING BORDERS OF 'textArea'
        textArea.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        
        
        //SETTING TEXT ORIENTATION(write from right to left)
        textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        
        //SETTING FONT
        textArea.setFont(new Font("Hack13", Font.BOLD, 30));
        textArea.setEditable(false);
        
        //SETTING BUTTON LISTENER
        add(textArea, BorderLayout.CENTER);
        
    }
    
    public void setText(String text){
        textArea.append(text);
    }
}
