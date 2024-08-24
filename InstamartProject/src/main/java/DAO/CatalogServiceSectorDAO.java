package DAO;

import Domain.CatalogServiceSector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogServiceSectorDAO {
    public CatalogServiceSector obtainCatalogServiceSectorById(Integer id) throws ClassNotFoundException, SQLException{
        CatalogServiceSector catalogServiceSector = new CatalogServiceSector();
        Connection connection = DBConnection.getConnection();
       

        //fill your code here


        return catalogServiceSector;
    }
    public CatalogServiceSector obtainCatalogServiceSectorByName(String name) throws ClassNotFoundException, SQLException{
        CatalogServiceSector catalogServiceSector = new CatalogServiceSector();
        Connection connection = DBConnection.getConnection();


        //fill your code here       


        return catalogServiceSector;
    }
    public List<CatalogServiceSector> listServiceSector() throws ClassNotFoundException, SQLException{
		List<CatalogServiceSector> serviceSectors = new ArrayList<CatalogServiceSector>();
		Connection con = DBConnection.getConnection();
		
              //fill your code here


		return serviceSectors;
	}
}
