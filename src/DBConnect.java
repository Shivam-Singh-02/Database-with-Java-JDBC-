
import java.sql.*;



/**
 *
 * @author codedude
 */
public class DBConnect {
    
    private Connection con;
    private Statement st;
    ResultSet rs;
    private PreparedStatement smt;
    
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
            //System.out.println("Records from database");
            /*while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                //System.out.println("Name: "+name+" "+"Age : "+age);
            }*/
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    
    public void putData(String name, int age){
        try{
            smt = con.prepareStatement("insert into Students values(?,?)");
            //String query = "insert into Students(name,age) values (\"" +name+ "\",\"" +age+"\")";
            //System.out.println(query);
            //st.executeUpdate(query);
            smt.setString(1,name);
            smt.setInt(2, age);
            smt.executeUpdate();
            
        }catch(Exception ex){
            
            System.out.println(ex);
        }            
    }
    
    public void updateData(String name, int age){
        try{
            smt = con.prepareStatement("update Students set age=? where name=?");  
            //String query = "insert into Students(name,age) values (\"" +name+ "\",\"" +age+"\")";
            //System.out.println(query);
            //st.executeUpdate(query);
            smt.setInt(1,age);
            smt.setString(2, name);
            smt.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public void delData(String name){
        try{
            smt = con.prepareStatement("delete from Students where name=?");
            smt.setString(1,name);
            smt.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
            
    
}
