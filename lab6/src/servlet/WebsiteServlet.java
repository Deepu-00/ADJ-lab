package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WebsiteServelet")
public class WebsiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebsiteServlet() {
super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("Websites");
		
		if(value.equals("google")) {
			response.sendRedirect("https://www.google.com");
		}
		else if(value.equals("gmail")) {
			response.sendRedirect("https://mail.google.com/mail/u/0/#inbox");
		}
		else if(value.equals("instagram")) {
			response.sendRedirect("https://www.instagram.com/");
		}
		else if(value.equals("mongoDB")) {
			response.sendRedirect("https://www.mongodb.com/");
		}
		else if(value.equals("svecw")) {
			response.sendRedirect("http://svecw.edu.in/");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}