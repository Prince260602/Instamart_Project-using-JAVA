package DAO;

import BO.ProductCategoryBO;
import Domain.ProductCategory;
import Domain.ProductType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductTypeDAO {
    public ProductType obtainProductTypeById(Integer id) throws ClassNotFoundException, SQLException{
        ProductType productType = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productType;
    }
    public ProductType obtainProductTypeByType(String type) throws ClassNotFoundException, SQLException{
        ProductType productType = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productType;
    }
    public List<ProductType> listProductTypes(ProductCategory productCategory) throws ClassNotFoundException, SQLException{
		List<ProductType> productTypes = new ArrayList<ProductType>();
		Connection con = DBConnection.getConnection();
		
               //fill your code here

		con.close();
		return productTypes;
	}
    
    
    public List<ProductType> obtainAllProductType() throws ClassNotFoundException, SQLException{
        List<ProductType> productTypes = new ArrayList<ProductType>();
        Connection con = DBConnection.getConnection();
      
        //fill your code here

        con.close();
        return productTypes;
    }
}
