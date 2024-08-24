package BO;

import DAO.ProductDAO;
import Domain.Product;
import Domain.ProductRate;

import java.sql.SQLException;
import java.util.List;

public class ProductBO {
	
	public Product findById(Integer id) throws ClassNotFoundException, SQLException{
		ProductDAO productDAO=new ProductDAO();
		return productDAO.findById(id);
	}
	
	 public List<Product> obtainAvailableProduct(String city) throws ClassNotFoundException, SQLException, Exception{
	        ProductDAO productDAO=new ProductDAO();
	        return productDAO.obtainAvailableProduct(city);
     }
	 public List<Product> obtainAllProducts(boolean visibility,boolean availability) throws ClassNotFoundException, SQLException, Exception{
	        ProductDAO productDAO=new ProductDAO();
	        return productDAO.obtainAllProducts(visibility,availability);
  }  
	 public List<Product> obtainAllProductsForManager() throws ClassNotFoundException, SQLException, Exception{
	        ProductDAO productDAO=new ProductDAO();
	        return productDAO.obtainAllProductsForManager();
}  
	public List<Product> getProductsByOrder(Integer orderDetailId) throws ClassNotFoundException, SQLException, Exception{
	        ProductDAO productDAO=new ProductDAO();
	        return productDAO.getProductsByOrder(orderDetailId);
	}
	    
	public List<Product> getProductsByPackage(Integer packageId) throws ClassNotFoundException, SQLException {
	        ProductDAO productDAO=new ProductDAO();
	        return productDAO.getProductsByPackage(packageId);
	}
	public Product addProduct(Product p) throws ClassNotFoundException, SQLException {
		return new ProductDAO().addProduct(p);
	}
    public void displayProducts(List<Product> productList) throws ClassNotFoundException, SQLException{
        if(productList.size()>0){
            System.out.println("Product Details");
            System.out.format("%-5s %-30s %-10s %-10s %-15s %-30s %-15s %-10s %-10s %-10s %-15s\n","Id","Name","Color","Brand","Product Type","Product Category","Area","Sector","Material","Rate","Dimensions");
            for(Product p:productList){
                System.out.format("%-5s %-30s %-10s %-10s %-15s %-30s %-15s %-10s %-10s %-10s %-15s\n",p.getId(),p.getName(),p.getColor(),p.getBrand().getName(),
                        p.getProductType().getType(),p.getProductCategory().getCategory(),p.getCatalogServiceArea().getCategory(),p.getCatalogServiceSector().getName(),
                        p.getMaterial().getName(),new ProductRateBO().obtainProductRateByProduct(p).getRate(),p.getDimensions());
            }
        }else{
            System.out.println("No products found");
        }
    }
}
