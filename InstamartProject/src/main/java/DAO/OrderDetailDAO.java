package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;

import BO.ProductBO;
import BO.RentalPackageBO;
import Domain.OrderDetail;
import Domain.Product;
import Domain.RentalPackage;

public class OrderDetailDAO {

	public OrderDetail create(OrderDetail order) throws ClassNotFoundException, SQLException{
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into order_detail(user_id, name, contact_no, ordered_date, delivery_date, delivery_time, address_id, cost_per_month) values(?,?,?,?,?,?,?,?)");
		ps.setLong(1, order.getUser().getId());
		ps.setString(2, order.getName());
		ps.setString(3, order.getContactNo());
		ps.setDate(4, new Date(order.getOrderedDate().getTime()));
		ps.setDate(5, new Date(order.getDeliveryDate().getTime()));
		ps.setString(6, order.getDeliveryTime());
		ps.setLong(7, order.getAddress().getId());
		ps.setInt(8, order.getCostPerMonth());
		
		int result = ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();	
		
		if(rs.next()){
			order.setId(rs.getLong(1));
		}
		
		String queryString = "";
		if(order.getProductList().size() > 0){					
			for(Product p : order.getProductList()){
				ps = con.prepareStatement("insert into order_detail_product(order_detail_id,product_id) values(?,?)");
				ps.setLong(1, order.getId());
				ps.setLong(2, p.getId());
				ps.executeUpdate();
			}
			
		}
		queryString = "";
		if(order.getRentalPackageList().size() > 0 ){
			for(RentalPackage pkg : order.getRentalPackageList()){
				ps = con.prepareStatement("insert into order_detail_rental_package(order_detail_id,package_id) values(?,?)");
				ps.setLong(1, order.getId());
				ps.setLong(2, pkg.getId());
				ps.executeUpdate();
			}
			
		}
		
		con.close();
		return order;
	}
	
	public OrderDetail findById(Integer id) throws Exception{
		
		
		ArrayList<Product> productList = (ArrayList<Product>) new ProductBO().getProductsByOrder(id);

		ArrayList<RentalPackage> packageList = (ArrayList<RentalPackage>) new RentalPackageBO().getRentalPackagesByOrder(id);
				

		Connection con = DBConnection.getConnection();
		
               //fill your code here
		
		con.close();
		return null;
	}
}
