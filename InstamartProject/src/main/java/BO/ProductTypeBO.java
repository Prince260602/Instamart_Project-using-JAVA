package BO;

import DAO.ProductTypeDAO;
import Domain.ProductCategory;
import Domain.ProductType;

import java.sql.SQLException;
import java.util.List;

public class ProductTypeBO {
    public ProductType obtainProductTypeById(Integer id) throws ClassNotFoundException, SQLException{
        ProductTypeDAO productTypeDAO = new ProductTypeDAO();
        return productTypeDAO.obtainProductTypeById(id);
    }
    public ProductType obtainProductTypeByType(String type) throws ClassNotFoundException, SQLException{
        ProductTypeDAO productTypeDAO = new ProductTypeDAO();
        return productTypeDAO.obtainProductTypeByType(type);
    }
    public List<ProductType> listProductTypes(ProductCategory productCategory) throws ClassNotFoundException, SQLException{
		return new ProductTypeDAO().listProductTypes(productCategory);
	}
    public List<ProductType> obtainAllProductType() throws ClassNotFoundException, SQLException{
    	return new ProductTypeDAO().obtainAllProductType();
    }
}
