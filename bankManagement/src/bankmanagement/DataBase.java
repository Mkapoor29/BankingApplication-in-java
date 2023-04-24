package bankmanagement;
import java.sql.*;
public class DataBase {
    Connection cp; //2) create connection object
    Statement st;
    public DataBase(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver"); // 1) register driver class 
            cp =DriverManager.getConnection("jdbc:mysql:///bank","root","helloworld29");  
            //getConnection is used to establish connection with databse
            st =cp.createStatement(); 
            // createStatement() method of connection interface is used to create statement. The object of Statement is responsible for excuting queries with database.
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
