package LoginFormMain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainClass")
public class MainClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MainClass() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		String uName = "rushi";
		String uPass = "rushi";
		
		if(name.equals(uName) && pass.equals(uPass)) {
			
			out.println("Login success!");
		}
		else {
			if(!name.equals(uName)) {
				out.println("Invalid User Name!");
				
			}
			
			if(!pass.equals(uPass)) {
				
				out.println("Invalid Password!");
			}else {
				out.println("Something get Whrong!");
			}
		}
		
	}

}
