/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Piotr
 */
public class ButtonPanel extends JPanel {
        private JButton[] buttons;
        ButtonListener buttonListener;
        
    public ButtonPanel(){
        //super();
        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(new GridLayout(4,4));
        buttons = new JButton[16];
        
        //CREATING BUTTONS
        for(int i=0; i<16; i++){
            buttons[i] = new JButton();
            add(buttons[i]);
            buttons[i].setFont(new Font("Hack13", Font.BOLD, 20));
        }
        
        ///CREATE BUTTONS
        buttons[0].setText("7");
        buttons[1].setText("8");
        buttons[2].setText("9");
        buttons[3].setText("x");
        buttons[4].setText("4");
        buttons[5].setText("5");
        buttons[6].setText("6");
        buttons[7].setText("-");
        buttons[8].setText("1");
        buttons[9].setText("2");
        buttons[10].setText("3");
        buttons[11].setText("+");
        buttons[12].setText(" ");
        buttons[13].setText("0");
        buttons[14].setText(",");
        buttons[15].setText("=");

        //button1 = new Button("");
        buttons[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(buttons[0].getText());
            }
        });
    }
    
    
    public void setButtonListener(ButtonListener buttonListener){
        this.buttonListener = buttonListener;
    }
    
    
}
