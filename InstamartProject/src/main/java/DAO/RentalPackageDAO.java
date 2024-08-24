
package DAO;

import BO.ProductBO;
import Domain.RentalPackage;
import Domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class RentalPackageDAO {

	public RentalPackage findById(Integer id) throws SQLException, ClassNotFoundException {
        RentalPackage rentalPackage = null ;
        Connection connection = DBConnection.getConnection();
        
        //fill your code here


        connection.close();
        return rentalPackage;
	}
	 public List<RentalPackage> getAvailableRentalPackages(String city) throws SQLException, ClassNotFoundException {
	        List<RentalPackage> packageList = new ArrayList<RentalPackage>();
	        Connection connection = DBConnection.getConnection();
	      

              //fill your code here


	        connection.close();
	        return packageList;
    }
	 public List<RentalPackage> obtainAllPackages(boolean visibility,boolean availability) throws SQLException, ClassNotFoundException {
	        List<RentalPackage> packageList = new ArrayList<RentalPackage>();
	        Connection connection = DBConnection.getConnection();
	       
               //fill your code here


	        connection.close();
	        return packageList;
 }
	 public List<RentalPackage> obtainAllPackagesForManager() throws SQLException, ClassNotFoundException {
	        List<RentalPackage> packageList = new ArrayList<RentalPackage>();
	        Connection connection = DBConnection.getConnection();
	       
               //fill your code here

	        connection.close();
	        return packageList;
}
    public List<RentalPackage> getRentalPackagesByOrder(Integer orderDetailId) throws SQLException, ClassNotFoundException {
        List<RentalPackage> packageList = new ArrayList<RentalPackage>();
        Connection connection = DBConnection.getConnection();
        
        //fill your code here

        connection.close();
        return packageList;
    }
    public void updateVisibility(RentalPackage pack) throws SQLException, ClassNotFoundException{
    	
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.executeUpdate("update rental_package set is_visible="+pack.getIsVisible()+" where id = "+pack.getId()+"");
		con.close();
	}
    
}
