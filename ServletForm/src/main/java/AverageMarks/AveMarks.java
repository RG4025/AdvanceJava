package AverageMarks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AveMarks
 */
@WebServlet("/AveMarks")
public class AveMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AveMarks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("FName");
		int mark1 = Integer.parseInt(request.getParameter("mark1"));
		int mark2 = Integer.parseInt(request.getParameter("mark2"));
		int mark3 = Integer.parseInt(request.getParameter("mark3"));
		
		PrintWriter out = response.getWriter();
		out.printf("Hello %s, Your average marks is : %d!!",name, (mark1 + mark2 + mark3) / 3);
	}

}
