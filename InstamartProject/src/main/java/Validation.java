import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;
 
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
 
import BO.*;

import Domain.*;

import Utility.DBConnection;
 
public class Validation extends HttpServlet {

	private static final long serialVersionUID = 1L;

    /**

     * @see HttpServlet#HttpServlet()

     */

    public Validation() {

        super();

        // TODO Auto-generated constructor stub

    }
 
	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		}
 
	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	        Connection connection=null;

			try {

				connection = DBConnection.getConnection();

	      String username=  request.getParameter("username");

	      String password=request.getParameter("password");

	        PreparedStatement preparedStatement;

		String Query="select * from users where username='"+username+"' and password='"+password+"'";

				preparedStatement = connection.prepareStatement(Query);

				 ResultSet rs = preparedStatement.executeQuery();

 
			        if(rs.next())

			        {

			        	int id=rs.getInt(1);

			        	if(id==1)

			    		{

			    			RequestDispatcher rd=request.getRequestDispatcher("customerHome.jsp");

			    			rd.forward(request, response);

			    		}

			    		else if(id==2) {

			    			RequestDispatcher rd=request.getRequestDispatcher("managerHome.jsp");

			    		rd.forward(request, response);

			    		}

			        }

				else {

					System.out.println("InvalidUser/password");

				}

			} 


			 catch (ClassNotFoundException | SQLException e1) {

					// TODO Auto-generated catch block

					e1.printStackTrace();

				}

		doGet(request, response);

	}
 
}