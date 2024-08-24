package BO;

import DAO.CatalogServiceAreaDAO;
import Domain.CatalogServiceArea;
import Domain.CatalogServiceSector;

import java.sql.SQLException;
import java.util.List;

public class CatalogServiceAreaBO {
    public CatalogServiceArea obtainCatalogServiceAreaById(Integer id) throws ClassNotFoundException, SQLException{
        CatalogServiceAreaDAO csaDAO = new CatalogServiceAreaDAO();
        return csaDAO.obtainCatalogServiceAreaById(id);
    }
public List<CatalogServiceArea> listServiceArea(CatalogServiceSector serviceSector) throws ClassNotFoundException, SQLException{
		
		return new CatalogServiceAreaDAO().listServiceArea(serviceSector);
	}
public List<CatalogServiceArea> obtainCatalogServiceList() throws ClassNotFoundException, SQLException{
	
	return new CatalogServiceAreaDAO().obtainCatalogServiceList();
}
public CatalogServiceArea obtaincatalogServiceAreaByCategory(String category) throws ClassNotFoundException, SQLException{
    CatalogServiceAreaDAO csaDAO = new CatalogServiceAreaDAO();
    return csaDAO.obtainCatalogServiceAreaByCategory(category);
}

}
