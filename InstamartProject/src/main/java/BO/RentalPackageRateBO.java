package BO;

import DAO.ProductRateDAO;
import DAO.RentalPackageRateDAO;
import Domain.RentalPackageRate;
import java.sql.SQLException;
import java.util.Map;

public class RentalPackageRateBO {
      
    public Map<Integer,Integer> findPackageRate() throws ClassNotFoundException, SQLException{
        RentalPackageRateDAO rentalPackageRateDAO = new RentalPackageRateDAO();
        return rentalPackageRateDAO.findPackageRate();
    }
}
