package DAO;

import Domain.Material;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MaterialDAO {
    public Material obtainMaterialById(Integer id) throws ClassNotFoundException, SQLException{
        Material material = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here


        connection.close();
        return material;
    }
    public Material obtainMaterialByName(String name) throws ClassNotFoundException, SQLException{
        Material material = null;
        Connection connection = DBConnection.getConnection();
       
        //fill your code here


        connection.close();
        return material;
    }
    public List<Material> listMaterials() throws ClassNotFoundException, SQLException{
		List<Material> materials = new ArrayList<Material>();
		Connection con = DBConnection.getConnection();
		
               //fill your code here


		con.close();
		return materials;
	}
}
