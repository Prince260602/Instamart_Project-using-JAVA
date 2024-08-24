package BO;

import java.sql.SQLException;
import java.util.ArrayList;

import DAO.DiscountDAO;
import Domain.Discount;

public class DiscountBO {
	
	public ArrayList<Discount> listAllDiscount() throws ClassNotFoundException, SQLException{
		return new DiscountDAO().listAllDiscount();
	}
	
	public void displayTenure(ArrayList<Discount> discountList){
		System.out.format("%-10s %-15s %s\n","Id","Tenure(In months)","Discount(%)");
		for(Discount d : discountList){
			System.out.format("%-10s %-15s %s\n", d.getId() , d.getTenure(), d.getPercentage());
		}
	}
	
	public Discount findById(Integer id) throws ClassNotFoundException, SQLException{
		return new DiscountDAO().findById(id);
	}
	
	
}
