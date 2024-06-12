
package banking.system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "adityajha");
            s = c.createStatement();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
