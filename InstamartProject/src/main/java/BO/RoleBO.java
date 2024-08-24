package BO;

import java.sql.SQLException;

import DAO.RoleDAO;
import Domain.Role;

public class RoleBO {
	public Role findRoleById(Integer roleId) throws ClassNotFoundException, SQLException {
		return new RoleDAO().findRoleById(roleId);
	}
	public Role getCustomerRole() throws ClassNotFoundException, SQLException {
		return new RoleDAO().getCustomerRole();
	}
}
