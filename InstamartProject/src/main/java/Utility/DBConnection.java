package Utility;
 
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
 
 
public class DBConnection {

	static Connection con=null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {        

		try

		{

			Class.forName("oracle.jdbc.driver.OracleDriver");

			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","INSTAMARTDB","1998");

		}

		catch(SQLException ex)

		{

			ex.printStackTrace();

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return con;

 
    }

}