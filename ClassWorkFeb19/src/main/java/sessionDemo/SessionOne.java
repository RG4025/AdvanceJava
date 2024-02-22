package sessionDemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionOne")
public class SessionOne extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("uName");
		String userPass = request.getParameter("uPass");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("uName", userName);
		session.setAttribute("uPass", userPass);
		
		response.sendRedirect("SessionTwo");
		
	}

}