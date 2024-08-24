package DAO;

import Domain.Product;
import Domain.ProductRate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRateDAO {
    public ProductRate obtainProductRateById(Product product) throws ClassNotFoundException, SQLException{
        ProductRate productRate = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productRate;
    }
    public ProductRate createProductRate(ProductRate rate) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into product_rate(product_id,rate,start_date) values(?,?,?)");
		
               //fill your code here

		return rate;
	}
}
