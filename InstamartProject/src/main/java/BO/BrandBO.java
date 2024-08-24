package BO;

import DAO.BrandDAO;
import Domain.Brand;

import java.sql.SQLException;
import java.util.List;

public class BrandBO {
    public Brand obtainBrandById(Integer id) throws ClassNotFoundException, SQLException{
        BrandDAO brandDAO = new BrandDAO();
        return brandDAO.obtainBrandById(id);
    }
    public Brand obtainBrandByName(String name) throws ClassNotFoundException, SQLException{
        BrandDAO brandDAO = new BrandDAO();
        return brandDAO.obtainBrandByName(name);
    }
    public List<Brand> listBrands() throws ClassNotFoundException, SQLException{
		return new BrandDAO().listBrands();
	}
}
