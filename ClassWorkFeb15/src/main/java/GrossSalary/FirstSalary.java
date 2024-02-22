package GrossSalary;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstSalary")
public class FirstSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FirstSalary() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		
		int sal = Integer.parseInt(request.getParameter("sal"));
		
		Float bonus = (float) (sal * 0.40) + sal;
		
		
		out.printf("Hey! %s your total salary is : %s", name,bonus);
	}

}
