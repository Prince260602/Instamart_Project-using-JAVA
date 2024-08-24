package BO;

import DAO.BrandDAO;
import DAO.MaterialDAO;
import Domain.Brand;
import Domain.Material;

import java.sql.SQLException;
import java.util.List;

public class MaterialBO {
    public Material obtainMaterialById(Integer id) throws ClassNotFoundException, SQLException{
        MaterialDAO materialDAO = new MaterialDAO();
        return materialDAO.obtainMaterialById(id);
    }
    public Material obtainMaterialByName(String name) throws ClassNotFoundException, SQLException{
        MaterialDAO materialDAO = new MaterialDAO();
        return materialDAO.obtainMaterialByName(name);
    }
    public List<Material> listMaterials() throws ClassNotFoundException, SQLException{
		return new MaterialDAO().listMaterials();
	}
}
