package BO;


import DAO.CatalogServiceSectorDAO;
import Domain.CatalogServiceSector;
import java.sql.SQLException;
import java.util.List;

public class CatalogServiceSectorBO {
    public CatalogServiceSector obtainCatalogServiceSectorById(Integer id) throws ClassNotFoundException, SQLException{
        CatalogServiceSectorDAO cssDAO = new CatalogServiceSectorDAO();
        return cssDAO.obtainCatalogServiceSectorById(id);
    }
public List<CatalogServiceSector> listServiceSector() throws ClassNotFoundException, SQLException{
		
		return new CatalogServiceSectorDAO().listServiceSector();
	}
public CatalogServiceSector obtaincatalogServiceSectorByName(String name) throws ClassNotFoundException, SQLException{
    CatalogServiceSectorDAO cssDAO = new CatalogServiceSectorDAO();
    return cssDAO.obtainCatalogServiceSectorByName(name);
}

}
