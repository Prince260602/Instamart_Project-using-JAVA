package BO;

import java.sql.SQLException;
import java.util.ArrayList;

import DAO.AddressDAO;
import Domain.Address;

public class AddressBO {
	public Address findById(Integer id) throws ClassNotFoundException, SQLException{
		return new AddressDAO().findById(id);
	}
	
	public ArrayList<Address> findByUserId(Integer userId) throws ClassNotFoundException, SQLException{
		return new AddressDAO().findByUserId(userId);
	}
	
	public ArrayList<Address> findByUserId(Integer userId, String city) throws ClassNotFoundException, SQLException{
		return new AddressDAO().findByUserId(userId, city);
	}
	
	public Address create(Address address,Integer userId) throws ClassNotFoundException, SQLException{
		return new AddressDAO().create(address,userId);		
	}
	
	public void display(ArrayList<Address>addressList){
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %s","Address Id", "Street","City","State","Country","Pincode"));
		for(int i =0;i<addressList.size();i++){
			System.out.println(addressList.get(i));
		}
	}
}
