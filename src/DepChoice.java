
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author codedude
 */
public class DepChoice extends JFrame{
    
    JLabel j;
    JButton b1, b2;
    
    //Start s;
    
    public void SetComponents(){
         j  = new JLabel("Click the buttons below");
         b1 = new JButton("Insert");
         b2 = new JButton("View");
         
         setLayout(null);
         
         j.setBounds(20, 50, 200, 30);
         b1.setBounds(20, 100, 100, 30);
         b2.setBounds(130, 100, 120, 30);
         b1.addActionListener(new Handler());
         
         add(j);
         add(b1);
         add(b2);
         
         
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
        
             Gui g = new Gui("DataBase");
             g.setComponents();
             g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
             g.setSize(300,300);
             g.setVisible(true);
        }
        
    }
    
    class Handler1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            
        }
        
    }
    
   
    
}
