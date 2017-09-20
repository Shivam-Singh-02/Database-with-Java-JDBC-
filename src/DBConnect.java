
import java.sql.*;



/**
 *
 * @author codedude
 */
public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
            st = con.createStatement();
            
        }catch(Exception ex){
        
            System.out.println("Error :"+ex);
        }
    }
    
    
    public void getData(){
        try{
            
            String query = "Select * from Students";
            rs = st.executeQuery(query);
            System.out.println("Records from database");
            while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                System.out.println("Name: "+name+" "+"Age : "+age);
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    
    public void putData(String name, int age){
        try{
            
            String query = "insert into Students(name,age) values (\"" +name+ "\",\"" +age+"\")";
            System.out.println(query);
            st.executeUpdate(query);
            
            
            
        }catch(Exception ex){
            
            System.out.println(ex);
        }            
    }
}
