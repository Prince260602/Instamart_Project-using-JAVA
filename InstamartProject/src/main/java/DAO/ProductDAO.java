
package DAO;

import BO.*;
import Domain.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BO.BrandBO;
import BO.CatalogServiceAreaBO;
import BO.CatalogServiceSectorBO;
import BO.MaterialBO;
import BO.ProductCategoryBO;
import BO.ProductTypeBO;
import Domain.Brand;
import Domain.CatalogServiceArea;
import Domain.CatalogServiceSector;
import Domain.Material;
import Domain.Product;
import Domain.ProductCategory;
import Domain.ProductType;

public class ProductDAO {
	public Product findById(Integer id) throws ClassNotFoundException, SQLException{
		Connection connection = DBConnection.getConnection();
	    PreparedStatement ps = connection.prepareStatement("select * from product where id = ?");
	   

          //fill your code here


	    connection.close();
	    return null;
	}
	

    
    public List<Product> obtainAvailableProduct(String city) throws ClassNotFoundException, SQLException{
        List<Product> productList = new ArrayList<Product>();
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productList;
    }
    public List<Product> obtainAllProducts(boolean visibilty,boolean availability) throws ClassNotFoundException, SQLException{
        List<Product> productList = new ArrayList<Product>();
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productList;
    }
    public List<Product> obtainAllProductsForManager() throws ClassNotFoundException, SQLException{
        List<Product> productList = new ArrayList<Product>();
        Connection connection = DBConnection.getConnection();
       
        //fill your code here

        connection.close();
        return productList;
    }
    public List<Product> getProductsByOrder(Integer orderDetailId) throws ClassNotFoundException, SQLException {
        List<Product> productList = new ArrayList<Product>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from product inner join order_detail_product on product.id=order_detail_product.product_id where order_detail_product.order_detail_id="+orderDetailId+";");
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()){
            Brand brand = new BrandBO().obtainBrandById(rs.getInt("brand_id"));
            ProductType productType = new ProductTypeBO().obtainProductTypeById(rs.getInt("product_type_id"));
            ProductCategory productCategory = new ProductCategoryBO().obtainProductCategoryById(rs.getInt("product_category_id"));
            CatalogServiceSector css = new CatalogServiceSectorBO().obtainCatalogServiceSectorById(rs.getInt("catalog_service_sector_id"));
            CatalogServiceArea csa = new CatalogServiceAreaBO().obtainCatalogServiceAreaById(rs.getInt("catalog_service_area_id"));
            Material material = new MaterialBO().obtainMaterialById(rs.getInt("material_id"));
            Product p=new Product(rs.getInt("id"), rs.getString("name"), brand, productType, productCategory, css, csa, rs.getString("color"), material, rs.getString("dimensions"), rs.getBoolean("is_visible"), rs.getBoolean("is_available"),rs.getString("city"),rs.getString("image_url"));
            ProductRate productRate = new ProductRateBO().obtainProductRateByProduct(p);
            productList.add(p);
        }
        connection.close();
        return productList;
    }

    public List<Product> getProductsByPackage(Integer packageId) throws ClassNotFoundException, SQLException {
        List<Product> productList = new ArrayList<Product>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from product inner join rental_package_product as pp on product.id=pp.product_id where pp.package_id="+packageId+";");
        ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
            Brand brand = new BrandBO().obtainBrandById(rs.getInt("brand_id"));
            ProductType productType = new ProductTypeBO().obtainProductTypeById(rs.getInt("product_type_id"));
            ProductCategory productCategory = new ProductCategoryBO().obtainProductCategoryById(rs.getInt("product_category_id"));
            CatalogServiceSector css = new CatalogServiceSectorBO().obtainCatalogServiceSectorById(rs.getInt("catalog_service_sector_id"));
            CatalogServiceArea csa = new CatalogServiceAreaBO().obtainCatalogServiceAreaById(rs.getInt("catalog_service_area_id"));
            Material material = new MaterialBO().obtainMaterialById(rs.getInt("material_id"));
            Product p=new Product(rs.getInt("id"), rs.getString("name"), brand, productType, productCategory, css, csa, rs.getString("color"), material, rs.getString("dimensions"), rs.getBoolean("is_visible"), rs.getBoolean("is_available"),rs.getString("city"),rs.getString("image_url"));
            ProductRate productRate = new ProductRateBO().obtainProductRateByProduct(p);
            productList.add(p);
        }
        connection.close();
        return productList;
    }
    public Product addProduct(Product p) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		
                //fill your code here

		con.close();
		return p;
	}
}
