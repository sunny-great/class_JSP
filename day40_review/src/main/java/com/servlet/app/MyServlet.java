package com.servlet.app;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		request.setAttribute("userAge", request.getParameter("userAge"));
		request.setAttribute("userAge", Integer.parseInt(request.getParameter("userAge")) - 1);
		
		String userGender = request.getParameter("userGender");
		String gender = null;
		switch(userGender) {
		case "N":
			gender = "선택안함";
			break;
		case "M":
			gender = "남자";
			break;
		case "F":
			gender = "여자";
			break;
		}
		
		request.setAttribute("userGender", gender);
		
		System.out.println(request.getParameterValues("color"));
		String[] colors = request.getParameterValues("color");
		System.out.println(Arrays.toString(colors));

		request.getRequestDispatcher("result.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
