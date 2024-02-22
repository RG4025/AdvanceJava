package SecondPackage;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstClass")
public class FirstClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FirstClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("the init method is called!!");
	}


	public void destroy() {
		System.out.println("the destroy method is called!!");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("the service method is called!!");
	}

}
