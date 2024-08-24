package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.Company;


public class CompanyDAO {
	public Company getCompany() throws ClassNotFoundException, SQLException{
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from company where id = 1");
		ResultSet rs = ps.executeQuery();
		Company company = null;
		if(rs.next()){
			company = new Company(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		return company;
		
	}
}
