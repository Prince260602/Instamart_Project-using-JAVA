package BO;


import DAO.ProductCategoryDAO;
import Domain.CatalogServiceArea;
import Domain.ProductCategory;

import java.sql.SQLException;
import java.util.List;

public class ProductCategoryBO {
    public ProductCategory obtainProductCategoryById(Integer id) throws ClassNotFoundException, SQLException{
        ProductCategoryDAO productCategoryDAO = new ProductCategoryDAO();
        return productCategoryDAO.obtainProductCategoryById(id);
    }
    public ProductCategory obtainProductCategoryByCategory(String category) throws ClassNotFoundException, SQLException{
        ProductCategoryDAO productCategoryDAO = new ProductCategoryDAO();
        return productCategoryDAO.obtainProductCategoryByCategory(category);
    }
    public List<ProductCategory> listAllProductCategories()throws ClassNotFoundException, SQLException{
    	
    	return new  ProductCategoryDAO().listAllProductCategories();
    }
    public List<ProductCategory> listProductCategory(CatalogServiceArea serviceArea) throws ClassNotFoundException, SQLException{
		return new ProductCategoryDAO().listProductCategory(serviceArea);
	}
	
}
