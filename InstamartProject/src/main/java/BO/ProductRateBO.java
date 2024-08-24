package BO;

import DAO.ProductRateDAO;
import Domain.Product;
import Domain.ProductRate;
import java.sql.SQLException;

public class ProductRateBO {
    public ProductRate obtainProductRateByProduct(Product product) throws ClassNotFoundException, SQLException{
        ProductRateDAO productRateDAO = new ProductRateDAO();
        return productRateDAO.obtainProductRateById(product);
    }
    public ProductRate createProductRate(ProductRate rate) throws ClassNotFoundException, SQLException {
		return new ProductRateDAO().createProductRate(rate);
	}
}
