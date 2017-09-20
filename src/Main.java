
import java.util.Scanner;



/**
 *
 * @author codedude
 */
public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        DBConnect connect = new DBConnect();
        
        Scanner scanner = new Scanner(System.in);
        int choice ;
        
        String name ;
        int age;

        
        System.out.println("Enter 1 to insert, 2 to fetch data : ");
        
        choice = scanner.nextInt();
        
        if(choice == 1){
        
        System.out.println("Enter name and age to add in record : ");
        name = scanner.next();
            age = scanner.nextInt();
        
        connect.putData(name,age);
        }
    }
    
}
