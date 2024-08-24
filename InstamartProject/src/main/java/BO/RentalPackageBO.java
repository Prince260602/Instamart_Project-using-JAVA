
package BO;

import DAO.RentalPackageDAO;
import DAO.UserDAO;
import Domain.Product;
import Domain.RentalPackage;
import Domain.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class RentalPackageBO {

    public List<RentalPackage> getRentalPackagesByOrder(Integer orderDetailId) throws SQLException, ClassNotFoundException {
        RentalPackageDAO rentalPackageDAO=new RentalPackageDAO();
        return rentalPackageDAO.getRentalPackagesByOrder(orderDetailId);
    }
    
    public List<RentalPackage> getAvailableRentalPackages(String city) throws ClassNotFoundException, SQLException{
    	return new RentalPackageDAO().getAvailableRentalPackages(city);
    }
    public List<RentalPackage> obtainAllPackages(boolean visibility,boolean availability) throws ClassNotFoundException, SQLException{
    	return new RentalPackageDAO().obtainAllPackages(visibility,availability);
    }
    public List<RentalPackage> obtainAllPackagesForManager() throws ClassNotFoundException, SQLException{
    	return new RentalPackageDAO().obtainAllPackagesForManager();
    }
    
    public RentalPackage findById(Integer id) throws ClassNotFoundException, SQLException{
    	return new RentalPackageDAO().findById(id);
    }
    
    public void updateVisibility(RentalPackage pack) throws SQLException, ClassNotFoundException{
		new RentalPackageDAO().updateVisibility(pack);
	}
    
}
