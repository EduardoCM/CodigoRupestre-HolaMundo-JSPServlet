package org.codigorupestre.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codigorupestre.model.Ciudadano;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -1059921544168978527L;

	private static List<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

	String userLogin = "Eduardo";
	String passLogin = "12";
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		response.getWriter().append("Served at: ").append(ciudadanos.toString()).append(request.getContextPath());
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		String user = request.getParameter("user");
		String password = request.getParameter("password");

		System.out.println("User: " + user);
		System.out.println("Password: " + password);
		
		if(user.equals(userLogin) && password.equals(passLogin)) {
			
			System.out.println("Login exitoso");
			
			String userName = "Eduardo Castillo Menza";			
			request.setAttribute("userName", userName);
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}else {
			
			String errorMsj = "Credenciales incorrectas";
			request.setAttribute("Msj", errorMsj);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		
		}
		
	}
	
	
	
	
	/*
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		int edad = Integer.parseInt(request.getParameter("edad"));

		Ciudadano nuevoCiudadano = new Ciudadano();
		nuevoCiudadano.setId(ciudadanos.size() + 1);
		nuevoCiudadano.setNombre(nombre);
		nuevoCiudadano.setApellidos(apellidos);
		nuevoCiudadano.setEdad(edad);

		System.out.println("Nuevo Ciudadano::");
		System.out.println(nuevoCiudadano);

		ciudadanos.add(nuevoCiudadano);
		
		//super.doPost(req, resp);
	}
	*/
	

}
