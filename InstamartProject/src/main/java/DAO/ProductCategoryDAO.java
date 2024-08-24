package DAO;

import BO.CatalogServiceAreaBO;
import Domain.Brand;
import Domain.CatalogServiceArea;
import Domain.ProductCategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryDAO {
    public ProductCategory obtainProductCategoryById(Integer id) throws ClassNotFoundException, SQLException{
        ProductCategory productCategory = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productCategory;
    }
    public ProductCategory obtainProductCategoryByCategory(String category) throws ClassNotFoundException, SQLException{
        ProductCategory productCategory = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productCategory;
    }
    public List<ProductCategory> listAllProductCategories()throws ClassNotFoundException, SQLException{
    	List<ProductCategory> productCategory = new ArrayList();
        Connection connection = DBConnection.getConnection();
        
        //fill your code here

        connection.close();
    	return productCategory;
    }
    public List<ProductCategory> listProductCategory(CatalogServiceArea serviceArea) throws ClassNotFoundException, SQLException{
		List<ProductCategory> productCategories = new ArrayList<ProductCategory>();
		Connection con = DBConnection.getConnection();
		
               //fill your code here

		con.close();
		return productCategories;
	}
}
