package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb= ResourceBundle.getBundle("oracle");//change to oracle properties file
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
         Connection con;
        Class.forName("");//java oracle driver
        
        con = DriverManager.getConnection(url,username,password);
        
        return con;

    }
}