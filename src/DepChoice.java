
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
public class DepChoice extends JFrame {
    
    JLabel j;
    JButton b1, b2, b3, b4, b5;
    
    //Start s;
    
    public DepChoice(){
         this.SetComponents();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         this.setSize(680,480);
         this.setLocationRelativeTo(null);
         this.setVisible(true);
    }
    
    public void SetComponents(){
         j  = new JLabel("Click the buttons below");
         b1 = new JButton("Insert");
         b2 = new JButton("View");
         b3 = new JButton("Modify");
         b4 = new JButton("Delete");
         b5 = new JButton("");
         setLayout(null);
         
         j.setBounds(20, 50, 200, 30);
         
         b1.setBounds(10,100,100,30);
         b2.setBounds(130, 100, 100, 30);
         b3.setBounds(270, 100, 100, 30);
         b4.setBounds(390, 100, 100, 30);
         
         b1.addActionListener(new Handler());
         b2.addActionListener(new Handler1());
         b3.addActionListener(new Handler2());
         b4.addActionListener(new Handler3());
         add(j);
         add(b1);
         add(b2);
         add(b3);
         add(b4); 
         add(b5);
         
         
    }
    
    
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
                      
             DepInsert g = new DepInsert("DataBase");
             
             dispose();
        }
        
    }
    
    class Handler1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
             DepView g2 = new DepView("DataBase");
             dispose();
            
        }
        
    }
    
     class Handler2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
             DepModify g3 = new DepModify("DataBase");
            
             dispose();
            
            
        }
        
    }
     
     
     class Handler3 implements ActionListener{
          @Override
        public void actionPerformed(ActionEvent e) {
            
             DepDel g4 = new DepDel("DataBase");
            
             dispose();
            
            
        }
         
     }
    
   
    
}
