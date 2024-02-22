package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Name")
public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Name() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("FName");
		String lastName = request.getParameter("LName");
		
		PrintWriter out = response.getWriter();
		out.printf("Hello %s %s!!",name,lastName);
		
	}

}
