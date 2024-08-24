package DAO;
 
import java.sql.*;

import java.text.SimpleDateFormat;
 
import BO.AddressBO;

import BO.RoleBO;

import Domain.Role;

import Domain.User;

import Utility.DBConnection;
 
public class UserDAO {

	public User validateLogin(String username,String password) throws ClassNotFoundException, SQLException{

        User user =null;

        Connection connection = DBConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = '"+username+"' and password = '"+password+"';");

        ResultSet rs = preparedStatement.executeQuery();

        RoleBO roleBO = new RoleBO();

        AddressBO addressBO = new AddressBO();

        if(rs.next()) {

            Role role = roleBO.findRoleById(rs.getInt("role_id"));

            user = new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),rs.getDate("dob"),rs.getInt("age"),rs.getString("contact_no"), rs.getString("email"),rs.getString("username"),rs.getString("password"), role);

            user.setAddressList(addressBO.findByUserId(user.getId()));

        }

        connection.close();

        return user;

    }

	public User findById(Integer id) throws ClassNotFoundException, SQLException {

		Connection con = DBConnection.getConnection();

		PreparedStatement ps = con.prepareStatement("select * from users where id=?");

		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();

		if(rs.next()) {

			Role role = new RoleBO().findRoleById(rs.getInt(10));

			User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), role);			

			con.close();

			return user;

		}

		return null;		

	}
 
	public boolean findUserByUsername(String username) throws ClassNotFoundException, SQLException {

		Connection con = DBConnection.getConnection();

		PreparedStatement ps = con.prepareStatement("select * from users where username=?");

		ps.setString(1, username);

		ResultSet rs = ps.executeQuery();

		if(rs.next()) {			

			con.close();

			return true;

		}

		return false;		

	}

	public Integer createUser(User user) throws SQLException, ClassNotFoundException {

		PreparedStatement ps=null;

		Connection con = DBConnection.getConnection();

		 ps = con.prepareStatement("select max(id) from users");

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {			

				Integer a=rs.getInt(1);


		 ps = con.prepareStatement("Insert into users(id,first_name,last_name,email,username,password,role_id) values(?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

		// insert into users(id,first_name,last_name,email,username,password,role_id) values(13,'David','Ross','david12@gmail.com','david12@gmail.com','david12@gmail.com',1)


		ps.setInt(1, a+1);

		ps.setString(2, user.getFirstName());

		ps.setString(3, user.getLastName());

		ps.setString(4, user.getEmail());

		ps.setString(5, user.getUsername());

		ps.setString(6, user.getPassword());

		ps.setLong(7, 2);

		int rowAffected = ps.executeUpdate();

		Integer userId = null;

		if(rowAffected == 1)

        {

        	ResultSet rset = ps.getGeneratedKeys();

            if(rset.next())

            	userId = 1;

        }

		con.close();

			}

		return 1;


	}

	public void updateContactDetail(User user) throws SQLException, ClassNotFoundException{

		Connection con = DBConnection.getConnection();

		Statement stmt = con.createStatement();


		String query="update users set dob='"+new java.sql.Date(user.getDob().getTime())+"', age="+user.getAge()+", contact_no='"+user.getContactNo()+"' where id="+user.getId()+"";

		stmt.executeUpdate(query);

		con.close();

	}

	public void updateProfile(User user) throws SQLException, ClassNotFoundException{

		Connection con = DBConnection.getConnection();

		Statement stmt = con.createStatement();

		stmt.executeUpdate("update users set first_name='"+user.getFirstName()+"', last_name='"+user.getLastName()+"', email='"+user.getEmail()+"', password='"+user.getPassword()+"', dob='"+new java.sql.Date(user.getDob().getTime())+"', age="+user.getAge()+", contact_no='"+user.getContactNo()+"' where id="+user.getId()+";");

		con.close();

	}

}