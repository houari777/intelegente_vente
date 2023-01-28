package intelegente_vente;



import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
    
        try {
                          //com.mysql.jdbc.Driver
         String url = "jdbc:sqlite:Produit_DB.db"; //loading the driver
               
          
            //Establishing a Connection                               / /URL //Port No://DB Name//UID//Password
            Connection  conn= DriverManager.getConnection(url);
                                                          
          //  JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    
     } //End ConnectDB Method Here
    
    } //End MysqlConnect Class Here
