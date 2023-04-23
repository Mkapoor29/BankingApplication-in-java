package bankmanagement;
import java.sql.*;
public class DataBase {
    Connection cp;
    Statement st;
    public DataBase(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            cp =DriverManager.getConnection("jdbc:mysql:///bank","root","helloworld29");    
            st =cp.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
