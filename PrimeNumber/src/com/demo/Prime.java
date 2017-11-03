package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prime
 */
@WebServlet("/Prime")
public class Prime extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		int i = Integer.parseInt(req.getParameter("t1"));
		int j;
		boolean flag = true;
		for(j=2;j<=i/2;j++){
			if(i%j==0){
				flag=false;
				break;
			}
		}
		if(flag==true)
			out.println(i+" is a Prime Number");
		else
			out.println(i+" is not a Prime Number");
	}
}
