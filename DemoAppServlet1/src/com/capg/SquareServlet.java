package com.capg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
/*//request dispatcher
	int k =(int) req.getAttribute("k");
	k=k*k;
		PrintWriter out = res.getWriter();
		out.println("result is :"+k );*/
		
	
	//sendredirect
	/*int k =Integer.parseInt(req.getParameter("k"));
	k=k*k;
		PrintWriter out = res.getWriter();
		out.println("result is :"+k );
		System.out.println("square servlet called");
		*/
		//Session
		/*HttpSession session =req.getSession();
		int k =(int) session.getAttribute("k");
		k= k*k;

		PrintWriter out = res.getWriter();
		out.println("result is :"+k );*/
		
		//cookies
		int k=0;
		Cookie cookies[]=req.getCookies();
		for (Cookie c : cookies) {
			{
				if(c.getName().equals("k")) {
					k=Integer.parseInt(c.getValue());
				}
			}k= k*k;

			PrintWriter out = res.getWriter();
			out.println("result is :"+k );
			
			
		}
		
	}	
	

}
