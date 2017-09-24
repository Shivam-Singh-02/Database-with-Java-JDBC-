
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author codedude
 */
public class Start {
    
    DepChoice g1;
    
    
    public void getStart(){
        g1 = new DepChoice();
        g1.SetComponents();
        g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g1.setSize(300,300);
        g1.setVisible(true);
        
    
    }
    
    
        
    
}
