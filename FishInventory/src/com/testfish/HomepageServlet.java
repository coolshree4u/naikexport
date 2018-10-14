package com.testfish;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HomepageServlet
 */
@WebServlet("/HomepageServlet")
public class HomepageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomepageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String qryStr = "";
	    Statement stmt = null;
	    ResultSet rs = null;
	   // res.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    Connection conn = null;
	       //using movie_resolved view
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");  
	    	conn=DriverManager.getConnection(  
	    			"jdbc:mysql://localhost:3306/fishtest","root","root");  
	      // Get a Connection to the database
	     // Create a Statement object
	      stmt = conn.createStatement();
	      // Execute an SQL query, get a ResultSet
	      qryStr = "SELECT * from packaging_material";
	      
	      rs = stmt.executeQuery(qryStr); 
	      
	     if (rs.next())
	      {
	      
	    	 PackagingMaterial pkg_mtr = new PackagingMaterial(rs);
	        request.setAttribute("package", pkg_mtr);
	        RequestDispatcher view = request.getRequestDispatcher("show_data.jsp");
	          view.forward(request, response);
	      }
	     
	     
	    }
	    catch(ClassNotFoundException e) {
	     out.println("Couldn't load database driver: " + e.getMessage());
	    }
	    catch(SQLException e) {
	      e.printStackTrace();
	      out.println("SQLException caught: " + e.getMessage());
	    }
	    finally {
	      // Always close the database connection.
	      try {
	        if (conn != null) conn.close();
	      }
	      catch (SQLException ignored) { }
	   }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
