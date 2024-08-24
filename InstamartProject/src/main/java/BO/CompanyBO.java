package BO;

import java.sql.SQLException;

import DAO.CompanyDAO;
import Domain.Company;

public class CompanyBO {
	public Company getCompany() throws ClassNotFoundException, SQLException{
		return new CompanyDAO().getCompany();
	}
}
