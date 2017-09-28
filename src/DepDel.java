/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DepDel extends JFrame {
    
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1, b2;
    
    DBConnect connect = new DBConnect();
    
    public DepDel(){
        
             this.setComponents();
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
             this.setSize(400,400);
             this.setLocationRelativeTo(null);
             this.setVisible(true);
    }
    
    public DepDel(String s){
        super(s);
             this.setComponents();
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
             this.setSize(400,400);
             this.setLocationRelativeTo(null);
             this.setVisible(true);
    }
    
    public void setComponents(){
        l1 = new JLabel("Enter Name of Record to be Deleted") ;
        l2 = new JLabel("Name");
        l3 = new JLabel();
        
        t1 = new JTextField();
        
        b1 = new JButton("Delete");
        b2 = new JButton("Menu");
    
        setLayout(null);
        
        l1.setBounds(20, 20, 300, 20);
        l2.setBounds(20, 50, 200, 20);
        t1.setBounds(140,50,100,20);
        b1.setBounds(85, 150, 90, 30);
        b1.addActionListener(new Handler());
        b2.setBounds(200, 150, 100, 30);
        b2.addActionListener(new Handler1());
        l3.setBounds(20, 120, 200, 20);

    add(l1);
    add(l2);
    add(t1);
    add(b1);
    add(b2);
    add(l3);
    
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           String name = t1.getText();
            connect.delData(name);
           l3.setText("Deleted");
           
        }
                  
    }
    
    
     class Handler1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
            DepChoice g1 = new DepChoice();
            dispose();
        }
    }
   
    
}
