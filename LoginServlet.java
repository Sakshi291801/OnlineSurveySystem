package com.demo.Survey;


	@WebServlet("/login")
	public class LoginServlet extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	        if (isValidUser(username, password)) {
	            HttpSession session = request.getSession();
	            session.setAttribute("username", username);
	            response.sendRedirect("/dashboard");
	        } else {
	            request.setAttribute("error", "Invalid username or password");
	            request.getRequestDispatcher("/login.jsp").forward(request, response); 
	        }
	    }

	    private boolean isValidUser(String username, String password) {
	    }
	}

	@WebServlet("/dashboard")
	public class DashboardServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session = request.getSession(false);
	        if (session != null && session.getAttribute("username") != null) {
	            request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
	        } else {
	            response.sendRedirect("/login");
	        }
	    }
	}

}
