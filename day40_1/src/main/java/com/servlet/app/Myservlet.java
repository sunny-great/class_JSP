package com.servlet.app;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
//@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//이름, 나이
//		String userName = request.getParameter("userName");
//		String userAge = request.getParameter("userAge");
//		
//		request.setAttribute("userName", userName);
//		request.setAttribute("userAge", userAge);
//		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//post방식을 사용하는 경우 request의 인코딩 방식을 별도로 설정해야한다
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String userAge = request.getParameter("userAge");
		
		//인코딩 방식 변경
		String encodedUserName = URLEncoder.encode(userName, "UTF-8");
		String encodedUserAge = URLEncoder.encode(userAge, "UTF-8");
		
//		request.setAttribute("userName", userName);
//		request.setAttribute("userAge", userAge);
//		request.getRequestDispatcher("result.jsp").forward(request, response);
		
		//리다이렉트 대상 URL 생성(쿼리 파라미터로 전달)
		String redirectURL = String.format("result.jsp?userName=%s&userAge=%s", encodedUserName, encodedUserAge);
		//클라이언트를 result.jsp로 리다이렉트
		response.sendRedirect(redirectURL);
		
	}

}
