import java.io.IOException;

import java.sql.SQLException;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;
 
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
 
import BO.UserBO;

import Domain.Address;

import Domain.User;
 
/**

* Servlet implementation class UpdateDetail

*/

public class UpdateDetail extends HttpServlet {

	private static final long serialVersionUID = 1L;

    /**

     * @see HttpServlet#HttpServlet()

     */

    public UpdateDetail() {

        super();

        // TODO Auto-generated constructor stub

    }
 
	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserBO userbo=new UserBO();

		User u=new User();

		//stmt.executeUpdate("update user set dob='"+new java.sql.Date(user.getDob().getTime())+"', age="+user.getAge()+", contact_no='"+user.getContactNo()+"' where id="+user.getId()+";");

		u.setId(1);;

		u.setAge(Integer.parseInt(request.getParameter("age")));

		  Date date1;

		try {

			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dob"));

			u.setDob(date1);

			u.setContactNo(request.getParameter("contactNo"));

			userbo.updateContactDetail(u);

		} 

		/*

		Address add=new Address();

		add.setCity(request.getParameter("city"));

		add.setCountry(request.getParameter("country"));

		add.setState(request.getParameter("state"));

		add.setPincode(Integer.parseInt(request.getParameter("pincode")));

		add.setStreet(request.getParameter("street"));

		*/


		 catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		catch (ParseException e) {

			e.printStackTrace();

		}


		response.getWriter().append("Served at: ").append(request.getContextPath());

	}
 
	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		doGet(request, response);

	}
 
}
