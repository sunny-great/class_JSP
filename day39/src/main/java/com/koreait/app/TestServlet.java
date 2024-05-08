package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */

//클래스와 URL 매핑하는 어노테이션
@WebServlet("/Hello")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	//기본생성자
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//응답하는 컨텐츠가 HTML이고 문자 인코딩은 UTF-8을 사용할 것이라고 설정한다
		response.setContentType("text/html; charset=UTF-8");
		//PrintWriter 객체를 사용하면 응답에 텍스트 데이터를 추가할 수 있다
		//추가된 데이터는 사용자의 웹 브라우저 화면에 출력된다
		//print() 메소드를 사용하여 출력할 수 있다
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>안녕하세요</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}














