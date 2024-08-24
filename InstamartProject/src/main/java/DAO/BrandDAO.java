package DAO;

import Domain.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrandDAO {
    public Brand obtainBrandById(Integer id) throws ClassNotFoundException, SQLException{
        Brand brand = null;
        Connection connection = DBConnection.getConnection();
       
       //fill your coe here


        return brand;
    }
    public Brand obtainBrandByName(String name) throws ClassNotFoundException, SQLException{
        Brand brand = null;
        Connection connection = DBConnection.getConnection();
       

       //fill your coe here


        return brand;
    }
    public List<Brand> listBrands() throws ClassNotFoundException, SQLException{
		List<Brand> brandList = new ArrayList<Brand>();
		Connection con = DBConnection.getConnection();
		
               //fill your coe here

		return brandList;
	}
}
