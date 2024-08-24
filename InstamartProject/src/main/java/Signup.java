import java.io.IOException;

import java.sql.SQLException;
 
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
 
import BO.UserBO;

import Domain.User;
 
/**

* Servlet implementation class SignUp

*/

public class Signup extends HttpServlet {

	private static final long serialVersionUID = 1L;

    /**

     * @see HttpServlet#HttpServlet()

     */

    public Signup() {

        super();

        // TODO Auto-generated constructor stub

    }
 
	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}
 
	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserBO userbo=new UserBO();

		User u=new User();
 
		//u.setId(2);

		u.setFirstName(request.getParameter("firstname"));

		u.setLastName(request.getParameter("lastname"));

		u.setUsername(request.getParameter("username"));

		u.setEmail(request.getParameter("email"));

		u.setPassword(request.getParameter("password"));

		try {

			userbo.createUser(u);

		System.out.println("Error");

			RequestDispatcher rd=request.getRequestDispatcher("profileDetails.jsp");

			rd.forward(request, response);

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SQLException e) {

			System.out.println("error");

			e.printStackTrace();

		}

		//doGet(request, response);

	}
 
}

