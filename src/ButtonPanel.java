
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class ButtonPanel extends JPanel{
    JButton ActionButton;
    ButtonPanel()
          
    {
        super();
        ActionButton = new JButton("Start Game");
        add(ActionButton, BorderLayout.SOUTH);
    }
    
    public void setTextEnter(){
        ActionButton.setText("Enter");
    }
    
}
