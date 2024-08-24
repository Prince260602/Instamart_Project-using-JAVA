package DAO;

import BO.CatalogServiceSectorBO;
import Domain.Brand;
import Domain.CatalogServiceArea;
import Domain.CatalogServiceSector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogServiceAreaDAO {
    public CatalogServiceArea obtainCatalogServiceAreaById(Integer id) throws ClassNotFoundException, SQLException{
        CatalogServiceArea csa = new CatalogServiceArea();
        Connection connection = DBConnection.getConnection();
        
        //fill your code here


        return csa;
    }
    public CatalogServiceArea obtainCatalogServiceAreaByCategory(String category) throws ClassNotFoundException, SQLException{
        CatalogServiceArea csa = new CatalogServiceArea();
        Connection connection = DBConnection.getConnection();
       
        //fill your code here


        return csa;
    }
    public List<CatalogServiceArea> listServiceArea(CatalogServiceSector serviceSector) throws ClassNotFoundException, SQLException{
		List<CatalogServiceArea> serviceAreas = new ArrayList<CatalogServiceArea>();
		Connection con = DBConnection.getConnection();
		
                //fill your code here


		return serviceAreas;
	}
    public List<CatalogServiceArea> obtainCatalogServiceList() throws ClassNotFoundException, SQLException{
		List<CatalogServiceArea> serviceAreas = new ArrayList<CatalogServiceArea>();
		Connection con = DBConnection.getConnection();
		
                //fill your code here

		return serviceAreas;
	}
 
}
