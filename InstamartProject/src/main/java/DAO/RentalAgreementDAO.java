package DAO;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;



import Domain.RentalAgreement;

public class RentalAgreementDAO {
	public RentalAgreement save(RentalAgreement rentalAgreement) throws SQLException, ClassNotFoundException{
		Connection con = DBConnection.getConnection();
		
               //fill your code here

		return rentalAgreement;
		
	}
	
}
