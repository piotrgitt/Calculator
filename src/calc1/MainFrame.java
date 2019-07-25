/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Piotr
 */
public class MainFrame extends JFrame{
        private Dimension size;
        private JPanel buttonPanel;
        private TextPanel textPanel;
        private JButton button0;
        private JButton button1;
    
    public MainFrame(){
        super("Calculator");
        size = new Dimension(350, 530);
        setPreferredSize(size);
        setMinimumSize(size);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        pack();
        
        //////////////////////
        buttonPanel = new ButtonPanel();
        textPanel = new TextPanel();
        
        //setting buttons
        button0 = new JButton("0");
        button0.setVisible(true);
        button1 = new JButton("1");
        button1.setVisible(true);
        
        //setting dimensions
        Dimension dimension = textPanel.getPreferredSize();
        dimension.height = 100;
        textPanel.setSize(dimension);
        
        //SETTING BUTTON PANEL
        add(textPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        
        //SETTING BUTTON LISTENER
        
        
        add(textArea, BorderLayout.CENTER);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
    
    
    public void setWindow(){
        
        
    }
}
