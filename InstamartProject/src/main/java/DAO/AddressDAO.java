package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BO.UserBO;
import Domain.Address;

public class AddressDAO {
	
	public Address findById(Integer id) throws ClassNotFoundException, SQLException{
		Address address = null;
		Connection con = DBConnection.getConnection();

		//fill your code

		return address;		
	}
	
	public ArrayList<Address> findByUserId(Integer userId) throws ClassNotFoundException, SQLException{
		ArrayList<Address> addressList = new ArrayList<>();
		Connection con = DBConnection.getConnection();

		//fill you code here

		return addressList;		
	}
	
	public ArrayList<Address> findByUserId(Integer userId, String city) throws ClassNotFoundException, SQLException{
		ArrayList<Address> addressList = new ArrayList<>();
		Connection con = DBConnection.getConnection();
		
               //fill your coe here


		return addressList;		
	}
	
	public Address create(Address address,Integer userId) throws ClassNotFoundException, SQLException{
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into address(user_id,street,city,state,country,pincode) values(?,?,?,?,?,?)");
		

                //fill your coe here

                  
		return address;
		
	}

}
