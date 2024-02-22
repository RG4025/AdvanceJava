package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainFirst")
public class MainFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainFirst() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("FName");
		String LName = (request.getParameter("LName"));
		int age = Integer.parseInt(request.getParameter("age"));
		String add = (request.getParameter("add"));
		
		PrintWriter out = response.getWriter();
		out.printf("Student Details \n First Name : %s\n Last Name : %s \n Age : %d \n Address : %s ",name, LName,age,add);
	}

}
