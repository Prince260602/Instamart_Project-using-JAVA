package BO;

import java.sql.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.DBConnection;
import DAO.UserDAO;
import Domain.User;

public class UserBO {

	public User validateLogin(String username,String password) throws ClassNotFoundException, SQLException{
        UserDAO userDAO = new UserDAO();
        return userDAO.validateLogin(username, password);
    }
	
	public User findById(Integer id) throws ClassNotFoundException, SQLException {
		return new UserDAO().findById(id);
	}
	public boolean findUserByUsername(String username) throws ClassNotFoundException, SQLException {
		return new UserDAO().findUserByUsername(username);
	}
	public Integer createUser(User user) throws ClassNotFoundException, SQLException {
		return new UserDAO().createUser(user);
	}
	public void updateContactDetail(User user) throws SQLException, ClassNotFoundException{
		new UserDAO().updateContactDetail(user);
	}
	public void updateProfile(User user) throws SQLException, ClassNotFoundException{
		// new UserDAO().updateProfile(user);
	}
}
