
package DAO;

import Domain.RentalPackageRate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class RentalPackageRateDAO {
 
    public Map<Integer,Integer> findPackageRate() throws ClassNotFoundException, SQLException{
        Map<Integer,Integer> rateMap = new HashMap<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from rental_package_rate where end_date is null");
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()){
            rateMap.put(rs.getInt("rental_package_id"),rs.getInt("rate"));
        }
        connection.close();
        return rateMap;
    }
}
