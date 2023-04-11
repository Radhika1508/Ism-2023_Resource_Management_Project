package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AdminBean;
import dao.AdminDao;

@WebServlet("/AdminAuthentication")
public class AdminAuthentication extends HttpServlet {
		
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			System.out.println("email : "+email);
			System.out.println("password : "+password);
		
			
			if(email==null || password == null || email.trim().length()==0 || password.trim().length()==0)
			{
				req.setAttribute("error", "Please Enter The Credentials..!!");
				req.getRequestDispatcher("AdminLogin.jsp").forward(req, resp);
			}
			else 
			{
				AdminDao dao =  new AdminDao();
				AdminBean bean = dao.adminAuthentication(email, password);
			
				RequestDispatcher rd = null;
				if(bean == null)
				{
					req.setAttribute("error", "Please Enter The Valid Credentials..!!");
					
					rd = req.getRequestDispatcher("AdminLogin.jsp");
				}
				else 
				{
					rd = req.getRequestDispatcher("AdminDashboard.jsp");
				}
				rd.forward(req, resp);
			}	
		}
	}


