
import java.sql.DriverManager;
import java.sql.*;



 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nuwan
 */
 
public class databaseconnection {
    

    /**
     *
     * @return
     */
    public static Connection connection()
   {
       try
       {
           Class.forName("org.sqlite.JDBC");
           String url ="jdbc:sqlite:C:\\\\Inventory_and_sales_mgt_system\\Database\\ismgt.db";
          
           Connection con = (Connection) DriverManager.getConnection(url);
           
          System.out.println("Done");
          return con;
       }
       catch(Exception e)
       {
           System.out.println(e);
           System.out.println("Failed");
           return null;
       }
       
   }       
            
    
}
