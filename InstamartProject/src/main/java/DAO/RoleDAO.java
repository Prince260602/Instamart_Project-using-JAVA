package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.Role;

public class RoleDAO {

	public Role findRoleById(Integer roleId) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		

                //fill your code here


		return null;
		
	}
	public Role getCustomerRole() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		
               //fill your code here

		return null;
		
	}
}
