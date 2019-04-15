package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/views/*")
public class ViewResolverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PREFIX = "/WEB-INF";
	private static final String SUFFIX = ".jsp";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		uri = PREFIX + uri + SUFFIX;
		
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
		/*
		 * PrintWriter pw = response.getWriter(); PrintWriter pw2 =
		 * response.getWriter(); pw.println("아~ 응~그래 아냐~~"); pw.println("내일 보자 바이~");
		 * String q1 = request.getParameter("q1"); if(q1==null) { return; }
		 * //pw.close();
		 * 
		 * pw2.println("난 pw2야"); pw.println("<br>."); pw.println("<br>.");
		 * pw.println("<br>."); pw.println("<br>."); pw.println("<br>.");
		 * pw.println("끊은줄 알았찌?"); System.out.println("난 안끝났어");
		 */
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
