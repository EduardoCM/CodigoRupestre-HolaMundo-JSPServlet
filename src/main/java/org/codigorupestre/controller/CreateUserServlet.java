package org.codigorupestre.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/createUser")
public class CreateUserServlet extends HttpServlet {

	private static final long serialVersionUID = -7991498364600321981L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String lastName = req.getParameter("lastName");
		String age = req.getParameter("age");
		String user = req.getParameter("user");
		String email = req.getParameter("email");
		
		System.out.println("Name: " + name);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("User: " + user);
		System.out.println("Email: " + email);
		
		String msj = "Usuario creado";
		
		req.setAttribute("Msj", msj);
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");

		rd.forward(req, resp);
	}

}
