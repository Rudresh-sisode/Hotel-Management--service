
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rudr'a
 */
public class JavaConnect {
     Connection conn=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:Priyanka.sqlite");
           // JOptionPane.showMessageDialog(null,"connection established");
                    
          return conn;  
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e+"\nConnection Error\nplease check..");
            return null;
        }
        
    }
    public static void main(String... arvs)
    {
      // JavaConnect.ConnectDB();
        
    }
      
    
    
}
