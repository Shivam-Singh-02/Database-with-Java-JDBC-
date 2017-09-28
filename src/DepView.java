import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DepView extends JFrame {
    
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1, b2;
    
    DBConnect connect = new DBConnect();
    
    
     public void changes(){
            try{
                connect.rs.next();
                String name = connect.rs.getString("name");
                String age = connect.rs.getString("age");
                t1.setText(name);
                t2.setText(age);    
        }
             catch(Exception ex){
                System.out.println(ex);
     }
    }
    
    public DepView(){
             this.setComponents();
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
             this.setSize(400,400);
             this.setLocationRelativeTo(null);
             this.setVisible(true);
        
    }
    
    public DepView(String s){
             super(s);
             this.setComponents();
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
             this.setSize(400,400);
             this.setLocationRelativeTo(null);
             this.setVisible(true);
    }
    
    public void setComponents(){
        l1 = new JLabel("Showing Records from Database") ;
        l2 = new JLabel("Name");
        l3 = new JLabel("Age");
        l4 = new JLabel();
        
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Next");
        b2 = new JButton("Menu");
        
        
    
        setLayout(null);
        
        l1.setBounds(20, 20, 200, 20);
        l2.setBounds(20, 50, 200, 20);
        t1.setBounds(140,50,100,20);
        l3.setBounds(20,70,200,20);
        t2.setBounds(140, 70, 100, 20);
        b1.setBounds(85, 150, 90, 30);
        b1.addActionListener(new Handler());
        b2.setBounds(200, 150, 100, 30);
        b2.addActionListener(new Handler1());
        l4.setBounds(20, 120, 200, 20);

    add(l1);
    add(l2);
    add(t1);
    add(l3);
    add(t2);
    add(b1);
    add(b2);
    add(l4);
    
    
    
    connect.getData();
    
     try{
                connect.rs.next();
                String name = connect.rs.getString("name");
                String age = connect.rs.getString("age");
                t1.setText(name);
                t2.setText(age);    
        }
             catch(Exception ex){
                System.out.println(ex);
     }
    
        
    
       
    
    
    
    
    
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            changes();
           
           
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
