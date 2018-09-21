/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
/**
 *
 * @author Adam
 */
public class GameFrame extends JFrame  {
    
    private MainPanel panel;
    
    
    GameFrame(){
        super ("IST Adventure");
        setSize (600, 450);
        MainPanel panel = new MainPanel();
        getContentPane().add(panel,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
   
}
