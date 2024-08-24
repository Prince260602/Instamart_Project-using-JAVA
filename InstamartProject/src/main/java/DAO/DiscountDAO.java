package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Domain.Discount;


public class DiscountDAO {
	 public ArrayList<Discount> listAllDiscount() throws ClassNotFoundException, SQLException{
		 	ArrayList<Discount> discountList = new ArrayList<Discount>();
	        Connection connection = DBConnection.getConnection();
	        

               //fill your code here


	        return discountList;
	    }
	 
	 public Discount findById(Integer id) throws ClassNotFoundException, SQLException{
		 Discount discount = null;
		 	Connection connection = DBConnection.getConnection();
	       

               //fill your code here


	        return discount;
	 }
}
