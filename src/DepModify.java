import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DepModify extends JFrame {
    
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    
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
    
    public DepModify(){
        
    }
    
    public DepModify(String s){
        super(s);
    }
    
    public void setComponents(){
        l1 = new JLabel("Enter Record to be modified(On basis of Name)") ;
        l2 = new JLabel("Name");
        l3 = new JLabel("Age");
        l4 = new JLabel();
        
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Update");
        
        
    
        setLayout(null);
        
        l1.setBounds(20, 20, 400, 20);
        l2.setBounds(20, 50, 200, 20);
        t1.setBounds(140,50,100,20);
        l3.setBounds(20,70,200,20);
        t2.setBounds(140, 70, 100, 20);
        b1.setBounds(85, 150, 90, 30);
        b1.addActionListener(new Handler());
        l4.setBounds(20, 120, 200, 20);

    add(l1);
    add(l2);
    add(t1);
    add(l3);
    add(t2);
    add(b1);
    add(l4);
    
    
    
    
    
        
    
       
    
    
    
    
    
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String name = t1.getText();
            int age = Integer.parseInt(t2.getText());
            System.out.println(name);
            connect.updateData(name,age);
            l4.setText("Updated");
           
           
        }
               
       
        
    }
   
    
}
